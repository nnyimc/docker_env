package fr.nnyimc.studentinformationsystem.studentinfo;

import java.util.*;

public class DateCreator {
    private static final GregorianCalendar GREGORIAN_CALENDAR = new GregorianCalendar();
    private int year;
    private int month;
    private int date;

    public DateCreator(int year, int month, int date) {
		this.year = year;
		this.month = month;
		this.date = date;
	}

	public GregorianCalendar getGregorianCalendar() {
		return GREGORIAN_CALENDAR;
	}
	
	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDate() {
		return date;
	}

	public Date createDate() {
		GREGORIAN_CALENDAR.clear();
		GREGORIAN_CALENDAR.set(Calendar.YEAR, year);
		GREGORIAN_CALENDAR.set(Calendar.MONTH, month - 1);
		GREGORIAN_CALENDAR.set(Calendar.DAY_OF_MONTH, date);
		return GREGORIAN_CALENDAR.getTime();
	}

}
