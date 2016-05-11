package model;

import java.sql.Date;

public class TripSchedule {
	private String tripSchedId;
	private Date depTime;
	private String routeId;

	public TripSchedule() {

	}

	public TripSchedule(String tripSchedId, Date depTime, String routeId) {
		super();
		this.tripSchedId = tripSchedId;
		this.depTime = depTime;
		this.routeId = routeId;
	}

	public String getTripSchedId() {
		return tripSchedId;
	}

	public void setTripSchedId(String tripSchedId) {
		this.tripSchedId = tripSchedId;
	}

	public Date getDepTime() {
		return depTime;
	}

	public void setDepTime(Date depTime) {
		this.depTime = depTime;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

}
