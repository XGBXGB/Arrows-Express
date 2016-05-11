package model;

import java.sql.Date;

public class Trip {
	private String tripId;
	private String remarks;
	private Date tripDate;
	private Date arrivalTime;
	private String status;
	private String tripSchedId;
	private String vehicleId;
	private String driverId;

	public Trip() {
	}

	public Trip(String tripId, String remarks, Date tripDate, Date arrivalTime, String status, String tripSchedId,
			String vehicleId, String driverId) {
		super();
		this.tripId = tripId;
		this.remarks = remarks;
		this.tripDate = tripDate;
		this.arrivalTime = arrivalTime;
		this.status = status;
		this.tripSchedId = tripSchedId;
		this.vehicleId = vehicleId;
		this.driverId = driverId;
	}

	public String getTripId() {
		return tripId;
	}

	public void setTripId(String tripId) {
		this.tripId = tripId;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public Date getTripDate() {
		return tripDate;
	}

	public void setTripDate(Date tripDate) {
		this.tripDate = tripDate;
	}

	public Date getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(Date arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTripSchedId() {
		return tripSchedId;
	}

	public void setTripSchedId(String tripSchedId) {
		this.tripSchedId = tripSchedId;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

}
