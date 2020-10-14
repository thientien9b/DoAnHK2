package entity;

public class Account {
	private int Id;
	private String ID_em;
	private String password_acc;
	
	public Account() {
	}
	
	public Account(int id, String iD_em, String password_acc) {
		Id = id;
		ID_em = iD_em;
		this.password_acc = password_acc;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getID_em() {
		return ID_em;
	}

	public void setID_em(String iD_em) {
		ID_em = iD_em;
	}

	public String getPassword_acc() {
		return password_acc;
	}

	public void setPassword_acc(String password_acc) {
		this.password_acc = password_acc;
	}

	@Override
	public String toString() {
		return "Account [Id=" + Id + ", ID_em=" + ID_em + ", password_acc=" + password_acc + "]";
	}
	
}
