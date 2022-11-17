package studio8;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Objects;

public class Date {

	private int month;
	private int day;
	private int year;
	private boolean holiday;

	/**
	 * 
	 * @param initMonth initializes month
	 * @param initDay initializes day
	 * @param initYear initializes year
	 * @param initHoliday initializes holiday
	 */
	public Date (int initMonth,int initDay, int initYear, boolean initHoliday) {
		month = initMonth;
		day = initDay;
		year = initYear;
		holiday = initHoliday;
	}

	public String toString() {
		String date = "";
		date = this.month + "-" + this.day + "-" + this.year;
		return date;
	}

	public static void main(String[] args) {
		Date birthday = new Date(6,5,2002,true);
		//System.out.println(birthday.toString());
		Date birthday2 = new Date(6,5,2002,true);
		//System.out.println(birthday2.toString());
		boolean same = birthday.equals(birthday2);
		//System.out.println(same);
		Date today = new Date (11,17,2022,false);
		Date yesterday = new Date (11,16,2022,false);
		Date tomorrow = new Date (11,18,2022,false);
		LinkedList<Date> list = new LinkedList<Date>();
		list.add(birthday2);
		list.add(birthday);
		list.add(yesterday);
		list.add(today);
		list.add(tomorrow);
		System.out.println(list);
		HashSet<Date> set = new HashSet<Date>();
		set.add(birthday2);
		set.add(birthday);
		set.add(yesterday);
		set.add(today);
		set.add(tomorrow);
		System.out.println(set);
		

	}

	@Override
	public int hashCode() {
		return Objects.hash(day, holiday, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && holiday == other.holiday && month == other.month && year == other.year;
	}

}
