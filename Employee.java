package com.zensar.bean;

import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	int employeeId;
	@Column
	String name;
	@Column
	double basicSalary;
	@Embedded
	Address address;
	
	@Embedded
	List<Skill> skillList;
	BankAccount account;
	public Employee(int employeeId, String name, double basicSalary, Address address, List<Skill> skillList,
			BankAccount account) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.basicSalary = basicSalary;
		this.address = address;
		this.skillList = skillList;
		this.account = account;
	}
	public Employee(String name, double basicSalary, Address address, List<Skill> skillList, BankAccount account) {
		super();
		this.name = name;
		this.basicSalary = basicSalary;
		this.address = address;
		this.skillList = skillList;
		this.account = account;
	}
	public Employee(int employeeId) {
		super();
		this.employeeId = employeeId;
	}
	public Employee() {
		super();
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBasicSalary() {
		return basicSalary;
	}
	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public List<Skill> getSkillList() {
		return skillList;
	}
	public void setSkillList(List<Skill> skillList) {
		this.skillList = skillList;
	}
	public BankAccount getAccount() {
		return account;
	}
	public void setAccount(BankAccount account) {
		this.account = account;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", name=" + name + ", basicSalary=" + basicSalary + ", address="
				+ address + ", skillList=" + skillList + ", account=" + account + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(employeeId);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return employeeId == other.employeeId;
	}
	

}
