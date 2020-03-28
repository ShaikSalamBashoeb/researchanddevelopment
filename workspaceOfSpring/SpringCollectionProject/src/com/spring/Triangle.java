package com.spring;

import java.util.List;
import java.util.Map;

public class Triangle {

	private List<Point> listOfPoints;
	private Map<String, String> mapOfPoints;
	
	public void setListOfPoints(List<Point> listOfPoints) {
		this.listOfPoints = listOfPoints;
	}

	public List<Point> getListOfPoints() {
		return listOfPoints;
	}

	public void setMapOfPoints(Map<String, String> mapOfPoints) {
		this.mapOfPoints = mapOfPoints;
	}

	public Map<String, String> getMapOfPoints() {
		return mapOfPoints;
	}
}
