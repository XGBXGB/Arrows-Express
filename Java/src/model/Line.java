package model;

public class Line {
	private String lineNum;
	private String lineName;

	public Line() {
		
	}
	
	public Line(String lineNum, String lineName) {
		super();
		this.lineNum = lineNum;
		this.lineName = lineName;
	}

	public String getLineNum() {
		return lineNum;
	}

	public void setLineNum(String lineNum) {
		this.lineNum = lineNum;
	}

	public String getLineName() {
		return lineName;
	}

	public void setLineName(String lineName) {
		this.lineName = lineName;
	}

}
