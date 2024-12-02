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
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link com.example.inventory.service.http.OrderRowServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @see com.example.inventory.service.http.OrderRowServiceSoap
 * @generated
 */
@ProviderType
public class OrderRowSoap implements Serializable {
	public static OrderRowSoap toSoapModel(OrderRow model) {
		OrderRowSoap soapModel = new OrderRowSoap();

		soapModel.setOrderRowId(model.getOrderRowId());
		soapModel.setOrderId(model.getOrderId());
		soapModel.setProductCode(model.getProductCode());
		soapModel.setProductEAN(model.getProductEAN());
		soapModel.setProductName(model.getProductName());
		soapModel.setProductPriceGroup(model.getProductPriceGroup());
		soapModel.setProductDiscountedPrice(model.getProductDiscountedPrice());
		soapModel.setProductNoVatPrice(model.getProductNoVatPrice());
		soapModel.setProductNoVatDiscountedPrice(model.getProductNoVatDiscountedPrice());
		soapModel.setProductWeight(model.getProductWeight());
		soapModel.setUseLots(model.isUseLots());
		soapModel.setOrderLots(model.getOrderLots());
		soapModel.setLotSize(model.getLotSize());
		soapModel.setOrderAmount(model.getOrderAmount());
		soapModel.setPreviousAmount(model.getPreviousAmount());
		soapModel.setPreviousMonths(model.getPreviousMonths());

		return soapModel;
	}

	public static OrderRowSoap[] toSoapModels(OrderRow[] models) {
		OrderRowSoap[] soapModels = new OrderRowSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static OrderRowSoap[][] toSoapModels(OrderRow[][] models) {
		OrderRowSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new OrderRowSoap[models.length][models[0].length];
		}
		else {
			soapModels = new OrderRowSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static OrderRowSoap[] toSoapModels(List<OrderRow> models) {
		List<OrderRowSoap> soapModels = new ArrayList<OrderRowSoap>(models.size());

		for (OrderRow model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new OrderRowSoap[soapModels.size()]);
	}

	public OrderRowSoap() {
	}

	public long getPrimaryKey() {
		return _orderRowId;
	}

	public void setPrimaryKey(long pk) {
		setOrderRowId(pk);
	}

	public long getOrderRowId() {
		return _orderRowId;
	}

	public void setOrderRowId(long orderRowId) {
		_orderRowId = orderRowId;
	}

	public long getOrderId() {
		return _orderId;
	}

	public void setOrderId(long orderId) {
		_orderId = orderId;
	}

	public String getProductCode() {
		return _productCode;
	}

	public void setProductCode(String productCode) {
		_productCode = productCode;
	}

	public String getProductEAN() {
		return _productEAN;
	}

	public void setProductEAN(String productEAN) {
		_productEAN = productEAN;
	}

	public String getProductName() {
		return _productName;
	}

	public void setProductName(String productName) {
		_productName = productName;
	}

	public String getProductPriceGroup() {
		return _productPriceGroup;
	}

	public void setProductPriceGroup(String productPriceGroup) {
		_productPriceGroup = productPriceGroup;
	}

	public double getProductDiscountedPrice() {
		return _productDiscountedPrice;
	}

	public void setProductDiscountedPrice(double productDiscountedPrice) {
		_productDiscountedPrice = productDiscountedPrice;
	}

	public double getProductNoVatPrice() {
		return _productNoVatPrice;
	}

	public void setProductNoVatPrice(double productNoVatPrice) {
		_productNoVatPrice = productNoVatPrice;
	}

	public double getProductNoVatDiscountedPrice() {
		return _productNoVatDiscountedPrice;
	}

	public void setProductNoVatDiscountedPrice(
		double productNoVatDiscountedPrice) {
		_productNoVatDiscountedPrice = productNoVatDiscountedPrice;
	}

	public double getProductWeight() {
		return _productWeight;
	}

	public void setProductWeight(double productWeight) {
		_productWeight = productWeight;
	}

	public boolean getUseLots() {
		return _useLots;
	}

	public boolean isUseLots() {
		return _useLots;
	}

	public void setUseLots(boolean useLots) {
		_useLots = useLots;
	}

	public double getOrderLots() {
		return _orderLots;
	}

	public void setOrderLots(double orderLots) {
		_orderLots = orderLots;
	}

	public double getLotSize() {
		return _lotSize;
	}

	public void setLotSize(double lotSize) {
		_lotSize = lotSize;
	}

	public double getOrderAmount() {
		return _orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		_orderAmount = orderAmount;
	}

	public double getPreviousAmount() {
		return _previousAmount;
	}

	public void setPreviousAmount(double previousAmount) {
		_previousAmount = previousAmount;
	}

	public double getPreviousMonths() {
		return _previousMonths;
	}

	public void setPreviousMonths(double previousMonths) {
		_previousMonths = previousMonths;
	}

	private long _orderRowId;
	private long _orderId;
	private String _productCode;
	private String _productEAN;
	private String _productName;
	private String _productPriceGroup;
	private double _productDiscountedPrice;
	private double _productNoVatPrice;
	private double _productNoVatDiscountedPrice;
	private double _productWeight;
	private boolean _useLots;
	private double _orderLots;
	private double _lotSize;
	private double _orderAmount;
	private double _previousAmount;
	private double _previousMonths;
}