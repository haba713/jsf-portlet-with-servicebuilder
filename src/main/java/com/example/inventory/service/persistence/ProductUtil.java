/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.inventory.service.persistence;

import com.example.inventory.model.Product;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * The persistence utility for the product service. This utility wraps <code>com.example.inventory.service.persistence.impl.ProductPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductPersistence
 * @generated
 */
public class ProductUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Product product) {
		getPersistence().clearCache(product);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Product> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Product> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Product> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Product> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Product> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Product update(Product product) {
		return getPersistence().update(product);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Product update(
		Product product, ServiceContext serviceContext) {

		return getPersistence().update(product, serviceContext);
	}

	/**
	 * Returns all the products where code = &#63;.
	 *
	 * @param code the code
	 * @return the matching products
	 */
	public static List<Product> findByCode(String code) {
		return getPersistence().findByCode(code);
	}

	/**
	 * Returns a range of all the products where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductModelImpl</code>.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @return the range of matching products
	 */
	public static List<Product> findByCode(String code, int start, int end) {
		return getPersistence().findByCode(code, start, end);
	}

	/**
	 * Returns an ordered range of all the products where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductModelImpl</code>.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching products
	 */
	public static List<Product> findByCode(
		String code, int start, int end,
		OrderByComparator<Product> orderByComparator) {

		return getPersistence().findByCode(code, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the products where code = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductModelImpl</code>.
	 * </p>
	 *
	 * @param code the code
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching products
	 */
	public static List<Product> findByCode(
		String code, int start, int end,
		OrderByComparator<Product> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByCode(
			code, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first product in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product
	 * @throws NoSuchProductException if a matching product could not be found
	 */
	public static Product findByCode_First(
			String code, OrderByComparator<Product> orderByComparator)
		throws com.example.inventory.exception.NoSuchProductException {

		return getPersistence().findByCode_First(code, orderByComparator);
	}

	/**
	 * Returns the first product in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product, or <code>null</code> if a matching product could not be found
	 */
	public static Product fetchByCode_First(
		String code, OrderByComparator<Product> orderByComparator) {

		return getPersistence().fetchByCode_First(code, orderByComparator);
	}

	/**
	 * Returns the last product in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product
	 * @throws NoSuchProductException if a matching product could not be found
	 */
	public static Product findByCode_Last(
			String code, OrderByComparator<Product> orderByComparator)
		throws com.example.inventory.exception.NoSuchProductException {

		return getPersistence().findByCode_Last(code, orderByComparator);
	}

	/**
	 * Returns the last product in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product, or <code>null</code> if a matching product could not be found
	 */
	public static Product fetchByCode_Last(
		String code, OrderByComparator<Product> orderByComparator) {

		return getPersistence().fetchByCode_Last(code, orderByComparator);
	}

	/**
	 * Returns the products before and after the current product in the ordered set where code = &#63;.
	 *
	 * @param id the primary key of the current product
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next product
	 * @throws NoSuchProductException if a product with the primary key could not be found
	 */
	public static Product[] findByCode_PrevAndNext(
			long id, String code, OrderByComparator<Product> orderByComparator)
		throws com.example.inventory.exception.NoSuchProductException {

		return getPersistence().findByCode_PrevAndNext(
			id, code, orderByComparator);
	}

	/**
	 * Removes all the products where code = &#63; from the database.
	 *
	 * @param code the code
	 */
	public static void removeByCode(String code) {
		getPersistence().removeByCode(code);
	}

	/**
	 * Returns the number of products where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching products
	 */
	public static int countByCode(String code) {
		return getPersistence().countByCode(code);
	}

	/**
	 * Caches the product in the entity cache if it is enabled.
	 *
	 * @param product the product
	 */
	public static void cacheResult(Product product) {
		getPersistence().cacheResult(product);
	}

	/**
	 * Caches the products in the entity cache if it is enabled.
	 *
	 * @param products the products
	 */
	public static void cacheResult(List<Product> products) {
		getPersistence().cacheResult(products);
	}

	/**
	 * Creates a new product with the primary key. Does not add the product to the database.
	 *
	 * @param id the primary key for the new product
	 * @return the new product
	 */
	public static Product create(long id) {
		return getPersistence().create(id);
	}

	/**
	 * Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the product
	 * @return the product that was removed
	 * @throws NoSuchProductException if a product with the primary key could not be found
	 */
	public static Product remove(long id)
		throws com.example.inventory.exception.NoSuchProductException {

		return getPersistence().remove(id);
	}

	public static Product updateImpl(Product product) {
		return getPersistence().updateImpl(product);
	}

	/**
	 * Returns the product with the primary key or throws a <code>NoSuchProductException</code> if it could not be found.
	 *
	 * @param id the primary key of the product
	 * @return the product
	 * @throws NoSuchProductException if a product with the primary key could not be found
	 */
	public static Product findByPrimaryKey(long id)
		throws com.example.inventory.exception.NoSuchProductException {

		return getPersistence().findByPrimaryKey(id);
	}

	/**
	 * Returns the product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the product
	 * @return the product, or <code>null</code> if a product with the primary key could not be found
	 */
	public static Product fetchByPrimaryKey(long id) {
		return getPersistence().fetchByPrimaryKey(id);
	}

	/**
	 * Returns all the products.
	 *
	 * @return the products
	 */
	public static List<Product> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @return the range of products
	 */
	public static List<Product> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of products
	 */
	public static List<Product> findAll(
		int start, int end, OrderByComparator<Product> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the products.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ProductModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of products
	 * @param end the upper bound of the range of products (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of products
	 */
	public static List<Product> findAll(
		int start, int end, OrderByComparator<Product> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the products from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of products.
	 *
	 * @return the number of products
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ProductPersistence getPersistence() {
		return _persistence;
	}

	public static void setPersistence(ProductPersistence persistence) {
		_persistence = persistence;
	}

	private static volatile ProductPersistence _persistence;

}