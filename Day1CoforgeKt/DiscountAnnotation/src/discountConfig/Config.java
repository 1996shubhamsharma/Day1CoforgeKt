package discountConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import ticketPackage.TicketBooking;

@Configuration
@ComponentScan("discountConfig")
public class Config {
	
	@Bean
	public TicketBooking ticketBooking() {
		
		TicketBooking ticketBooking = new TicketBooking();
		ticketBooking.setFare(230.0);
		ticketBooking.setNumberOfPersons(3);
		
		return ticketBooking;
	}

}
