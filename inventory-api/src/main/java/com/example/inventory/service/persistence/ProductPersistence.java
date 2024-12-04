/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.inventory.service.persistence;

import com.example.inventory.exception.NoSuchProductException;
import com.example.inventory.model.Product;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the product service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ProductUtil
 * @generated
 */
@ProviderType
public interface ProductPersistence extends BasePersistence<Product> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ProductUtil} to access the product persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the products where code = &#63;.
	 *
	 * @param code the code
	 * @return the matching products
	 */
	public java.util.List<Product> findByCode(String code);

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
	public java.util.List<Product> findByCode(String code, int start, int end);

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
	public java.util.List<Product> findByCode(
		String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Product>
			orderByComparator);

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
	public java.util.List<Product> findByCode(
		String code, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Product>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first product in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product
	 * @throws NoSuchProductException if a matching product could not be found
	 */
	public Product findByCode_First(
			String code,
			com.liferay.portal.kernel.util.OrderByComparator<Product>
				orderByComparator)
		throws NoSuchProductException;

	/**
	 * Returns the first product in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching product, or <code>null</code> if a matching product could not be found
	 */
	public Product fetchByCode_First(
		String code,
		com.liferay.portal.kernel.util.OrderByComparator<Product>
			orderByComparator);

	/**
	 * Returns the last product in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product
	 * @throws NoSuchProductException if a matching product could not be found
	 */
	public Product findByCode_Last(
			String code,
			com.liferay.portal.kernel.util.OrderByComparator<Product>
				orderByComparator)
		throws NoSuchProductException;

	/**
	 * Returns the last product in the ordered set where code = &#63;.
	 *
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching product, or <code>null</code> if a matching product could not be found
	 */
	public Product fetchByCode_Last(
		String code,
		com.liferay.portal.kernel.util.OrderByComparator<Product>
			orderByComparator);

	/**
	 * Returns the products before and after the current product in the ordered set where code = &#63;.
	 *
	 * @param id the primary key of the current product
	 * @param code the code
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next product
	 * @throws NoSuchProductException if a product with the primary key could not be found
	 */
	public Product[] findByCode_PrevAndNext(
			long id, String code,
			com.liferay.portal.kernel.util.OrderByComparator<Product>
				orderByComparator)
		throws NoSuchProductException;

	/**
	 * Removes all the products where code = &#63; from the database.
	 *
	 * @param code the code
	 */
	public void removeByCode(String code);

	/**
	 * Returns the number of products where code = &#63;.
	 *
	 * @param code the code
	 * @return the number of matching products
	 */
	public int countByCode(String code);

	/**
	 * Caches the product in the entity cache if it is enabled.
	 *
	 * @param product the product
	 */
	public void cacheResult(Product product);

	/**
	 * Caches the products in the entity cache if it is enabled.
	 *
	 * @param products the products
	 */
	public void cacheResult(java.util.List<Product> products);

	/**
	 * Creates a new product with the primary key. Does not add the product to the database.
	 *
	 * @param id the primary key for the new product
	 * @return the new product
	 */
	public Product create(long id);

	/**
	 * Removes the product with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param id the primary key of the product
	 * @return the product that was removed
	 * @throws NoSuchProductException if a product with the primary key could not be found
	 */
	public Product remove(long id) throws NoSuchProductException;

	public Product updateImpl(Product product);

	/**
	 * Returns the product with the primary key or throws a <code>NoSuchProductException</code> if it could not be found.
	 *
	 * @param id the primary key of the product
	 * @return the product
	 * @throws NoSuchProductException if a product with the primary key could not be found
	 */
	public Product findByPrimaryKey(long id) throws NoSuchProductException;

	/**
	 * Returns the product with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param id the primary key of the product
	 * @return the product, or <code>null</code> if a product with the primary key could not be found
	 */
	public Product fetchByPrimaryKey(long id);

	/**
	 * Returns all the products.
	 *
	 * @return the products
	 */
	public java.util.List<Product> findAll();

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
	public java.util.List<Product> findAll(int start, int end);

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
	public java.util.List<Product> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Product>
			orderByComparator);

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
	public java.util.List<Product> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Product>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the products from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of products.
	 *
	 * @return the number of products
	 */
	public int countAll();

}