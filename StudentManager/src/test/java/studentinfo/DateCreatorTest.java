package studentinfo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import fr.nnyimc.studentinformationsystem.studentinfo.DateCreator;
import junit.framework.TestCase;

public class DateCreatorTest extends TestCase {
	private DateCreator dateCreator;
	private Date initial;
	
	public void setUp(){
		int year = 2020;
		int month = 12;
		int date = 12;
		dateCreator = new DateCreator(year, month, date);
		initial = dateCreator.createDate();
	}	
	
	public void testCreate() {
		assertNotNull(dateCreator);
	}
	
	public void testCreateDate() {
		GregorianCalendar calendar = dateCreator.getGregorianCalendar();
		calendar.clear();
		calendar.set(Calendar.YEAR, dateCreator.getYear());
		calendar.set(Calendar.MONTH, dateCreator.getMonth() -1);
		calendar.set(Calendar.DAY_OF_MONTH, dateCreator.getDate());

		assertEquals(initial, calendar.getTime());
	}
}
