package com.zensar.bean;

import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Address")

public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	
	
	int addressId;
	@Column
	String cityName;
	@Column
	String pincode;
	@Embedded
	Employee employee;

	public Address(int addressId, String cityName, String pincode, Employee employee) {
		super();
		this.addressId = addressId;
		this.cityName = cityName;
		this.pincode = pincode;
		this.employee = employee;
	}

	public Address(String cityName, String pincode, Employee employee) {
		super();
		this.cityName = cityName;
		this.pincode = pincode;
		this.employee = employee;
	}

	public Address(int addressId) {
		super();
		this.addressId = addressId;
	}

	public Address() {
		super();
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", cityName=" + cityName + ", pincode=" + pincode + ", employee="
				+ employee + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(addressId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return addressId == other.addressId;
	}

	
}
