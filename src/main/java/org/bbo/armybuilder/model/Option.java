package org.bbo.armybuilder.model;

import java.util.List;

public class Option {
	private String name;
	private int points;
	private int pointsPerModel;
	private List<Option> options;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getPointsPerModel() {
		return pointsPerModel;
	}
	public void setPointsPerModel(int pointsPerModel) {
		this.pointsPerModel = pointsPerModel;
	}
	public List<Option> getOptions() {
		return options;
	}
	public void setOptions(List<Option> options) {
		this.options = options;
	}
}
