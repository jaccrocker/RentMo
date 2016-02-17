package com.jac.spring.rentmo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jac.spring.rentmo.bo.Address;
import com.jac.spring.rentmo.bo.SimpleAddressBo;

/**
 * @author Jac Crocker
 */
public interface AddressRepository extends JpaRepository<SimpleAddressBo, Long>{

    public Address findById(Long id);
    
}
