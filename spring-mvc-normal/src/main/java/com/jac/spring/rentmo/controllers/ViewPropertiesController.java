package com.jac.spring.rentmo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jac.spring.rentmo.managers.PropertyManager;

@Controller
public class ViewPropertiesController {
	private static final Logger LOGGER = LoggerFactory.getLogger(ViewPropertiesController.class);

	@Autowired
	private PropertyManager propertyManager;
	
	protected static final String VIEW_NAME_PROPERTIES = "properties";

	@RequestMapping(value="/landlord/properties", method = RequestMethod.GET)
	public String showProperties() {
	    LOGGER.debug("Rendering Properties page.");
	    Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		String currentUserName = authentication.getName();
	    this.propertyManager.findAllLandlordProperties(currentUserName);
	    return VIEW_NAME_PROPERTIES;
	}

	public void setPropertyManager(PropertyManager propertyManager) {
		this.propertyManager = propertyManager;
	}
    
}
