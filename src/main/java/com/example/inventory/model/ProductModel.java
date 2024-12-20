/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.inventory.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Product service. Represents a row in the &quot;Inventory_Product&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.example.inventory.model.impl.ProductModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.example.inventory.model.impl.ProductImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Product
 * @generated
 */
@ProviderType
public interface ProductModel extends BaseModel<Product> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a product model instance should use the {@link Product} interface instead.
	 */

	/**
	 * Returns the primary key of this product.
	 *
	 * @return the primary key of this product
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this product.
	 *
	 * @param primaryKey the primary key of this product
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ID of this product.
	 *
	 * @return the ID of this product
	 */
	public long getId();

	/**
	 * Sets the ID of this product.
	 *
	 * @param id the ID of this product
	 */
	public void setId(long id);

	/**
	 * Returns the code of this product.
	 *
	 * @return the code of this product
	 */
	@AutoEscape
	public String getCode();

	/**
	 * Sets the code of this product.
	 *
	 * @param code the code of this product
	 */
	public void setCode(String code);

	/**
	 * Returns the name of this product.
	 *
	 * @return the name of this product
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this product.
	 *
	 * @param name the name of this product
	 */
	public void setName(String name);

	@Override
	public Product cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}