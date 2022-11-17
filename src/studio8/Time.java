package studio8;

import java.util.Objects;

public class Time {
	
	private int hour;
	private int minute;
	
	/**
	 * constructor 
	 * @param initHour: initializes hour
	 * @param initMinute: initializes minute 
	 * @param initTwelveOrTwentyFour: if the time is on a 12 or 24 hour scale
	 */
	public Time (int initHour, int initMinute) {
		hour = initHour;
		minute = initMinute;
	}
	
	public String toString() {
		String time = this.hour + ":" + this.minute;
		return time;
	}

	public static void main(String[] args) {
		Time wakeUp = new Time (8, 30);
		System.out.println(wakeUp.toString());
		Time sleep = new Time(11,45);
		System.out.println(sleep.toString());
    	boolean same = wakeUp.equals(sleep);
    	System.out.println(same);
    }

	@Override
	public int hashCode() {
		return Objects.hash(hour, minute);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Time other = (Time) obj;
		return hour == other.hour && minute == other.minute;
	}

}