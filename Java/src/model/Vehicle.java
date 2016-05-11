package model;

public class Vehicle {
	private String vehicleId;
	private String vehicleType;
	private int capacity;
	private String image;
	private String plateNum;
	private String model;
	private String brand;
	private String status;

	public Vehicle() {
		
	}
	
	public Vehicle(String vehicleId, String vehicleType, int capacity, String image, String plateNum, String model,
			String brand, String status) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.capacity = capacity;
		this.image = image;
		this.plateNum = plateNum;
		this.model = model;
		this.brand = brand;
		this.status = status;
	}

	public String getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(String vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getPlateNum() {
		return plateNum;
	}

	public void setPlateNum(String plateNum) {
		this.plateNum = plateNum;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
