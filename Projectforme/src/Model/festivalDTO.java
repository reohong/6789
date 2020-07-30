package Model;

public class festivalDTO {
	private String ftitle;
	private String fdate;
	private String flocation;
	private String ftheme;
	
	public festivalDTO(String ftitle, String fdate, String flocation, String ftheme) {
		
		
		this.ftitle = ftitle;
		this.fdate = fdate;
		this.flocation = flocation;
		this.ftheme = ftheme;
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
