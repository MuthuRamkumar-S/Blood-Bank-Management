package com.example.demo;

public class Donar1 {

	public char getName() {
		return name;
	}
	public void setName(char name) {
		this.name = name;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public char getAge() {
		return age;
	}
	public void setAge(char age) {
		this.age = age;
	}
	public char getBgp() {
		return bgp;
	}
	public void setBgp(char bgp) {
		this.bgp = bgp;
	}
	public char getCity() {
		return city;
	}
	public void setCity(char city) {
		this.city = city;
	}
	public char getDistrict() {
		return district;
	}
	public void setDistrict(char district) {
		this.district = district;
	}
	public char getState() {
		return state;
	}
	public void setState(char state) {
		this.state = state;
	}
	public char getPhn() {
		return phn;
	}
	public void setPhn(char phn) {
		this.phn = phn;
	}
	public char getEmail() {
		return email;
	}
	public void setEmail(char email) {
		this.email = email;
	}
	public char getExp() {
		return exp;
	}
	public void setExp(char exp) {
		this.exp = exp;
	}
	public char getHexp() {
		return hexp;
	}
	public void setHexp(char hexp) {
		this.hexp = hexp;
	}
	@Override
	public String toString() {
		return "Donar1 [name=" + name + ", gender=" + gender + ", age=" + age + ", bgp=" + bgp + ", city=" + city
				+ ", district=" + district + ", state=" + state + ", phn=" + phn + ", email=" + email + ", exp=" + exp
				+ ", hexp=" + hexp + "]";
	}
	private char name;
	private char gender;
	private char age;
	private char bgp;
	private char city;
	private char district;
	private char state;
	private char phn;
	private char email;
	private char exp;
	private char hexp;
}
