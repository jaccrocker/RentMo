package com.jac.spring.rentmo.bo;

import net.petrikainulainen.spring.social.signinmvc.common.model.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

/**
 * @author Jac Crocker
 */
@Entity
@Table(name = "simple_address")
//@Embeddable
public class SimpleAddressBo extends BaseEntity<Long> implements Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "simple_address", length = 100, nullable = false)
    private String simpleAddress;

    
    public SimpleAddressBo() {

    }
    
    public SimpleAddressBo(String address) {
    	this.simpleAddress = address;
    }

    public String getAddress() {
    	return this.simpleAddress;
    }
    
    @Override
    public Long getId() {
        return id;
    }

	public String getSimpleAddress() {
		return simpleAddress;
	}

	public void setSimpleAddress(String simpleAddress) {
		this.simpleAddress = simpleAddress;
	}

	@Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("simpleAddress", this.getSimpleAddress()).toString();
	}
/*
	@Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("id", id)
                .append("creationTime", this.getCreationTime())
                .append("modificationTime", this.getModificationTime())
                .append("version", this.getVersion())
                .append("streetNumber", this.getStreetNumber())
                .append("buildingName", this.getBuildingName())
                .append("streetNumberSuffix", this.getStreetNumberSuffix())
                .append("streetName", this.getStreetName())
                .append("streetType", this.getStreetType())
                .append("streetDirection", this.getStreetDirection())
                .append("addressType", this.getAddressType())
                .append("addressTypeNumber", this.getAddressTypeNumber())
                .append("localMunicipality", this.getLocalMunicipality())
                .append("city", this.getCity())
                .append("district", this.getDistrict())
                .append("postalArea", this.getPostalArea())
                .append("country", this.getCountry())
                .toString();
    }
*/

}
