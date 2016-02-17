package com.jac.spring.rentmo.dto;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

public class AddPropertyFormDto {

	public String address = null;
	
	@NumberFormat(style=Style.CURRENCY)
	public BigDecimal securityDeposit = null;
	
	@NumberFormat(style=Style.CURRENCY)
	public BigDecimal rentAmount = null;
	
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date dueDate = null;
	
	public List photos = null;
	
	public List tenantIds = null;
	
	public AddPropertyFormDto(){
		
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BigDecimal getSecurityDeposit() {
		return securityDeposit;
	}

	public void setSecurityDeposit(BigDecimal securityDeposit) {
		this.securityDeposit = securityDeposit;
	}

	public BigDecimal getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(BigDecimal rentAmount) {
		this.rentAmount = rentAmount;
	}

	public Date getDueDate() {
		return dueDate;
	}

	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	public List getPhotos() {
		return photos;
	}

	public void setPhotos(List photos) {
		this.photos = photos;
	}

	public List getTenantIds() {
		return tenantIds;
	}

	public void setTenantIds(List tenantIds) {
		this.tenantIds = tenantIds;
	}
	
	@Override
    public String toString() {
        return new ToStringBuilder(this)
                .append("address", this.getAddress())
                .append("security deposit", this.getSecurityDeposit().toString())
                .append("rent amount", this.getRentAmount().toString())
                .append("due date", new SimpleDateFormat("MM/dd/yyyy").format(this.getDueDate()))
                .toString();
    }
}
