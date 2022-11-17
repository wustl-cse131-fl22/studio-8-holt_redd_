package studio8;

import java.util.LinkedList;
import java.util.Objects;

public class Appointment {
	private Date date; 
	private Time time;

	/**
	 * 
	 * @param initDate date
	 * @param initTime time
	 */
	public Appointment (Date initDate, Time initTime) {
		date = initDate;
		time = initTime;
	}
	public String toString() {
		String appointment = "";
		appointment = this.date + " at " + this.time;
		return appointment;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date d1 = new Date (12,28,2022,false);
		Time t1 = new Time (10,30);
		Date d2 = new Date (11,22,2022,false);
		Time t2 = new Time (2,40);
		Date d3 = new Date (11,22,2022,false);
		Time t3 = new Time (8,20);
		Appointment dentist = new Appointment (d1,t1);
		Appointment a1 = new Appointment (d2,t2);
		Appointment a2 = new Appointment (d3,t3);
		LinkedList<Appointment> calendar = new LinkedList<Appointment>();
		calendar.add(dentist);
		calendar.add(a1);
		calendar.add(a2);
		System.out.println(calendar);

	}
	@Override
	public int hashCode() {
		return Objects.hash(date, time);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Appointment other = (Appointment) obj;
		return Objects.equals(date, other.date) && Objects.equals(time, other.time);
	}

}
