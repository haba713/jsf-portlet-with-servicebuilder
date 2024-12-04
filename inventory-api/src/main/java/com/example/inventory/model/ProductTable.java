/**
 * SPDX-FileCopyrightText: (c) 2024 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.example.inventory.model;

import com.liferay.petra.sql.dsl.Column;
import com.liferay.petra.sql.dsl.base.BaseTable;

import java.sql.Types;

/**
 * The table class for the &quot;Inventory_Product&quot; database table.
 *
 * @author Brian Wing Shun Chan
 * @see Product
 * @generated
 */
public class ProductTable extends BaseTable<ProductTable> {

	public static final ProductTable INSTANCE = new ProductTable();

	public final Column<ProductTable, Long> id = createColumn(
		"id_", Long.class, Types.BIGINT, Column.FLAG_PRIMARY);
	public final Column<ProductTable, String> code = createColumn(
		"code_", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);
	public final Column<ProductTable, String> name = createColumn(
		"name", String.class, Types.VARCHAR, Column.FLAG_DEFAULT);

	private ProductTable() {
		super("Inventory_Product", ProductTable::new);
	}

}