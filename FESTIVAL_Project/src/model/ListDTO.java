package model;

public class ListDTO {
	private int ord;
	private String name;
	private String day;
	private String loc;
	private String theme;
	private int num;
	private int n_num;
	
	
	
	public ListDTO(int ord, String name, String day, String loc, String theme, int num,int n_num) {
		this.ord = ord;
		this.name = name;
		this.day = day;
		this.loc = loc;
		this.theme = theme;
		this.num = num;
		this.n_num = n_num;
		
	
	}
	
	
	public int getOrd() {
		return ord;
	}
	public String getName() {
		return name;
	}
	public String getDay() {
		return day;
	}
	public String getLoc() {
		return loc;
	}
	public String getTheme() {
		return theme;
	}
	public int getNum() {
		return num;
	}
	public int getN_num() {
		return n_num;
	}

	
	
}
