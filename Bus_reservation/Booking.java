package Bus_reservation;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Booking {
		String passengerName;
		int busNo;
		Date date;
		Booking() {
				Scanner scanner = new Scanner(System.in);
				System.out.print("Enter the passengerName: ");
				passengerName = scanner.next();
				System.out.print("Enter the bus number: ");
				busNo = scanner.nextInt();
				System.out.print("Enter the date: ");
				String dateInputString = scanner.next();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
				try {
					date = dateFormat.parse(dateInputString);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
		}
		public boolean isAvailable(ArrayList<Booking> bookings , ArrayList<Bus> buses) {
			int capacity = 0;
			for(Bus bus : buses) {
				if(bus.getBusNumber() == busNo ) {
					capacity = bus.getCapacity();
				}
			}
			int bookedSceat = 0;
			for(Booking booked : bookings) {
				if(booked.busNo == busNo && booked.date.equals(date)) {
					bookedSceat++;
				}
			}
			return bookedSceat<capacity?true:false;
		}
}
