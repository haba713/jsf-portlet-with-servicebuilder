/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.example.inventory.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.example.inventory.model.OrderRow;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;

import java.util.List;

/**
 * The persistence utility for the order row service. This utility wraps {@link com.example.inventory.service.persistence.impl.OrderRowPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrderRowPersistence
 * @see com.example.inventory.service.persistence.impl.OrderRowPersistenceImpl
 * @generated
 */
@ProviderType
public class OrderRowUtil {
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
	public static void clearCache(OrderRow orderRow) {
		getPersistence().clearCache(orderRow);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<OrderRow> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<OrderRow> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<OrderRow> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<OrderRow> orderByComparator) {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static OrderRow update(OrderRow orderRow) {
		return getPersistence().update(orderRow);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static OrderRow update(OrderRow orderRow,
		ServiceContext serviceContext) {
		return getPersistence().update(orderRow, serviceContext);
	}

	/**
	* Caches the order row in the entity cache if it is enabled.
	*
	* @param orderRow the order row
	*/
	public static void cacheResult(OrderRow orderRow) {
		getPersistence().cacheResult(orderRow);
	}

	/**
	* Caches the order rows in the entity cache if it is enabled.
	*
	* @param orderRows the order rows
	*/
	public static void cacheResult(List<OrderRow> orderRows) {
		getPersistence().cacheResult(orderRows);
	}

	/**
	* Creates a new order row with the primary key. Does not add the order row to the database.
	*
	* @param orderRowId the primary key for the new order row
	* @return the new order row
	*/
	public static OrderRow create(long orderRowId) {
		return getPersistence().create(orderRowId);
	}

	/**
	* Removes the order row with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderRowId the primary key of the order row
	* @return the order row that was removed
	* @throws NoSuchOrderRowException if a order row with the primary key could not be found
	*/
	public static OrderRow remove(long orderRowId)
		throws com.example.inventory.exception.NoSuchOrderRowException {
		return getPersistence().remove(orderRowId);
	}

	public static OrderRow updateImpl(OrderRow orderRow) {
		return getPersistence().updateImpl(orderRow);
	}

	/**
	* Returns the order row with the primary key or throws a {@link NoSuchOrderRowException} if it could not be found.
	*
	* @param orderRowId the primary key of the order row
	* @return the order row
	* @throws NoSuchOrderRowException if a order row with the primary key could not be found
	*/
	public static OrderRow findByPrimaryKey(long orderRowId)
		throws com.example.inventory.exception.NoSuchOrderRowException {
		return getPersistence().findByPrimaryKey(orderRowId);
	}

	/**
	* Returns the order row with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderRowId the primary key of the order row
	* @return the order row, or <code>null</code> if a order row with the primary key could not be found
	*/
	public static OrderRow fetchByPrimaryKey(long orderRowId) {
		return getPersistence().fetchByPrimaryKey(orderRowId);
	}

	public static java.util.Map<java.io.Serializable, OrderRow> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys) {
		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	* Returns all the order rows.
	*
	* @return the order rows
	*/
	public static List<OrderRow> findAll() {
		return getPersistence().findAll();
	}

	/**
	* Returns a range of all the order rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderRowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order rows
	* @param end the upper bound of the range of order rows (not inclusive)
	* @return the range of order rows
	*/
	public static List<OrderRow> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	* Returns an ordered range of all the order rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderRowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order rows
	* @param end the upper bound of the range of order rows (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of order rows
	*/
	public static List<OrderRow> findAll(int start, int end,
		OrderByComparator<OrderRow> orderByComparator) {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Returns an ordered range of all the order rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link OrderRowModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of order rows
	* @param end the upper bound of the range of order rows (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of order rows
	*/
	public static List<OrderRow> findAll(int start, int end,
		OrderByComparator<OrderRow> orderByComparator, boolean retrieveFromCache) {
		return getPersistence()
				   .findAll(start, end, orderByComparator, retrieveFromCache);
	}

	/**
	* Removes all the order rows from the database.
	*/
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of order rows.
	*
	* @return the number of order rows
	*/
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static OrderRowPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (OrderRowPersistence)PortletBeanLocatorUtil.locate(com.example.inventory.service.ServletContextUtil.getServletContextName(),
					OrderRowPersistence.class.getName());

			ReferenceRegistry.registerReference(OrderRowUtil.class,
				"_persistence");
		}

		return _persistence;
	}

	private static OrderRowPersistence _persistence;
}