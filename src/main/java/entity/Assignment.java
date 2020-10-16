package entity;

import java.time.LocalDate;

public class Assignment {

	private int ID_assignment;
	private String Shift_ass;
	private String week_ass;
	private LocalDate time_ass;
	private Boolean status_ass;
	private String ID_em;
	
	public Assignment() {
	}
	
	public Assignment(int iD_assignment, String shift_ass, String week_ass, LocalDate time_ass, Boolean status_ass,
			String iD_em) {
		ID_assignment = iD_assignment;
		Shift_ass = shift_ass;
		this.week_ass = week_ass;
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

	public String getShift_ass() {
		return Shift_ass;
	}

	public void setShift_ass(String shift_ass) {
		Shift_ass = shift_ass;
	}

	public String getWeek_ass() {
		return week_ass;
	}

	public void setWeek_ass(String week_ass) {
		this.week_ass = week_ass;
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
		return "Assignment [ID_assignment=" + ID_assignment + ", Shift_ass=" + Shift_ass + ", week_ass=" + week_ass
				+ ", time_ass=" + time_ass + ", status_ass=" + status_ass + ", ID_em=" + ID_em + "]";
	}
}
