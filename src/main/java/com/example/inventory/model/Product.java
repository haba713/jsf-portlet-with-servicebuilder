/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.inventory.model;

import com.liferay.portal.kernel.annotation.ImplementationClassName;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.util.Accessor;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The extended model interface for the Product service. Represents a row in the &quot;Inventory_Product&quot; database table, with each column mapped to a property of this class.
 *
 * @author Brian Wing Shun Chan
 * @see ProductModel
 * @generated
 */
@ImplementationClassName("com.example.inventory.model.impl.ProductImpl")
@ProviderType
public interface Product extends PersistedModel, ProductModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this interface directly. Add methods to <code>com.example.inventory.model.impl.ProductImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public static final Accessor<Product, Long> ID_ACCESSOR =
		new Accessor<Product, Long>() {

			@Override
			public Long get(Product product) {
				return product.getId();
			}

			@Override
			public Class<Long> getAttributeClass() {
				return Long.class;
			}

			@Override
			public Class<Product> getTypeClass() {
				return Product.class;
			}

		};

}