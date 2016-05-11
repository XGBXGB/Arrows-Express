package model;

import java.sql.Date;

public class Reservation {
	private String reservationNum;
	private Date timestamp;
	private String feedback;
	private String purpose;
	private String userId;
	private String tripId;
	private Date tapIn;
	private Date tapOut;

	public Reservation() {

	}

	public Reservation(String reservationNum, Date timestamp, String feedback, String purpose, String userId,
			String tripId, Date tapIn, Date tapOut) {
		super();
		this.reservationNum = reservationNum;
		this.timestamp = timestamp;
		this.feedback = feedback;
		this.purpose = purpose;
		this.userId = userId;
		this.tripId = tripId;
		this.tapIn = tapIn;
		this.tapOut = tapOut;
	}

	public String getReservationNum() {
		return reservationNum;
	}

	public void setReservationNum(String reservationNum) {
		this.reservationNum = reservationNum;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getFeedback() {
		return feedback;
	}

	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public Date getTapIn() {
		return tapIn;
	}

	public void setTapIn(Date tapIn) {
		this.tapIn = tapIn;
	}

	public Date getTapOut() {
		return tapOut;
	}

	public void setTapOut(Date tapOut) {
		this.tapOut = tapOut;
	}

}
