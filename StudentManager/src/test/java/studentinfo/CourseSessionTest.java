package studentinfo;

import java.util.*;

import fr.nnyimc.studentinformationsystem.studentinfo.CourseSession;
import fr.nnyimc.studentinformationsystem.studentinfo.DateCreator;
import fr.nnyimc.studentinformationsystem.studentinfo.Student;


public class CourseSessionTest extends junit.framework.TestCase {
	
	private CourseSession courseSession;
	
	public void setUp() {
		Date startDate = new DateCreator(2003, 1, 25).createDate();
		courseSession = new CourseSession("ENG", "101", startDate);
	}
	
	public void testCreate() {
		assertEquals("ENG", courseSession.getDepartment());
		assertEquals("101", courseSession.getNumber());
	}
	
	public void testEnrollStudents() {
		Student student1 = new Student("Jean Beliveau");
		courseSession.enrollStudent(student1);
		
		java.util.ArrayList<Student> allStudents = courseSession.getAllStudents();
		assertEquals(1, allStudents.size());
		assertEquals(student1, allStudents.get(0));
		
		
		Student student2 = new Student("Utada Hikaru");
		courseSession.enrollStudent(student2);
		assertEquals(2, allStudents.size());
		assertEquals(student2, allStudents.get(1));

	}
	
	public void testCourseDates() {
		Date startDate = new DateCreator(2003, 1, 6).createDate();
		CourseSession courseSession = new CourseSession("ABCD", "200", startDate);
		Date sixteenWeeksOut = new DateCreator(2003, 4, 25).createDate ();
		assertEquals(sixteenWeeksOut, courseSession.getEndDate());
	}
	
}
