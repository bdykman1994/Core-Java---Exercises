package main;

public class ClubMember {

	String name;
	String city;
	String state;
	String fpl;
	
	
	public ClubMember(String name, String city, String state, String fpl) {
		
		this.name = name;
		this.city = city;
		this.state = state;
		this.fpl = fpl;
	}
	

	public ClubMember() {
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}	
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getFpl() {
		return fpl;
	}
	public void setFpl(String fpl) {
		this.fpl = fpl;
	}
	
}
