package entity;

public class Position {

	private String ID_position;
	private String Name_position;
	private String Ranks_position;
	

	public Position() {
			}
	
	public Position(String iD_position, String name_position, String ranks_position) {
		ID_position = iD_position;
		Name_position = name_position;
		Ranks_position = ranks_position;
	}

	public String getID_position() {
		return ID_position;
	}

	public void setID_position(String iD_position) {
		ID_position = iD_position;
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

	@Override
	public String toString() {
		return "Position [ID_position=" + ID_position + ", Name_position=" + Name_position + ", Ranks_position="
				+ Ranks_position + "]";
	}
	
	
}
