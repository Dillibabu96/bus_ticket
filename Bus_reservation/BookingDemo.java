package Bus_reservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BookingDemo {
	public static void main(String[] args) {
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<Booking>();
		buses.add(new Bus(1, false, 2));
		buses.add(new Bus(2, true, 25));
		for(Bus b:buses) {
			b.businfo();
		}
		int userOpt = 1;
		Scanner scanner = new Scanner(System.in);
		while(userOpt==1) {
			System.out.print("Enter 1 for booking 2 for Exit:");
			userOpt = scanner.nextInt();
			if(userOpt==1) {
				Booking booking = new Booking();
				if(booking.isAvailable(bookings , buses)) {
					bookings.add(booking);
					System.out.println("Your booking is conformed..");
				}
				else {
					System.out.println("try another bus or another date.");
				}
			}
			
		}
	}
}
