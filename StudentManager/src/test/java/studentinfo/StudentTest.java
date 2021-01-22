package studentinfo;

import fr.nnyimc.studentinformationsystem.studentinfo.Student;

public class StudentTest extends junit.framework.TestCase {
	final String firstStudent = "Jane Doe";
	final String secondStudent = "Jean Roucas";
	
	public void testCreate() {
		Student student = new Student( firstStudent );
		assertEquals( "Jane Doe", student.getName() );
		
		Student foreignStudent = new Student( secondStudent );
		assertEquals( "Jean Roucas", foreignStudent.getName() );

	}
	
}
