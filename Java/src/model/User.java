package model;

public class User {
	private String userId;
	private String name;
	private String email;
	private String emergencyContact;
	private String emergencyContactNum;
	private String userType;

	public User() {
	}

	public User(String userId, String name, String email, String emergencyContact, String emergencyContactNum,
			String userType) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.emergencyContact = emergencyContact;
		this.emergencyContactNum = emergencyContactNum;
		this.userType = userType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmergencyContact() {
		return emergencyContact;
	}

	public void setEmergencyContact(String emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public String getEmergencyContactNum() {
		return emergencyContactNum;
	}

	public void setEmergencyContactNum(String emergencyContactNum) {
		this.emergencyContactNum = emergencyContactNum;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

}
