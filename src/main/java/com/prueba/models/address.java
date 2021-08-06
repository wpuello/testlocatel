package com.prueba.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name= "address")
public class address {


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="Id",unique= true)
	private Integer Id;
	
	@Column(name="Street",length = 255)
	private String Street;
	
	@Column(name="City",length = 255)
	private String City;
	
	@Column(name="State",length = 255)
	private String State;
	
	@Column(name="PostalCode",length = 50)
	private String PostalCode;
	
	@Column(name="Country",length = 100)
	private String Country;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPostalCode() {
		return PostalCode;
	}

	public void setPostalCode(String postalCode) {
		PostalCode = postalCode;
	}

	public String getCountry() {
		return Country;
	}

	public void setCountry(String country) {
		Country = country;
	}
	
	
	
	
}
