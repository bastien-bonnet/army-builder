package org.bbo.armybuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Unit {
	private String name;
	private List<Profile> profiles = new ArrayList<Profile>();
	private List<Rule> rules = new ArrayList<Rule>();
	private List<String> equipment = new ArrayList<String>();
	private List<Option> options = new ArrayList<Option>();
	private int unitMin, unitMax;
	private int points, pointsPerModel;

	public String getName() {
		return name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	public List<Profile> getProfiles() {
		return profiles;
	}

	public void setProfiles(final List<Profile> profiles) {
		this.profiles = profiles;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	public List<String> getEquipment() {
		return equipment;
	}

	public void setEquipment(List<String> equipment) {
		this.equipment = equipment;
	}

	public List<Option> getOptions() {
		return options;
	}

	public void setOptions(List<Option> options) {
		this.options = options;
	}

	public int getUnitMin() {
		return unitMin;
	}

	public void setUnitMin(int unitMin) {
		this.unitMin = unitMin;
	}

	public int getUnitMax() {
		return unitMax;
	}

	public void setUnitMax(int unitMax) {
		this.unitMax = unitMax;
	}

	public String getUnitSize() {
		String string = "";
		if (unitMin > 0 && unitMax > 0) {
			string = unitMin + "-" + unitMax;
		} else if (unitMin > 0 && unitMax == 0){
			string = unitMin + "+";
		} else {
			string = "-";
		}
		return string;
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

	@Override
	public String toString() {
		StringBuilder unitRepresentation = new StringBuilder(name + "\n");

		for (Profile profile : profiles) {
			unitRepresentation.append(" " + profile.getName() + profile.toString() + "\n");
		}

		for (Rule rule : rules) {
			unitRepresentation.append(" " + rule.getName() + "\n");
		}

		for (String item : equipment) {
			unitRepresentation.append(" " + item + "\n");
		}

		for (Option option : options) {
			unitRepresentation.append(" " + option + "\n");
		}
		return unitRepresentation.toString();
	}
}
