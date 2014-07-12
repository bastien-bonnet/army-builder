package org.bbo.armybuilder.model;

import java.util.List;

public class Weapon {
	private int range;
	private int strengh;
	private List<String> rules;
	public int getRange() {
		return range;
	}
	public void setRange(int range) {
		this.range = range;
	}
	public int getStrengh() {
		return strengh;
	}
	public void setStrengh(int strengh) {
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
