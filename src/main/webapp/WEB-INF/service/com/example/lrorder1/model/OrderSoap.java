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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.example.inventory.service.http.OrderServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.example.inventory.service.http.OrderServiceSoap
 * @generated
 */
@ProviderType
public class OrderSoap implements Serializable {
	public static OrderSoap toSoapModel(Order model) {
		OrderSoap soapModel = new OrderSoap();

		soapModel.setOrderId(model.getOrderId());
		soapModel.setSeller(model.getSeller());
		soapModel.setOrderDate(model.getOrderDate());
		soapModel.setDeliveryWeek(model.getDeliveryWeek());
		soapModel.setVatPercentText(model.getVatPercentText());
		soapModel.setVatFactor(model.getVatFactor());
		soapModel.setTotalWeight(model.getTotalWeight());
		soapModel.setAdditionalInfo(model.getAdditionalInfo());
		soapModel.setRepEmail(model.getRepEmail());

		return soapModel;
	}

	public static OrderSoap[] toSoapModels(Order[] models) {
		OrderSoap[] soapModels = new OrderSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrderSoap[][] toSoapModels(Order[][] models) {
		OrderSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrderSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrderSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrderSoap[] toSoapModels(List<Order> models) {
		List<OrderSoap> soapModels = new ArrayList<OrderSoap>(models.size());

		for (Order model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrderSoap[soapModels.size()]);
	}

	public OrderSoap() {
	}

	public long getPrimaryKey() {
		return _orderId;
	}

	public void setPrimaryKey(long pk) {
		setOrderId(pk);
	}

	public long getOrderId() {
		return _orderId;
	}

	public void setOrderId(long orderId) {
		_orderId = orderId;
	}

	public String getSeller() {
		return _seller;
	}

	public void setSeller(String seller) {
		_seller = seller;
	}

	public Date getOrderDate() {
		return _orderDate;
	}

	public void setOrderDate(Date orderDate) {
		_orderDate = orderDate;
	}

	public String getDeliveryWeek() {
		return _deliveryWeek;
	}

	public void setDeliveryWeek(String deliveryWeek) {
		_deliveryWeek = deliveryWeek;
	}

	public String getVatPercentText() {
		return _vatPercentText;
	}

	public void setVatPercentText(String vatPercentText) {
		_vatPercentText = vatPercentText;
	}

	public double getVatFactor() {
		return _vatFactor;
	}

	public void setVatFactor(double vatFactor) {
		_vatFactor = vatFactor;
	}

	public double getTotalWeight() {
		return _totalWeight;
	}

	public void setTotalWeight(double totalWeight) {
		_totalWeight = totalWeight;
	}

	public String getAdditionalInfo() {
		return _additionalInfo;
	}

	public void setAdditionalInfo(String additionalInfo) {
		_additionalInfo = additionalInfo;
	}

	public String getRepEmail() {
		return _repEmail;
	}

	public void setRepEmail(String repEmail) {
		_repEmail = repEmail;
	}

	private long _orderId;
	private String _seller;
	private Date _orderDate;
	private String _deliveryWeek;
	private String _vatPercentText;
	private double _vatFactor;
	private double _totalWeight;
	private String _additionalInfo;
	private String _repEmail;
}