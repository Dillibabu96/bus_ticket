package Bus_reservation;

public class Bus {
		private int busNumber;
		private boolean ac;
		private int capacity;
		Bus(int busNo,boolean ac,int capacity){
			this.busNumber = busNo;
			this.ac = ac;
			this.capacity = capacity;
		}
		public void setBusNumber(int number) {
			busNumber = number;
		}
		public void setAc(boolean Ac) {
			ac = Ac;
		}
		public void setcapacity(int cap ) {
			capacity = cap;
		}
		int getBusNumber() {
			return busNumber;
		}
		boolean getAc() {
			return ac;
		}
		int getCapacity() {
			return capacity;
		}
		public void businfo() {
			System.out.println("busNumber: "+busNumber+" Ac: "+ac+" capacity: "+capacity);
		}
}
