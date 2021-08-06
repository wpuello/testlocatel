package com.prueba.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import com.sun.istack.NotNull;

@Entity
@Table (name= "person")
@Inheritance(strategy=InheritanceType.JOINED)
public class person  implements Serializable{
/*Implemento seriaizable  para validar que cuando se utilize la clase o se deserialize
 siempre mantenga la misma version de compilado en el caso de no ser asi no la podrá utilizar  */
	/**/
	private static final long serialVersionUID = -8905038873373783368L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="Id",unique= true)
	private Integer Id;
	
	
	
	@NotNull
	@Column(name="Name",length = 255,unique= true)
	private String Name;
	
	@Column (name="PhoneNumber",length = 100)
	private String PhoneNumber;
	

	@Column (name="EmailAddress",length = 255)
	private String EmailAddress;


	public Integer getId() {
		return Id;
	}


	public void setId(Integer id) {
		Id = id;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public String getPhoneNumber() {
		return PhoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}


	public String getEmailAddress() {
		return EmailAddress;
	}


	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}

	
	
	
	
}
