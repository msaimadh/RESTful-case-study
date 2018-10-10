package com.capgemini.customer.entity;

import org.springframework.data.annotation.Id;

/*import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;*/

/*@Entity
@Table(name = "ADDRESS")*/
public class Address {

   
    @Id 
    private String country;
  
    private String state;
   
    private String city;

   private String streetName;
   
   private int zip;

public Address() {
	super();
	// TODO Auto-generated constructor stub
}

public Address(String country, String state, String city, String streetName, int zip) {
	super();
	this.country = country;
	this.state = state;
	this.city = city;
	this.streetName = streetName;
	this.zip = zip;
}

public String getCountry() {
	return country;
}

public void setCountry(String country) {
	this.country = country;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getStreetName() {
	return streetName;
}

public void setStreetName(String streetName) {
	this.streetName = streetName;
}

public int getZip() {
	return zip;
}

public void setZip(int zip) {
	this.zip = zip;
}

}		