package com.marketingAPP8.dtos;

public class LeadData {
private long id;
private String firstName;
private String lastName;
private String email;
private long mobile;
public long getId() {
	return id;
}
public String getFirstName() {
	return firstName;
}
public String getLastName() {
	return lastName;
}
public String getEmail() {
	return email;
}
public long getMobile() {
	return mobile;
}
public void setId(long id) {
	this.id = id;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public void setEmail(String email) {
	this.email = email;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}

}
