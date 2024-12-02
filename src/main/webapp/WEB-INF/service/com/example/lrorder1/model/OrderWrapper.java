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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * <p>
 * This class is a wrapper for {@link Order}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Order
 * @generated
 */
@ProviderType
public class OrderWrapper implements Order, ModelWrapper<Order> {
	public OrderWrapper(Order order) {
		_order = order;
	}

	@Override
	public Class<?> getModelClass() {
		return Order.class;
	}

	@Override
	public String getModelClassName() {
		return Order.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("orderId", getOrderId());
		attributes.put("seller", getSeller());
		attributes.put("orderDate", getOrderDate());
		attributes.put("deliveryWeek", getDeliveryWeek());
		attributes.put("vatPercentText", getVatPercentText());
		attributes.put("vatFactor", getVatFactor());
		attributes.put("totalWeight", getTotalWeight());
		attributes.put("additionalInfo", getAdditionalInfo());
		attributes.put("repEmail", getRepEmail());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long orderId = (Long)attributes.get("orderId");

		if (orderId != null) {
			setOrderId(orderId);
		}

		String seller = (String)attributes.get("seller");

		if (seller != null) {
			setSeller(seller);
		}

		Date orderDate = (Date)attributes.get("orderDate");

		if (orderDate != null) {
			setOrderDate(orderDate);
		}

		String deliveryWeek = (String)attributes.get("deliveryWeek");

		if (deliveryWeek != null) {
			setDeliveryWeek(deliveryWeek);
		}

		String vatPercentText = (String)attributes.get("vatPercentText");

		if (vatPercentText != null) {
			setVatPercentText(vatPercentText);
		}

		Double vatFactor = (Double)attributes.get("vatFactor");

		if (vatFactor != null) {
			setVatFactor(vatFactor);
		}

		Double totalWeight = (Double)attributes.get("totalWeight");

		if (totalWeight != null) {
			setTotalWeight(totalWeight);
		}

		String additionalInfo = (String)attributes.get("additionalInfo");

		if (additionalInfo != null) {
			setAdditionalInfo(additionalInfo);
		}

		String repEmail = (String)attributes.get("repEmail");

		if (repEmail != null) {
			setRepEmail(repEmail);
		}
	}

	@Override
	public Object clone() {
		return new OrderWrapper((Order)_order.clone());
	}

	@Override
	public int compareTo(Order order) {
		return _order.compareTo(order);
	}

	/**
	* Returns the additional info of this order.
	*
	* @return the additional info of this order
	*/
	@Override
	public String getAdditionalInfo() {
		return _order.getAdditionalInfo();
	}

	/**
	* Returns the delivery week of this order.
	*
	* @return the delivery week of this order
	*/
	@Override
	public String getDeliveryWeek() {
		return _order.getDeliveryWeek();
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return _order.getExpandoBridge();
	}

	/**
	* Returns the order date of this order.
	*
	* @return the order date of this order
	*/
	@Override
	public Date getOrderDate() {
		return _order.getOrderDate();
	}

	/**
	* Returns the order ID of this order.
	*
	* @return the order ID of this order
	*/
	@Override
	public long getOrderId() {
		return _order.getOrderId();
	}

	/**
	* Returns the primary key of this order.
	*
	* @return the primary key of this order
	*/
	@Override
	public long getPrimaryKey() {
		return _order.getPrimaryKey();
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _order.getPrimaryKeyObj();
	}

	/**
	* Returns the rep email of this order.
	*
	* @return the rep email of this order
	*/
	@Override
	public String getRepEmail() {
		return _order.getRepEmail();
	}

	/**
	* Returns the seller of this order.
	*
	* @return the seller of this order
	*/
	@Override
	public String getSeller() {
		return _order.getSeller();
	}

	/**
	* Returns the total weight of this order.
	*
	* @return the total weight of this order
	*/
	@Override
	public double getTotalWeight() {
		return _order.getTotalWeight();
	}

	/**
	* Returns the vat factor of this order.
	*
	* @return the vat factor of this order
	*/
	@Override
	public double getVatFactor() {
		return _order.getVatFactor();
	}

	/**
	* Returns the vat percent text of this order.
	*
	* @return the vat percent text of this order
	*/
	@Override
	public String getVatPercentText() {
		return _order.getVatPercentText();
	}

	@Override
	public int hashCode() {
		return _order.hashCode();
	}

	@Override
	public boolean isCachedModel() {
		return _order.isCachedModel();
	}

	@Override
	public boolean isEscapedModel() {
		return _order.isEscapedModel();
	}

	@Override
	public boolean isNew() {
		return _order.isNew();
	}

	@Override
	public void persist() {
		_order.persist();
	}

	/**
	* Sets the additional info of this order.
	*
	* @param additionalInfo the additional info of this order
	*/
	@Override
	public void setAdditionalInfo(String additionalInfo) {
		_order.setAdditionalInfo(additionalInfo);
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_order.setCachedModel(cachedModel);
	}

	/**
	* Sets the delivery week of this order.
	*
	* @param deliveryWeek the delivery week of this order
	*/
	@Override
	public void setDeliveryWeek(String deliveryWeek) {
		_order.setDeliveryWeek(deliveryWeek);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.kernel.model.BaseModel<?> baseModel) {
		_order.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge) {
		_order.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		_order.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public void setNew(boolean n) {
		_order.setNew(n);
	}

	/**
	* Sets the order date of this order.
	*
	* @param orderDate the order date of this order
	*/
	@Override
	public void setOrderDate(Date orderDate) {
		_order.setOrderDate(orderDate);
	}

	/**
	* Sets the order ID of this order.
	*
	* @param orderId the order ID of this order
	*/
	@Override
	public void setOrderId(long orderId) {
		_order.setOrderId(orderId);
	}

	/**
	* Sets the primary key of this order.
	*
	* @param primaryKey the primary key of this order
	*/
	@Override
	public void setPrimaryKey(long primaryKey) {
		_order.setPrimaryKey(primaryKey);
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		_order.setPrimaryKeyObj(primaryKeyObj);
	}

	/**
	* Sets the rep email of this order.
	*
	* @param repEmail the rep email of this order
	*/
	@Override
	public void setRepEmail(String repEmail) {
		_order.setRepEmail(repEmail);
	}

	/**
	* Sets the seller of this order.
	*
	* @param seller the seller of this order
	*/
	@Override
	public void setSeller(String seller) {
		_order.setSeller(seller);
	}

	/**
	* Sets the total weight of this order.
	*
	* @param totalWeight the total weight of this order
	*/
	@Override
	public void setTotalWeight(double totalWeight) {
		_order.setTotalWeight(totalWeight);
	}

	/**
	* Sets the vat factor of this order.
	*
	* @param vatFactor the vat factor of this order
	*/
	@Override
	public void setVatFactor(double vatFactor) {
		_order.setVatFactor(vatFactor);
	}

	/**
	* Sets the vat percent text of this order.
	*
	* @param vatPercentText the vat percent text of this order
	*/
	@Override
	public void setVatPercentText(String vatPercentText) {
		_order.setVatPercentText(vatPercentText);
	}

	@Override
	public com.liferay.portal.kernel.model.CacheModel<Order> toCacheModel() {
		return _order.toCacheModel();
	}

	@Override
	public Order toEscapedModel() {
		return new OrderWrapper(_order.toEscapedModel());
	}

	@Override
	public String toString() {
		return _order.toString();
	}

	@Override
	public Order toUnescapedModel() {
		return new OrderWrapper(_order.toUnescapedModel());
	}

	@Override
	public String toXmlString() {
		return _order.toXmlString();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof OrderWrapper)) {
			return false;
		}

		OrderWrapper orderWrapper = (OrderWrapper)obj;

		if (Objects.equals(_order, orderWrapper._order)) {
			return true;
		}

		return false;
	}

	@Override
	public Order getWrappedModel() {
		return _order;
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _order.isEntityCacheEnabled();
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _order.isFinderCacheEnabled();
	}

	@Override
	public void resetOriginalValues() {
		_order.resetOriginalValues();
	}

	private final Order _order;
}