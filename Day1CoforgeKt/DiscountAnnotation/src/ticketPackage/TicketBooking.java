package ticketPackage;

public class TicketBooking {
	
	
	private	int   numberOfPersons;
	private	Double   fare;
	
	public int getNumberOfPersons() {
		return numberOfPersons;
	}
	public void setNumberOfPersons(int numberOfPersons) {
		this.numberOfPersons = numberOfPersons;
	}
	public Double getFare() {
		return fare;
	}
	public void setFare(Double fare) {
		this.fare = fare;
	}
	
	
	public double faregenerator(int x , int count) {
		
		int value =100-x;
		Double output = (value*getFare())/100;
		return output*count;
	}
	

}
