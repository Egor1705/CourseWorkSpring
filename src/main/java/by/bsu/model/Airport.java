package by.bsu.model;

public class Airport {
	private int id_airport;
	private String airport_name;
	private String city_name;
	private int id_plane_airport;
	
	
	public int getId_airport() {
		return id_airport;
	}
	public void setId_airport(int id_airport) {
		this.id_airport = id_airport;
	}
	public String getAirport_name() {
		return airport_name;
	}
	public void setAirport_name(String airport_name) {
		this.airport_name = airport_name;
	}
	public String getCity_name() {
		return city_name;
	}
	public void setCity_name(String city_name) {
		this.city_name = city_name;
	}
	public int getId_plane_airport() {
		return id_plane_airport;
	}
	public void setId_plane_airport(int id_plane_airport) {
		this.id_plane_airport = id_plane_airport;
	}
}
