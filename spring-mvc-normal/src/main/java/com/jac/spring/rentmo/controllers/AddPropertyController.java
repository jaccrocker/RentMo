package com.jac.spring.rentmo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

import com.jac.spring.rentmo.bo.PropertyDto;
import com.jac.spring.rentmo.managers.PropertyManager;

@Controller
public class AddPropertyController {
	private static final Logger LOGGER = LoggerFactory.getLogger(AddPropertyController.class);

	protected static final String VIEW_NAME_LANDLORD_ADD_PROPERTY = "addProperty";
	protected static final String VIEW_NAME_PROPERTIES = "landlord/properties";

	// public AddPropertyFormDto addPropertyForm = null;

	public PropertyDto propertyDto = null;

	@Autowired
	private PropertyManager propertyManager;

	@RequestMapping(value = "/landlord/addProperty", method = RequestMethod.GET)
	public String showAddProperty(Model model) {
		LOGGER.debug("Rendering AddProperty page.");
		model.addAttribute("propertyDto", new PropertyDto());
		return VIEW_NAME_LANDLORD_ADD_PROPERTY;
	}

	@SuppressWarnings("unchecked")
	@RequestMapping(value = "/landlord/addProperty", method = RequestMethod.POST)
	public String processAddProperty(@ModelAttribute("propertyDto") PropertyDto propertyDto, BindingResult result,
			WebRequest request) {
		LOGGER.debug("Adding new property: {}", propertyDto.toString());
		if (result.hasErrors()) {
			LOGGER.debug("Validation errors found. Rendering form view.");
			LOGGER.debug("errors in form" + result.toString());
			return VIEW_NAME_LANDLORD_ADD_PROPERTY;
		}

		this.propertyManager.addProperty(propertyDto);

		LOGGER.debug("No validation errors found. Continuing add property process.");

		return "redirect:/" + VIEW_NAME_PROPERTIES;
	}

	public PropertyDto getPropertyDto() {
		return propertyDto;
	}

	public void setPropertyDto(PropertyDto propertyDto) {
		this.propertyDto = propertyDto;
	}

	public void setPropertyManager(PropertyManager propertyManager) {
		this.propertyManager = propertyManager;
	}

}
