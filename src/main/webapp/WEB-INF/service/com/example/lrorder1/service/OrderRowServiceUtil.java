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

package com.example.inventory.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.util.ReferenceRegistry;

/**
 * Provides the remote service utility for OrderRow. This utility wraps
 * {@link com.example.inventory.service.impl.OrderRowServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on a remote server. Methods of this service are expected to have security
 * checks based on the propagated JAAS credentials because this service can be
 * accessed remotely.
 *
 * @author Brian Wing Shun Chan
 * @see OrderRowService
 * @see com.example.inventory.service.base.OrderRowServiceBaseImpl
 * @see com.example.inventory.service.impl.OrderRowServiceImpl
 * @generated
 */
@ProviderType
public class OrderRowServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.example.inventory.service.impl.OrderRowServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	public static void clearService() {
		_service = null;
	}

	public static OrderRowService getService() {
		if (_service == null) {
			_service = (OrderRowService)PortletBeanLocatorUtil.locate(ServletContextUtil.getServletContextName(),
					OrderRowService.class.getName());

			ReferenceRegistry.registerReference(OrderRowServiceUtil.class,
				"_service");
		}

		return _service;
	}

	private static OrderRowService _service;
}