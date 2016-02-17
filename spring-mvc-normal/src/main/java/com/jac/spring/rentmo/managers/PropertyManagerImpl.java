package com.jac.spring.rentmo.managers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AnonymousAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jac.spring.rentmo.bo.PropertyDto;
import com.jac.spring.rentmo.repository.PropertyRepository;

import net.petrikainulainen.spring.social.signinmvc.user.model.User;
import net.petrikainulainen.spring.social.signinmvc.user.repository.UserRepository;


@Service
@Transactional
public class PropertyManagerImpl implements PropertyManager {
	private static final Logger LOGGER = LoggerFactory.getLogger(PropertyManagerImpl.class);
	
	private PropertyRepository propertyRepository;
	
	private UserRepository userRepository;
	
	@Autowired
	public PropertyManagerImpl(UserRepository userRepository, PropertyRepository propertyRepository) {
		this.userRepository = userRepository;
		this.propertyRepository = propertyRepository;
	}
	
	
	@Override
	public PropertyDto addProperty(PropertyDto propertyDto) {
        // Get the current user ID, e.g. the landlord
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		if (!(authentication instanceof AnonymousAuthenticationToken)) {
			String currentUserName = authentication.getName();
			User landlord = userRepository.findByEmail(currentUserName);
	        propertyDto.setLandlord(landlord);
	        // TODO Plug to test adding tenants
//	        Set<User> tenants = new HashSet<User>();
//	        tenants.add(landlord);
//	        propertyDto.setTenants(tenants);
		}
		
        // TODO Photo upload and data attachments
        
        propertyDto = (PropertyDto) this.propertyRepository.save(propertyDto);
        LOGGER.debug("Successfully saved new property: {}", propertyDto.toString());
        
		return propertyDto;
	}

	@Override
	public List<PropertyDto> findAllLandlordProperties(String landlord) {
		
		Long landlordId = userRepository.findByEmail(landlord).getId();
		List<PropertyDto> propertiesList = this.propertyRepository.findAllByLandlordId(landlordId);
		LOGGER.debug("NUMBER OF LANDLORD PROPERTIES: {}", propertiesList.size());
		for(PropertyDto propertyDto : propertiesList)
		{
			LOGGER.debug("findAllByLandlord: {}", propertyDto.toString());
		}
		
		return propertiesList;
	}

}
