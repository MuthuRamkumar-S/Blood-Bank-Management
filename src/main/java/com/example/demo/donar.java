package com.example.demo;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.amqp.RabbitProperties.Cache.Connection;

@Entity
public class donar 
{
	@Id
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getBgp() {
		return bgp;
	}
	public void setBgp(String bgp) {
		this.bgp = bgp;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPhn() {
		return phn;
	}
	public void setPhn(String phn) {
		this.phn = phn;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getExp() {
		return exp;
	}
	public void setExp(String exp) {
		this.exp = exp;
	}
	public String getHexp() {
		return hexp;
	}
	public void setHexp(String hexp) {
		this.hexp = hexp;
	}
	@Override
	public String toString() {
		return "donar [name=" + name + ", gender=" + gender + ", age=" + age + ", bgp=" + bgp + ", city=" + city
				+ ", district=" + district + ", state=" + state + ", phn=" + phn + ", email=" + email + ", exp=" + exp
				+ ", hexp=" + hexp + "]";
	}
	private String gender;
	private String age;
	private String bgp;
	private String city;
	private String district;
	private String state;
	private String phn;
	private String email;
	private String exp;
	private String hexp;
	
}
