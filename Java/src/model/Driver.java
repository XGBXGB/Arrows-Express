package model;

public class Driver {
	private String driverId;
	private String lastName;
	private String firstName;
	private boolean isAvialable;

	public Driver() {

	}

	public Driver(String driverId, String lastName, String firstName, boolean isAvialable) {
		super();
		this.driverId = driverId;
		this.lastName = lastName;
		this.firstName = firstName;
		this.isAvialable = isAvialable;
	}

	public String getDriverId() {
		return driverId;
	}

	public void setDriverId(String driverId) {
		this.driverId = driverId;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public boolean isAvialable() {
		return isAvialable;
	}

	public void setAvialable(boolean isAvialable) {
		this.isAvialable = isAvialable;
	}

}
