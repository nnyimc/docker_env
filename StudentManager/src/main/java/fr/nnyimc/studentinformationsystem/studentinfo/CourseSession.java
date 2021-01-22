package fr.nnyimc.studentinformationsystem.studentinfo;

import java.util.*;

public class CourseSession {
    
	private String department;
	private String number;
	private ArrayList<Student> studentsList = new ArrayList<Student>();
	private Date startDate;

	public CourseSession(final String department, final String number, Date startDate) {
		this.department = department;
		this.number = number;
		this.startDate = startDate;
	}

	public String getDepartment() {
		return department;
	}

	public String getNumber() {
		return number;
	}


	public void enrollStudent(final Student student1) {
		studentsList.add(student1);
	}

	public ArrayList<Student> getAllStudents() {
		return studentsList;
	}

	public Date getEndDate() {
		GregorianCalendar calendar = new GregorianCalendar();
		calendar.setTime(startDate);
		int numberOfDays = 16 * 7 - 3;
		calendar.add(Calendar.DAY_OF_YEAR, numberOfDays);
		return calendar.getTime();
	}
	
	public Date getStartDate() {
		return startDate;
	}

}
