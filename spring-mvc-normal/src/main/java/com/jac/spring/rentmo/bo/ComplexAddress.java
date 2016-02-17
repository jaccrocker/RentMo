package com.jac.spring.rentmo.bo;

import net.petrikainulainen.spring.social.signinmvc.common.model.BaseEntity;
import org.apache.commons.lang3.builder.ToStringBuilder;

import javax.persistence.*;

/**
 * @author Jac Crocker
 */
@Entity
@Table(name = "complex_address")
@Deprecated
public class ComplexAddress extends BaseEntity<Long> {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "street_number", length = 100, nullable = false)
    private String streetNumber;

    @Column(name = "building_name", length = 100,nullable = false)
    private String buildingName;

    @Column(name = "street_number_suffix", length = 100, nullable = false)
    private String streetNumberSuffix;

    @Column(name = "street_name", length = 100, nullable = false)
    private String streetName;
    
    @Column(name = "street_type", length = 100, nullable = false)
    private String streetType;
    
    @Column(name = "street_direction", length = 100, nullable = false)
    private String streetDirection;
    
    @Column(name = "address_type", length = 100, nullable = false)
    private String addressType;
    
    @Column(name = "address_type_number", length = 100, nullable = false)
    private String addressTypeNumber;
    
    @Column(name = "local_municipality", length = 100, nullable = false)
    private String localMunicipality;
    
    @Column(name = "city", length = 100, nullable = false)
    private String city;
    
    @Column(name = "district", length = 100, nullable = false)
    private String district;
    
    @Column(name = "postal_area", length = 100, nullable = false)
    private String postalArea;
    
    @Column(name = "country", length = 100, nullable = false)
    private String country;
    
    public ComplexAddress() {

    }

    @Override
    public Long getId() {
        return id;
    }


    public String getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getBuildingName() {
		return buildingName;
	}

	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	public String getStreetNumberSuffix() {
		return streetNumberSuffix;
	}

	public void setStreetNumberSuffix(String streetNumberSuffix) {
		this.streetNumberSuffix = streetNumberSuffix;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getStreetType() {
		return streetType;
	}

	public void setStreetType(String streetType) {
		this.streetType = streetType;
	}

	public String getStreetDirection() {
		return streetDirection;
	}

	public void setStreetDirection(String streetDirection) {
		this.streetDirection = streetDirection;
	}

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getAddressTypeNumber() {
		return addressTypeNumber;
	}

	public void setAddressTypeNumber(String addressTypeNumber) {
		this.addressTypeNumber = addressTypeNumber;
	}

	public String getLocalMunicipality() {
		return localMunicipality;
	}

	public void setLocalMunicipality(String localMunicipality) {
		this.localMunicipality = localMunicipality;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getPostalArea() {
		return postalArea;
	}

	public void setPostalArea(String postalArea) {
		this.postalArea = postalArea;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

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

}
