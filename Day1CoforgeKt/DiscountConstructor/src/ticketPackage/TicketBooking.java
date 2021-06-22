package ticketPackage;

public class TicketBooking {


	private	int   numberOfPersons;
	private	Double   fare;
	public TicketBooking(int numberOfPerson, Double fare) {
	
		this.numberOfPersons=numberOfPerson;
		this.fare=fare;
		
	}
	public int getNumberOfPersons() {
			return numberOfPersons;
	}

	public Double getFare() {
			return fare;
	}	
public double faregenerator(int x , int count) {
		
		int value =100-x;
		Double output = (value*getFare())/100;
		
		return output*count  ;
	}
	
	
}
