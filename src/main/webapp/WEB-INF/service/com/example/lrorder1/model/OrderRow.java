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

package com.example.inventory.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

/**
 * The extended model interface for the OrderRow service. Represents a row in the &quot;OrderForm_OrderRow&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see OrderRowModel
 * @see com.example.inventory.model.impl.OrderRowImpl
 * @see com.example.inventory.model.impl.OrderRowModelImpl
 * @generated
 */
@ImplementationClassName("com.example.inventory.model.impl.OrderRowImpl")
@ProviderType
public interface OrderRow extends OrderRowModel, PersistedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to {@link com.example.inventory.model.impl.OrderRowImpl} and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<OrderRow, Long> ORDER_ROW_ID_ACCESSOR = new Accessor<OrderRow, Long>() {
			@Override
			public Long get(OrderRow orderRow) {
				return orderRow.getOrderRowId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<OrderRow> getTypeClass() {
				return OrderRow.class;
			}
		};
}