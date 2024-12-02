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

import com.example.inventory.exception.NoSuchOrderRowException;
import com.example.inventory.model.OrderRow;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

/**
 * The persistence interface for the order row service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see com.example.inventory.service.persistence.impl.OrderRowPersistenceImpl
 * @see OrderRowUtil
 * @generated
 */
@ProviderType
public interface OrderRowPersistence extends BasePersistence<OrderRow> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link OrderRowUtil} to access the order row persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the order row in the entity cache if it is enabled.
	*
	* @param orderRow the order row
	*/
	public void cacheResult(OrderRow orderRow);

	/**
	* Caches the order rows in the entity cache if it is enabled.
	*
	* @param orderRows the order rows
	*/
	public void cacheResult(java.util.List<OrderRow> orderRows);

	/**
	* Creates a new order row with the primary key. Does not add the order row to the database.
	*
	* @param orderRowId the primary key for the new order row
	* @return the new order row
	*/
	public OrderRow create(long orderRowId);

	/**
	* Removes the order row with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param orderRowId the primary key of the order row
	* @return the order row that was removed
	* @throws NoSuchOrderRowException if a order row with the primary key could not be found
	*/
	public OrderRow remove(long orderRowId) throws NoSuchOrderRowException;

	public OrderRow updateImpl(OrderRow orderRow);

	/**
	* Returns the order row with the primary key or throws a {@link NoSuchOrderRowException} if it could not be found.
	*
	* @param orderRowId the primary key of the order row
	* @return the order row
	* @throws NoSuchOrderRowException if a order row with the primary key could not be found
	*/
	public OrderRow findByPrimaryKey(long orderRowId)
		throws NoSuchOrderRowException;

	/**
	* Returns the order row with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param orderRowId the primary key of the order row
	* @return the order row, or <code>null</code> if a order row with the primary key could not be found
	*/
	public OrderRow fetchByPrimaryKey(long orderRowId);

	@Override
	public java.util.Map<java.io.Serializable, OrderRow> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the order rows.
	*
	* @return the order rows
	*/
	public java.util.List<OrderRow> findAll();

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
	public java.util.List<OrderRow> findAll(int start, int end);

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
	public java.util.List<OrderRow> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderRow> orderByComparator);

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
	public java.util.List<OrderRow> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<OrderRow> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the order rows from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of order rows.
	*
	* @return the number of order rows
	*/
	public int countAll();
}