package entity;

import java.time.LocalDate;

public class Hospital {
	private String ID_em;
	private String Fullname;
	private LocalDate Date_em;
	private Boolean Gender_em;
	private String Address_em;
	private int Phone_em;
	private String Email_em;
	private String ID_majors;
	private String ID_position;
	private String ID_salary;
	private int ID_assignment;
	private LocalDate time_ass;
	private Boolean status_ass;
	private String password_acc;
	private String Name_position;
	private String Ranks_position;
	private Double Basic_salary;
	private Double Coefficients_salary;
	private Double Allowance_salary;
	private int Date_all;
	private Double Salary_all;
	private String Name_majors;
	private String Address_majors;
	
	
	
	public Hospital(String iD_em, String fullname, LocalDate date_em, Boolean gender_em, String address_em,
			int phone_em, String email_em, String iD_majors, String iD_position, String iD_salary, int iD_assignment,
			LocalDate time_ass, Boolean status_ass, String password_acc, String name_position, String ranks_position,
			Double basic_salary, Double coefficients_salary, Double allowance_salary, int date_all, Double salary_all,
			String name_majors, String address_majors) {
		ID_em = iD_em;
		Fullname = fullname;
		Date_em = date_em;
		Gender_em = gender_em;
		Address_em = address_em;
		Phone_em = phone_em;
		Email_em = email_em;
		ID_majors = iD_majors;
		ID_position = iD_position;
		ID_salary = iD_salary;
		ID_assignment = iD_assignment;
		this.time_ass = time_ass;
		this.status_ass = status_ass;
		this.password_acc = password_acc;
		Name_position = name_position;
		Ranks_position = ranks_position;
		Basic_salary = basic_salary;
		Coefficients_salary = coefficients_salary;
		Allowance_salary = allowance_salary;
		Date_all = date_all;
		Salary_all = salary_all;
		Name_majors = name_majors;
		Address_majors = address_majors;
	}


	public Hospital() {
	}
	
	
	public String getName_majors() {
		return Name_majors;
	}
	public void setName_majors(String name_majors) {
		Name_majors = name_majors;
	}
	public String getAddress_majors() {
		return Address_majors;
	}
	public void setAddress_majors(String address_majors) {
		Address_majors = address_majors;
	}
	public String getID_em() {
		return ID_em;
	}
	public void setID_em(String iD_em) {
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
	public String getID_majors() {
		return ID_majors;
	}
	public void setID_majors(String iD_majors) {
		ID_majors = iD_majors;
	}
	public String getID_position() {
		return ID_position;
	}
	public void setID_position(String iD_position) {
		ID_position = iD_position;
	}
	public String getID_salary() {
		return ID_salary;
	}
	public void setID_salary(String iD_salary) {
		ID_salary = iD_salary;
	}
	public int getID_assignment() {
		return ID_assignment;
	}
	public void setID_assignment(int iD_assignment) {
		ID_assignment = iD_assignment;
	}
	public LocalDate getTime_ass() {
		return time_ass;
	}
	public void setTime_ass(LocalDate time_ass) {
		this.time_ass = time_ass;
	}
	public Boolean getStatus_ass() {
		return status_ass;
	}
	public void setStatus_ass(Boolean status_ass) {
		this.status_ass = status_ass;
	}
	public String getPassword_acc() {
		return password_acc;
	}
	public void setPassword_acc(String password_acc) {
		this.password_acc = password_acc;
	}
	public String getName_position() {
		return Name_position;
	}
	public void setName_position(String name_position) {
		Name_position = name_position;
	}
	public String getRanks_position() {
		return Ranks_position;
	}
	public void setRanks_position(String ranks_position) {
		Ranks_position = ranks_position;
	}
	public Double getBasic_salary() {
		return Basic_salary;
	}
	public void setBasic_salary(Double basic_salary) {
		Basic_salary = basic_salary;
	}
	public Double getCoefficients_salary() {
		return Coefficients_salary;
	}
	public void setCoefficients_salary(Double coefficients_salary) {
		Coefficients_salary = coefficients_salary;
	}
	public Double getAllowance_salary() {
		return Allowance_salary;
	}
	public void setAllowance_salary(Double allowance_salary) {
		Allowance_salary = allowance_salary;
	}
	public int getDate_all() {
		return Date_all;
	}
	public void setDate_all(int date_all) {
		Date_all = date_all;
	}
	public Double getSalary_all() {
		return Salary_all;
	}
	public void setSalary_all(Double salary_all) {
		Salary_all = salary_all;
	}
	@Override
	public String toString() {
		return "Hospital [ID_em=" + ID_em + ", Fullname=" + Fullname + ", Date_em=" + Date_em + ", Gender_em="
				+ Gender_em + ", Address_em=" + Address_em + ", Phone_em=" + Phone_em + ", Email_em=" + Email_em
				+ ", ID_majors=" + ID_majors + ", ID_position=" + ID_position + ", ID_salary=" + ID_salary
				+ ", ID_assignment=" + ID_assignment + ", time_ass=" + time_ass + ", status_ass=" + status_ass
				+ ", password_acc=" + password_acc + ", Name_position=" + Name_position + ", Ranks_position="
				+ Ranks_position + ", Basic_salary=" + Basic_salary + ", Coefficients_salary=" + Coefficients_salary
				+ ", Allowance_salary=" + Allowance_salary + ", Date_all=" + Date_all + ", Salary_all=" + Salary_all
				+ ", Name_majors=" + Name_majors + ", Address_majors=" + Address_majors + "]";
	}


}
