package com.jac.spring.rentmo.bo;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;
import org.springframework.format.annotation.NumberFormat.Style;

import net.petrikainulainen.spring.social.signinmvc.common.model.BaseEntity;
import net.petrikainulainen.spring.social.signinmvc.user.model.User;

/**
 * @author Jac Crocker
 */
@Entity
@Table(name = "property")
public class PropertyDto extends BaseEntity<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long Id;

	@OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = SimpleAddressBo.class)
	@JoinColumn(name = "simple_address_id")
	// @Embedded
	private SimpleAddressBo simpleAddressBo;

//	 @Column(name = "landlord_Id")
	 @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = User.class)
	 @JoinColumn(name = "landlord_id")
	 private User landlord;

//	 @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL, targetEntity = User.class)
//	 @JoinColumn(name = "tenant_id")
	 @ElementCollection
	 @CollectionTable(name = "User", joinColumns = {@JoinColumn(name="user_id")})
	 private Set<User> tenants;

	@Column(name = "security_deposit")
	@NumberFormat(style = Style.CURRENCY)
	public BigDecimal securityDeposit = null;

	@Column(name = "rent_amount")
	@NumberFormat(style = Style.CURRENCY)
	public BigDecimal rentAmount = null;

	@Column(name = "due_date")
	@DateTimeFormat(pattern = "MM/dd/yyyy")
	public Date dueDate = null;

	// public Set<String> photos = null;

	@Column(name = "property_active", nullable = false)
	private Boolean propertyActive = Boolean.TRUE;

	public PropertyDto() {

	}

	public SimpleAddressBo getSimpleAddressBo() {
		return simpleAddressBo;
	}

	public void setSimpleAddressBo(SimpleAddressBo simpleAddressBo) {
		this.simpleAddressBo = simpleAddressBo;
	}

	 public User getLandlord() {
	 return landlord;
	 }
	
	 public void setLandlord(User landlord) {
	 this.landlord = landlord;
	 }

	 public Set<User> getTenants() {
	 return tenants;
	 }
	
	 public void setTenants(Set<User> tenants) {
	 this.tenants = tenants;
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

	// public Set<String> getPhotos() {
	// return photos;
	// }
	//
	// public void setPhotos(Set<String> photos) {
	// this.photos = photos;
	// }

	public Boolean getPropertyActive() {
		return propertyActive;
	}

	public void setPropertyActive(Boolean propertyActive) {
		this.propertyActive = propertyActive;
	}

	public Long getId() {
		return Id;
	}

	@Override
	public String toString() {
		return new ToStringBuilder(this)
				.append("Id", this.getId())
				// .append("creationTime", this.getCreationTime())
				// .append("modificationTime", this.getModificationTime())
				// .append("version", this.getVersion())
				.append("addressId", this.getSimpleAddressBo().getId())
				.append("landlordId", this.getLandlord())
//				.append("tenantId", this.getTenants().toString())
				.append("security deposit", this.getSecurityDeposit().toString())
				.append("rent amount", this.getRentAmount().toString())
				.append("due date", new SimpleDateFormat("MM/dd/yyyy").format(this.getDueDate()))
				.append("property active", this.getPropertyActive().toString())
				.toString();
	}
}
