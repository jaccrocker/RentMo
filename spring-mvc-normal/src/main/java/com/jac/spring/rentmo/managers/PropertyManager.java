package com.jac.spring.rentmo.managers;

import java.util.List;

import com.jac.spring.rentmo.bo.PropertyDto;

public interface PropertyManager {
	public PropertyDto addProperty(PropertyDto propertyDto);
	
	public List<PropertyDto> findAllLandlordProperties(String landlord);
}
