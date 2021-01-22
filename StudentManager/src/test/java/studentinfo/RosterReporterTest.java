package studentinfo;

import java.util.*;

import fr.nnyimc.studentinformationsystem.studentinfo.CourseSession;
import fr.nnyimc.studentinformationsystem.studentinfo.DateCreator;
import junit.framework.TestCase;


public class RosterReporterTest extends TestCase {
	private CourseSession courseSession;
	
	public void setUp() {
		courseSession = new CourseSession("FRA", "222", new DateCreator(2020, 11, 14).createDate());
	}

	public void testCreate() {
		assertEquals(courseSession.getNumber(), "222");
	}
	
}
