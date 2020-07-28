package Place_FestivalGUI;

public class place_DTO {

	int num;
	String gegu;
	String name;
	String address;
	
	public int getNum() {
		return num;
	}

	public String getGegu() {
		return gegu;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}
	
	public place_DTO(int num, String gegu, String name, String address) {
		super();
		this.num = num;
		this.gegu = gegu;
		this.name = name;
		this.address = address;
	}
	
	
	
	
	
}
