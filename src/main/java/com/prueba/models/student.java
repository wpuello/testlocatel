package com.prueba.models;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table (name= "student")
@PrimaryKeyJoinColumn(name="Idperson")
public class student extends person{
 
	private static final long serialVersionUID = 4432979493231606974L;


	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name="Id",unique= true)
	private Integer Id;
	
	
	@Column(name="StudentNumber")
	private String StudentNumber;
	
	@Column(name="AvegareMark")
	private String AvegareMark;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getStudentNumber() {
		return StudentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		StudentNumber = studentNumber;
	}

	public String getAvegareMark() {
		return AvegareMark;
	}

	public void setAvegareMark(String avegareMark) {
		AvegareMark = avegareMark;
	}
	
	
}

