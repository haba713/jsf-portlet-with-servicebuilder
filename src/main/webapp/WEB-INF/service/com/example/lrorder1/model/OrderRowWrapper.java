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

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link OrderRow}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OrderRow
 * @generated
 */
@ProviderType
public class OrderRowWrapper implements OrderRow, ModelWrapper<OrderRow> {
	public OrderRowWrapper(OrderRow orderRow) {
		_orderRow = orderRow;
	}

	@Override
	public Class<?> getModelClass() {
		return OrderRow.class;
	}

	@Override
	public String getModelClassName() {
		return OrderRow.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orderRowId", getOrderRowId());
		attributes.put("orderId", getOrderId());
		attributes.put("productCode", getProductCode());
		attributes.put("productEAN", getProductEAN());
		attributes.put("productName", getProductName());
		attributes.put("productPriceGroup", getProductPriceGroup());
		attributes.put("productDiscountedPrice", getProductDiscountedPrice());
		attributes.put("productNoVatPrice", getProductNoVatPrice());
		attributes.put("productNoVatDiscountedPrice",
			getProductNoVatDiscountedPrice());
		attributes.put("productWeight", getProductWeight());
		attributes.put("useLots", isUseLots());
		attributes.put("orderLots", getOrderLots());
		attributes.put("lotSize", getLotSize());
		attributes.put("orderAmount", getOrderAmount());
		attributes.put("previousAmount", getPreviousAmount());
		attributes.put("previousMonths", getPreviousMonths());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long orderRowId = (Long)attributes.get("orderRowId");

		if (orderRowId != null) {
			setOrderRowId(orderRowId);
		}

		Long orderId = (Long)attributes.get("orderId");

		if (orderId != null) {
			setOrderId(orderId);
		}

		String productCode = (String)attributes.get("productCode");

		if (productCode != null) {
			setProductCode(productCode);
		}

		String productEAN = (String)attributes.get("productEAN");

		if (productEAN != null) {
			setProductEAN(productEAN);
		}

		String productName = (String)attributes.get("productName");

		if (productName != null) {
			setProductName(productName);
		}

		String productPriceGroup = (String)attributes.get("productPriceGroup");

		if (productPriceGroup != null) {
			setProductPriceGroup(productPriceGroup);
		}

		Double productDiscountedPrice = (Double)attributes.get(
				"productDiscountedPrice");

		if (productDiscountedPrice != null) {
			setProductDiscountedPrice(productDiscountedPrice);
		}

		Double productNoVatPrice = (Double)attributes.get("productNoVatPrice");

		if (productNoVatPrice != null) {
			setProductNoVatPrice(productNoVatPrice);
		}

		Double productNoVatDiscountedPrice = (Double)attributes.get(
				"productNoVatDiscountedPrice");

		if (productNoVatDiscountedPrice != null) {
			setProductNoVatDiscountedPrice(productNoVatDiscountedPrice);
		}

		Double productWeight = (Double)attributes.get("productWeight");

		if (productWeight != null) {
			setProductWeight(productWeight);
		}

		Boolean useLots = (Boolean)attributes.get("useLots");

		if (useLots != null) {
			setUseLots(useLots);
		}

		Double orderLots = (Double)attributes.get("orderLots");

		if (orderLots != null) {
			setOrderLots(orderLots);
		}

		Double lotSize = (Double)attributes.get("lotSize");

		if (lotSize != null) {
			setLotSize(lotSize);
		}

		Double orderAmount = (Double)attributes.get("orderAmount");

		if (orderAmount != null) {
			setOrderAmount(orderAmount);
		}

		Double previousAmount = (Double)attributes.get("previousAmount");

		if (previousAmount != null) {
			setPreviousAmount(previousAmount);
		}

		Double previousMonths = (Double)attributes.get("previousMonths");

		if (previousMonths != null) {
			setPreviousMonths(previousMonths);
		}
	}

	@Override
	public Object clone() {
		return new OrderRowWrapper((OrderRow)_orderRow.clone());
	}

	@Override
	public int compareTo(OrderRow orderRow) {
		return _orderRow.compareTo(orderRow);
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _orderRow.getExpandoBridge();
	}

	/**
	* Returns the lot size of this order row.
	*
	* @return the lot size of this order row
	*/
	@Override
	public double getLotSize() {
		return _orderRow.getLotSize();
	}

	/**
	* Returns the order amount of this order row.
	*
	* @return the order amount of this order row
	*/
	@Override
	public double getOrderAmount() {
		return _orderRow.getOrderAmount();
	}

	/**
	* Returns the order ID of this order row.
	*
	* @return the order ID of this order row
	*/
	@Override
	public long getOrderId() {
		return _orderRow.getOrderId();
	}

	/**
	* Returns the order lots of this order row.
	*
	* @return the order lots of this order row
	*/
	@Override
	public double getOrderLots() {
		return _orderRow.getOrderLots();
	}

	/**
	* Returns the order row ID of this order row.
	*
	* @return the order row ID of this order row
	*/
	@Override
	public long getOrderRowId() {
		return _orderRow.getOrderRowId();
	}

	/**
	* Returns the previous amount of this order row.
	*
	* @return the previous amount of this order row
	*/
	@Override
	public double getPreviousAmount() {
		return _orderRow.getPreviousAmount();
	}

	/**
	* Returns the previous months of this order row.
	*
	* @return the previous months of this order row
	*/
	@Override
	public double getPreviousMonths() {
		return _orderRow.getPreviousMonths();
	}

	/**
	* Returns the primary key of this order row.
	*
	* @return the primary key of this order row
	*/
	@Override
	public long getPrimaryKey() {
		return _orderRow.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _orderRow.getPrimaryKeyObj();
	}

	/**
	* Returns the product code of this order row.
	*
	* @return the product code of this order row
	*/
	@Override
	public String getProductCode() {
		return _orderRow.getProductCode();
	}

	/**
	* Returns the product discounted price of this order row.
	*
	* @return the product discounted price of this order row
	*/
	@Override
	public double getProductDiscountedPrice() {
		return _orderRow.getProductDiscountedPrice();
	}

	/**
	* Returns the product ean of this order row.
	*
	* @return the product ean of this order row
	*/
	@Override
	public String getProductEAN() {
		return _orderRow.getProductEAN();
	}

	/**
	* Returns the product name of this order row.
	*
	* @return the product name of this order row
	*/
	@Override
	public String getProductName() {
		return _orderRow.getProductName();
	}

	/**
	* Returns the product no vat discounted price of this order row.
	*
	* @return the product no vat discounted price of this order row
	*/
	@Override
	public double getProductNoVatDiscountedPrice() {
		return _orderRow.getProductNoVatDiscountedPrice();
	}

	/**
	* Returns the product no vat price of this order row.
	*
	* @return the product no vat price of this order row
	*/
	@Override
	public double getProductNoVatPrice() {
		return _orderRow.getProductNoVatPrice();
	}

	/**
	* Returns the product price group of this order row.
	*
	* @return the product price group of this order row
	*/
	@Override
	public String getProductPriceGroup() {
		return _orderRow.getProductPriceGroup();
	}

	/**
	* Returns the product weight of this order row.
	*
	* @return the product weight of this order row
	*/
	@Override
	public double getProductWeight() {
		return _orderRow.getProductWeight();
	}

	/**
	* Returns the use lots of this order row.
	*
	* @return the use lots of this order row
	*/
	@Override
	public boolean getUseLots() {
		return _orderRow.getUseLots();
	}

	@Override
	public int hashCode() {
		return _orderRow.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _orderRow.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _orderRow.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _orderRow.isNew();
	}

	/**
	* Returns <code>true</code> if this order row is use lots.
	*
	* @return <code>true</code> if this order row is use lots; <code>false</code> otherwise
	*/
	@Override
	public boolean isUseLots() {
		return _orderRow.isUseLots();
	}

	@Override
	public void persist() {
		_orderRow.persist();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_orderRow.setCachedModel(cachedModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_orderRow.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_orderRow.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_orderRow.setExpandoBridgeAttributes(serviceContext);
	}

	/**
	* Sets the lot size of this order row.
	*
	* @param lotSize the lot size of this order row
	*/
	@Override
	public void setLotSize(double lotSize) {
		_orderRow.setLotSize(lotSize);
	}

	@Override
	public void setNew(boolean n) {
		_orderRow.setNew(n);
	}

	/**
	* Sets the order amount of this order row.
	*
	* @param orderAmount the order amount of this order row
	*/
	@Override
	public void setOrderAmount(double orderAmount) {
		_orderRow.setOrderAmount(orderAmount);
	}

	/**
	* Sets the order ID of this order row.
	*
	* @param orderId the order ID of this order row
	*/
	@Override
	public void setOrderId(long orderId) {
		_orderRow.setOrderId(orderId);
	}

	/**
	* Sets the order lots of this order row.
	*
	* @param orderLots the order lots of this order row
	*/
	@Override
	public void setOrderLots(double orderLots) {
		_orderRow.setOrderLots(orderLots);
	}

	/**
	* Sets the order row ID of this order row.
	*
	* @param orderRowId the order row ID of this order row
	*/
	@Override
	public void setOrderRowId(long orderRowId) {
		_orderRow.setOrderRowId(orderRowId);
	}

	/**
	* Sets the previous amount of this order row.
	*
	* @param previousAmount the previous amount of this order row
	*/
	@Override
	public void setPreviousAmount(double previousAmount) {
		_orderRow.setPreviousAmount(previousAmount);
	}

	/**
	* Sets the previous months of this order row.
	*
	* @param previousMonths the previous months of this order row
	*/
	@Override
	public void setPreviousMonths(double previousMonths) {
		_orderRow.setPreviousMonths(previousMonths);
	}

	/**
	* Sets the primary key of this order row.
	*
	* @param primaryKey the primary key of this order row
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_orderRow.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_orderRow.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the product code of this order row.
	*
	* @param productCode the product code of this order row
	*/
	@Override
	public void setProductCode(String productCode) {
		_orderRow.setProductCode(productCode);
	}

	/**
	* Sets the product discounted price of this order row.
	*
	* @param productDiscountedPrice the product discounted price of this order row
	*/
	@Override
	public void setProductDiscountedPrice(double productDiscountedPrice) {
		_orderRow.setProductDiscountedPrice(productDiscountedPrice);
	}

	/**
	* Sets the product ean of this order row.
	*
	* @param productEAN the product ean of this order row
	*/
	@Override
	public void setProductEAN(String productEAN) {
		_orderRow.setProductEAN(productEAN);
	}

	/**
	* Sets the product name of this order row.
	*
	* @param productName the product name of this order row
	*/
	@Override
	public void setProductName(String productName) {
		_orderRow.setProductName(productName);
	}

	/**
	* Sets the product no vat discounted price of this order row.
	*
	* @param productNoVatDiscountedPrice the product no vat discounted price of this order row
	*/
	@Override
	public void setProductNoVatDiscountedPrice(
		double productNoVatDiscountedPrice) {
		_orderRow.setProductNoVatDiscountedPrice(productNoVatDiscountedPrice);
	}

	/**
	* Sets the product no vat price of this order row.
	*
	* @param productNoVatPrice the product no vat price of this order row
	*/
	@Override
	public void setProductNoVatPrice(double productNoVatPrice) {
		_orderRow.setProductNoVatPrice(productNoVatPrice);
	}

	/**
	* Sets the product price group of this order row.
	*
	* @param productPriceGroup the product price group of this order row
	*/
	@Override
	public void setProductPriceGroup(String productPriceGroup) {
		_orderRow.setProductPriceGroup(productPriceGroup);
	}

	/**
	* Sets the product weight of this order row.
	*
	* @param productWeight the product weight of this order row
	*/
	@Override
	public void setProductWeight(double productWeight) {
		_orderRow.setProductWeight(productWeight);
	}

	/**
	* Sets whether this order row is use lots.
	*
	* @param useLots the use lots of this order row
	*/
	@Override
	public void setUseLots(boolean useLots) {
		_orderRow.setUseLots(useLots);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<OrderRow> toCacheModel() {
		return _orderRow.toCacheModel();
	}

	@Override
	public OrderRow toEscapedModel() {
		return new OrderRowWrapper(_orderRow.toEscapedModel());
	}

	@Override
	public String toString() {
		return _orderRow.toString();
	}

	@Override
	public OrderRow toUnescapedModel() {
		return new OrderRowWrapper(_orderRow.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _orderRow.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderRowWrapper)) {
			return false;
		}

		OrderRowWrapper orderRowWrapper = (OrderRowWrapper)obj;

		if (Objects.equals(_orderRow, orderRowWrapper._orderRow)) {
			return true;
		}

		return false;
	}

	@Override
	public OrderRow getWrappedModel() {
		return _orderRow;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _orderRow.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _orderRow.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_orderRow.resetOriginalValues();
	}

	private final OrderRow _orderRow;
}