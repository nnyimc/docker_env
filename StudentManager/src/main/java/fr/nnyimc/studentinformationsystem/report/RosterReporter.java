package fr.nnyimc.studentinformationsystem.report;

import fr.nnyimc.studentinformationsystem.studentinfo.CourseSession;
import fr.nnyimc.studentinformationsystem.studentinfo.Student;

public class RosterReporter {
	public static final String NEW_LINE = System.getProperty("line.separator");
	public static final String ROSTER_REPORT_HEADER = "Student" + NEW_LINE + "-" + NEW_LINE;
	public static final String ROSTER_REPORT_FOOTER = NEW_LINE + "#students = ";
	public static final StringBuilder STRING_BUFFER = new StringBuilder();
	private CourseSession courseSession;
    
	public RosterReporter(final CourseSession courseSession) {
		this.courseSession = courseSession;
	}

	public String getReport() {
		generateReportHeader(STRING_BUFFER);
		generateReportBody(STRING_BUFFER);
		generateReportFooter(STRING_BUFFER);
		return STRING_BUFFER.toString();
	}

	
	private void generateReportHeader(StringBuilder buffer) {
		buffer.append(ROSTER_REPORT_HEADER);
	}
	
	private void generateReportBody(StringBuilder buffer) {
		for (Student s: courseSession.getAllStudents()) {
			buffer.append( s.getName()+ NEW_LINE);
		}
	}
	
	private void generateReportFooter(StringBuilder buffer) {
		buffer.append(ROSTER_REPORT_FOOTER + courseSession.getAllStudents().size() + NEW_LINE);
	}

}
