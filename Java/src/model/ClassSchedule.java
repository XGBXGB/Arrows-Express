package model;

import java.sql.Date;

public class ClassSchedule {
	private String schedId;
	private String academicYear;
	private String courseCode;
	private Date startTime;
	private Date endTime;
	private int term;
	private String day;

	public ClassSchedule() {
	}

	public ClassSchedule(String schedId, String academicYear, String courseCode, Date startTime, Date endTime, int term,
			String day) {
		super();
		this.schedId = schedId;
		this.academicYear = academicYear;
		this.courseCode = courseCode;
		this.startTime = startTime;
		this.endTime = endTime;
		this.term = term;
		this.day = day;
	}

	public String getSchedId() {
		return schedId;
	}

	public void setSchedId(String schedId) {
		this.schedId = schedId;
	}

	public String getAcademicYear() {
		return academicYear;
	}

	public void setAcademicYear(String academicYear) {
		this.academicYear = academicYear;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	public Date getStartTime() {
		return startTime;
	}

	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}

	public Date getEndTime() {
		return endTime;
	}

	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}

	public int getTerm() {
		return term;
	}

	public void setTerm(int term) {
		this.term = term;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

}
