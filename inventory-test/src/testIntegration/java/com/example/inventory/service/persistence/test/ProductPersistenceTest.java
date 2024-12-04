/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.inventory.service.persistence.test;

import com.example.inventory.exception.NoSuchProductException;
import com.example.inventory.model.Product;
import com.example.inventory.service.ProductLocalServiceUtil;
import com.example.inventory.service.persistence.ProductPersistence;
import com.example.inventory.service.persistence.ProductUtil;

import com.liferay.arquillian.extension.junit.bridge.junit.Arquillian;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.ProjectionFactoryUtil;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.test.rule.AggregateTestRule;
import com.liferay.portal.kernel.test.util.RandomTestUtil;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.util.IntegerWrapper;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.OrderByComparatorFactoryUtil;
import com.liferay.portal.test.rule.LiferayIntegrationTestRule;
import com.liferay.portal.test.rule.PersistenceTestRule;
import com.liferay.portal.test.rule.TransactionalTestRule;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 * @generated
 */
@RunWith(Arquillian.class)
public class ProductPersistenceTest {

	@ClassRule
	@Rule
	public static final AggregateTestRule aggregateTestRule =
		new AggregateTestRule(
			new LiferayIntegrationTestRule(), PersistenceTestRule.INSTANCE,
			new TransactionalTestRule(
				Propagation.REQUIRED, "com.example.inventory.service"));

	@Before
	public void setUp() {
		_persistence = ProductUtil.getPersistence();

		Class<?> clazz = _persistence.getClass();

		_dynamicQueryClassLoader = clazz.getClassLoader();
	}

	@After
	public void tearDown() throws Exception {
		Iterator<Product> iterator = _products.iterator();

		while (iterator.hasNext()) {
			_persistence.remove(iterator.next());

			iterator.remove();
		}
	}

	@Test
	public void testCreate() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Product product = _persistence.create(pk);

		Assert.assertNotNull(product);

		Assert.assertEquals(product.getPrimaryKey(), pk);
	}

	@Test
	public void testRemove() throws Exception {
		Product newProduct = addProduct();

		_persistence.remove(newProduct);

		Product existingProduct = _persistence.fetchByPrimaryKey(
			newProduct.getPrimaryKey());

		Assert.assertNull(existingProduct);
	}

	@Test
	public void testUpdateNew() throws Exception {
		addProduct();
	}

	@Test
	public void testUpdateExisting() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Product newProduct = _persistence.create(pk);

		newProduct.setCode(RandomTestUtil.randomString());

		newProduct.setName(RandomTestUtil.randomString());

		_products.add(_persistence.update(newProduct));

		Product existingProduct = _persistence.findByPrimaryKey(
			newProduct.getPrimaryKey());

		Assert.assertEquals(existingProduct.getId(), newProduct.getId());
		Assert.assertEquals(existingProduct.getCode(), newProduct.getCode());
		Assert.assertEquals(existingProduct.getName(), newProduct.getName());
	}

	@Test
	public void testCountByCode() throws Exception {
		_persistence.countByCode("");

		_persistence.countByCode("null");

		_persistence.countByCode((String)null);
	}

	@Test
	public void testFindByPrimaryKeyExisting() throws Exception {
		Product newProduct = addProduct();

		Product existingProduct = _persistence.findByPrimaryKey(
			newProduct.getPrimaryKey());

		Assert.assertEquals(existingProduct, newProduct);
	}

	@Test(expected = NoSuchProductException.class)
	public void testFindByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		_persistence.findByPrimaryKey(pk);
	}

	@Test
	public void testFindAll() throws Exception {
		_persistence.findAll(
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, getOrderByComparator());
	}

	protected OrderByComparator<Product> getOrderByComparator() {
		return OrderByComparatorFactoryUtil.create(
			"Inventory_Product", "id", true, "code", true, "name", true);
	}

	@Test
	public void testFetchByPrimaryKeyExisting() throws Exception {
		Product newProduct = addProduct();

		Product existingProduct = _persistence.fetchByPrimaryKey(
			newProduct.getPrimaryKey());

		Assert.assertEquals(existingProduct, newProduct);
	}

	@Test
	public void testFetchByPrimaryKeyMissing() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Product missingProduct = _persistence.fetchByPrimaryKey(pk);

		Assert.assertNull(missingProduct);
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereAllPrimaryKeysExist()
		throws Exception {

		Product newProduct1 = addProduct();
		Product newProduct2 = addProduct();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProduct1.getPrimaryKey());
		primaryKeys.add(newProduct2.getPrimaryKey());

		Map<Serializable, Product> products = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(2, products.size());
		Assert.assertEquals(
			newProduct1, products.get(newProduct1.getPrimaryKey()));
		Assert.assertEquals(
			newProduct2, products.get(newProduct2.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereNoPrimaryKeysExist()
		throws Exception {

		long pk1 = RandomTestUtil.nextLong();

		long pk2 = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(pk1);
		primaryKeys.add(pk2);

		Map<Serializable, Product> products = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(products.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithMultiplePrimaryKeysWhereSomePrimaryKeysExist()
		throws Exception {

		Product newProduct = addProduct();

		long pk = RandomTestUtil.nextLong();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProduct.getPrimaryKey());
		primaryKeys.add(pk);

		Map<Serializable, Product> products = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, products.size());
		Assert.assertEquals(
			newProduct, products.get(newProduct.getPrimaryKey()));
	}

	@Test
	public void testFetchByPrimaryKeysWithNoPrimaryKeys() throws Exception {
		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		Map<Serializable, Product> products = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertTrue(products.isEmpty());
	}

	@Test
	public void testFetchByPrimaryKeysWithOnePrimaryKey() throws Exception {
		Product newProduct = addProduct();

		Set<Serializable> primaryKeys = new HashSet<Serializable>();

		primaryKeys.add(newProduct.getPrimaryKey());

		Map<Serializable, Product> products = _persistence.fetchByPrimaryKeys(
			primaryKeys);

		Assert.assertEquals(1, products.size());
		Assert.assertEquals(
			newProduct, products.get(newProduct.getPrimaryKey()));
	}

	@Test
	public void testActionableDynamicQuery() throws Exception {
		final IntegerWrapper count = new IntegerWrapper();

		ActionableDynamicQuery actionableDynamicQuery =
			ProductLocalServiceUtil.getActionableDynamicQuery();

		actionableDynamicQuery.setPerformActionMethod(
			new ActionableDynamicQuery.PerformActionMethod<Product>() {

				@Override
				public void performAction(Product product) {
					Assert.assertNotNull(product);

					count.increment();
				}

			});

		actionableDynamicQuery.performActions();

		Assert.assertEquals(count.getValue(), _persistence.countAll());
	}

	@Test
	public void testDynamicQueryByPrimaryKeyExisting() throws Exception {
		Product newProduct = addProduct();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Product.class, _dynamicQueryClassLoader);

		dynamicQuery.add(RestrictionsFactoryUtil.eq("id", newProduct.getId()));

		List<Product> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Product existingProduct = result.get(0);

		Assert.assertEquals(existingProduct, newProduct);
	}

	@Test
	public void testDynamicQueryByPrimaryKeyMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Product.class, _dynamicQueryClassLoader);

		dynamicQuery.add(
			RestrictionsFactoryUtil.eq("id", RandomTestUtil.nextLong()));

		List<Product> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	@Test
	public void testDynamicQueryByProjectionExisting() throws Exception {
		Product newProduct = addProduct();

		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Product.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("id"));

		Object newId = newProduct.getId();

		dynamicQuery.add(
			RestrictionsFactoryUtil.in("id", new Object[] {newId}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(1, result.size());

		Object existingId = result.get(0);

		Assert.assertEquals(existingId, newId);
	}

	@Test
	public void testDynamicQueryByProjectionMissing() throws Exception {
		DynamicQuery dynamicQuery = DynamicQueryFactoryUtil.forClass(
			Product.class, _dynamicQueryClassLoader);

		dynamicQuery.setProjection(ProjectionFactoryUtil.property("id"));

		dynamicQuery.add(
			RestrictionsFactoryUtil.in(
				"id", new Object[] {RandomTestUtil.nextLong()}));

		List<Object> result = _persistence.findWithDynamicQuery(dynamicQuery);

		Assert.assertEquals(0, result.size());
	}

	protected Product addProduct() throws Exception {
		long pk = RandomTestUtil.nextLong();

		Product product = _persistence.create(pk);

		product.setCode(RandomTestUtil.randomString());

		product.setName(RandomTestUtil.randomString());

		_products.add(_persistence.update(product));

		return product;
	}

	private List<Product> _products = new ArrayList<Product>();
	private ProductPersistence _persistence;
	private ClassLoader _dynamicQueryClassLoader;

}