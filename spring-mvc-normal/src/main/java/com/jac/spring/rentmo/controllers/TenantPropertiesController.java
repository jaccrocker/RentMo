package com.jac.spring.rentmo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jac.spring.rentmo.managers.PropertyManager;

@Controller
public class TenantPropertiesController {
	private static final Logger LOGGER = LoggerFactory.getLogger(TenantPropertiesController.class);

	protected static final String VIEW_NAME_TENANT_PROPERTIES = "tenantProperties";

	@RequestMapping(value = "/tenant/properties", method = RequestMethod.GET)
	public String showTenantProperties() {
		LOGGER.debug("Rendering TenantProperties page.");
		return VIEW_NAME_TENANT_PROPERTIES;
	}

}
