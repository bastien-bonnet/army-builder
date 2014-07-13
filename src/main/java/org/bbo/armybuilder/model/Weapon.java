package org.bbo.armybuilder.model;

import java.util.List;

public class Weapon {
	private String range;
	private String strengh;
	private List<String> rules;

	public String getRange() {
		return range;
	}

	public void setRange(String range) {
		this.range = range;
	}

	public String getStrengh() {
		return strengh;
	}

	public void setStrengh(String strengh) {
		this.strengh = strengh;
	}

	public List<String> getRules() {
		return rules;
	}

	public void setRules(List<String> rules) {
		this.rules = rules;
	}

	@Override
	public String toString() {
		return "Weapon [range=" + range + ", strengh=" + strengh + ", rules="
				+ rules + "]";
	}
}
