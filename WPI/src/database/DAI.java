package database;

public interface DAI {
	public String getAirports(String ticketAgency);
	public String getAirplanes(String ticketAgency);
	public String getFlightsDeparting(String team, String airportCode, String day);
	public String lock (String ticketAgency) ;
	public String unlock (String ticketAgency);
	public String reserve (String ticketAgency, String xmlFlights) ;
}
