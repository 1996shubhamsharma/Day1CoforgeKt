package test;

import java.util.Scanner;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ticketPackage.TicketBooking;

public class TestMain {

	public static void main(String[] args) {
		
		
		BeanFactory bf = new ClassPathXmlApplicationContext("applicationContext.xml");
		TicketBooking tk = (TicketBooking) bf.getBean("TicketBooking");
		
		Scanner person = new Scanner(System.in);
		int[] arr = new int[3];
		
		for(int i = 0; i<=arr.length-1;i++) {
			if(i==0) {
			System.out.println("Enter no of Senior Citizen");
			}
			if(i==1) {
				System.out.println("Enter no of Ex-Servicemen");
				}
			if(i==2) {
				System.out.println("Enter no of Infant");
				}
			arr[i]=person.nextInt();
			
		}
		System.out.println("Total No. of Persons : "+(arr[0]+arr[1]+arr[2]));
		 System.out.println("Total Fare for Senior Citizen "+(tk.faregenerator(30,arr[0])));
		 System.out.println("Total No of Senior Citizen : " + arr[0] );
		 System.out.println("Total Fare for Ex-ServiceMen "+(tk.faregenerator(50,arr[1])));
		 System.out.println("Total No of Ex-ServiceMen : " + arr[1] );
		 System.out.println("Total Fare for Infant "+(tk.faregenerator(20,arr[2])));
		 System.out.println("Total No of Infants : " + arr[2] );

	}
	
}
