package com.jac.spring.rentmo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jac.spring.rentmo.bo.PropertyDto;

/**
 * @author Jac Crocker
 */
public interface PropertyRepository extends JpaRepository<PropertyDto, Long>{

	public List<PropertyDto> findAllByLandlordId(Long landlordId);
    
}
