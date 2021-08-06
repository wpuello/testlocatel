package com.prueba.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
//import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name= "professor")
@PrimaryKeyJoinColumn(name="Idperson")
public class professor extends person {

	private static final long serialVersionUID = 3345037012227973494L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="Id",unique= true)
	private Integer Id;
	
	@Column(name="Salary")
	private Double Salary;
	
	
	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public Double getSalary() {
		return Salary;
	}

	public void setSalary(Double salary) {
		Salary = salary;
	}
	
	
	
}
