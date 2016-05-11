package model;

public class Route {
	private String routeId;
	private String routeOrigin;
	private String routeDestination;
	private String routeName;
	private String lineId;

	public Route() {

	}

	public Route(String routeId, String routeOrigin, String routeDestination, String routeName, String lineId) {
		super();
		this.routeId = routeId;
		this.routeOrigin = routeOrigin;
		this.routeDestination = routeDestination;
		this.routeName = routeName;
		this.lineId = lineId;
	}

	public String getRouteId() {
		return routeId;
	}

	public void setRouteId(String routeId) {
		this.routeId = routeId;
	}

	public String getRouteOrigin() {
		return routeOrigin;
	}

	public void setRouteOrigin(String routeOrigin) {
		this.routeOrigin = routeOrigin;
	}

	public String getRouteDestination() {
		return routeDestination;
	}

	public void setRouteDestination(String routeDestination) {
		this.routeDestination = routeDestination;
	}

	public String getRouteName() {
		return routeName;
	}

	public void setRouteName(String routeName) {
		this.routeName = routeName;
	}

	public String getLineId() {
		return lineId;
	}

	public void setLineId(String lineId) {
		this.lineId = lineId;
	}

}
