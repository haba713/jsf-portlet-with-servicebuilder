create index IX_833E1870 on Inventory_Product (code_[$COLUMN_LENGTH:75$]);

create index IX_1B15DCD7 on OrderForm_Order (groupId, storeCustomerNumber[$COLUMN_LENGTH:75$], orderDate);
create index IX_8593F2DB on OrderForm_Order (storeCustomerNumber[$COLUMN_LENGTH:75$], orderDate);

create index IX_1B2D10AE on OrderForm_OrderRow (groupId, orderId);
create index IX_D39BB6FA on OrderForm_OrderRow (orderId);