package entity;

import java.sql.Date;
import java.time.LocalDate;

public class Employee {

	private int ID_em;
	private String Fullname;
	private LocalDate Date_em;
	private Boolean Gender_em;
	private String Address_em;
	private int Phone_em;
	private String Email_em;
	private int ID_majors;
	private int ID_position;
	private int ID_wage;
	
	public Employee() {
	}
	public Employee(int iD_em, String fullname, LocalDate date_em, Boolean gender_em, String address_em, int phone_em,
			String email_em, int iD_majors, int iD_position, int iD_wage) {
		ID_em = iD_em;
		Fullname = fullname;
		Date_em = date_em;
		Gender_em = gender_em;
		Address_em = address_em;
		Phone_em = phone_em;
		Email_em = email_em;
		ID_majors = iD_majors;
		ID_position = iD_position;
		ID_wage = iD_wage;
	}

	public int getID_em() {
		return ID_em;
	}

	public void setID_em(int iD_em) {
		ID_em = iD_em;
	}

	public String getFullname() {
		return Fullname;
	}

	public void setFullname(String fullname) {
		Fullname = fullname;
	}

	public LocalDate getDate_em() {
		return Date_em;
	}

	public void setDate_em(LocalDate date_em) {
		Date_em = date_em;
	}

	public Boolean getGender_em() {
		return Gender_em;
	}

	public void setGender_em(Boolean gender_em) {
		Gender_em = gender_em;
	}

	public String getAddress_em() {
		return Address_em;
	}

	public void setAddress_em(String address_em) {
		Address_em = address_em;
	}

	public int getPhone_em() {
		return Phone_em;
	}

	public void setPhone_em(int phone_em) {
		Phone_em = phone_em;
	}

	public String getEmail_em() {
		return Email_em;
	}

	public void setEmail_em(String email_em) {
		Email_em = email_em;
	}

	public int getID_majors() {
		return ID_majors;
	}

	public void setID_majors(int iD_majors) {
		ID_majors = iD_majors;
	}

	public int getID_position() {
		return ID_position;
	}

	public void setID_position(int iD_position) {
		ID_position = iD_position;
	}

	public int getID_wage() {
		return ID_wage;
	}

	public void setID_wage(int iD_wage) {
		ID_wage = iD_wage;
	}

	@Override
	public String toString() {
		return "Employee [ID_em=" + ID_em + ", Fullname=" + Fullname + ", Date_em=" + Date_em + ", Gender_em="
				+ Gender_em + ", Address_em=" + Address_em + ", Phone_em=" + Phone_em + ", Email_em=" + Email_em
				+ ", ID_majors=" + ID_majors + ", ID_position=" + ID_position + ", ID_wage=" + ID_wage + "]";
	}

}

