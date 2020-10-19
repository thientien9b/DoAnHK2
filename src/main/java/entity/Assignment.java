package entity;

import java.time.LocalDate;

public class Assignment {

	private int ID_assignment;
	private LocalDate time_ass;
	private Boolean status_ass;
	private String ID_em;
	
	public Assignment() {
	}

	public Assignment(int iD_assignment, LocalDate time_ass, Boolean status_ass, String iD_em) {
		ID_assignment = iD_assignment;
		this.time_ass = time_ass;
		this.status_ass = status_ass;
		ID_em = iD_em;
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

	public String getID_em() {
		return ID_em;
	}

	public void setID_em(String iD_em) {
		ID_em = iD_em;
	}

	@Override
	public String toString() {
		return "Assignment [ID_assignment=" + ID_assignment + ", time_ass=" + time_ass + ", status_ass=" + status_ass
				+ ", ID_em=" + ID_em + "]";
	}
	
	
	
}
