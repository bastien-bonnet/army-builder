package org.bbo.armybuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Army {
	private String name;
	private List<Unit> units = new ArrayList<Unit>();
	private List<Rule> rules = new ArrayList<Rule>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(final List<Unit> units) {
		this.units = units;
	}

	public List<Rule> getRules() {
		return rules;
	}

	public void setRules(List<Rule> rules) {
		this.rules = rules;
	}

	@Override
	public String toString() {
		StringBuilder stringRepresentation = new StringBuilder("Army:\n");

		for(Unit unit : units){
			stringRepresentation.append("  " + unit.toString() + "\n");
		}

		for (Rule rule : rules){
			stringRepresentation.append(" " + rule.toString() + "\n");
		}

		return stringRepresentation.toString();
	}
}
