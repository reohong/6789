package Model;

public class festivalDTO {
	private int num;
	private String ftitle;
	private String fdate;
	private String flocation;
	private String ftheme;
	
	public festivalDTO(int num, String ftitle, String fdate, String flocation, String ftheme) {
		
		this.num = num;
		this.ftitle = ftitle;
		this.fdate = fdate;
		this.flocation = flocation;
		this.ftheme = ftheme;
	}
	public int getNum() {
		return num;
	}
	public String getFtitle() {
		return ftitle;
	}
	public String getFdate() {
		return fdate;
	}
	public String getFlocation() {
		return flocation;
	}
	public String getFtheme() {
		return ftheme;
	}
	
	

}
