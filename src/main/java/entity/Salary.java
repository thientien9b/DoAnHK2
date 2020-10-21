package entity;

public class Salary {
	private String ID_salary;
	private Double Basic_salary;
	private Double Coefficcients_salary;
	private Double Allowance_salary;
	
	public Salary() {
	}

	public Salary(String iD_salary, Double basic_salary, Double coefficcients_salary, Double allowance_salary) {
		ID_salary = iD_salary;
		Basic_salary = basic_salary;
		Coefficcients_salary = coefficcients_salary;
		Allowance_salary = allowance_salary;
	}

	public String getID_salary() {
		return ID_salary;
	}

	public void setID_salary(String iD_salary) {
		ID_salary = iD_salary;
	}

	public Double getBasic_salary() {
		return Basic_salary;
	}

	public void setBasic_salary(Double basic_salary) {
		Basic_salary = basic_salary;
	}

	public Double getCoefficcients_salary() {
		return Coefficcients_salary;
	}

	public void setCoefficcients_salary(Double coefficcients_salary) {
		Coefficcients_salary = coefficcients_salary;
	}

	public Double getAllowance_salary() {
		return Allowance_salary;
	}

	public void setAllowance_salary(Double allowance_salary) {
		Allowance_salary = allowance_salary;
	}

	@Override
	public String toString() {
		return "Salary [ID_salary=" + ID_salary + ", Basic_salary=" + Basic_salary + ", Coefficcients_salary="
				+ Coefficcients_salary + ", Allowance_salary=" + Allowance_salary + "]";
	}
	
	
	
}
