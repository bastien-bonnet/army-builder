package org.bbo.armybuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Unit {
	private String name;
	private List<Profile> profiles = new ArrayList<Profile>();
	private List<Rule> rules = new ArrayList<Rule>();

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
	@Override
	public String toString() {
		StringBuilder unitRepresentation = new StringBuilder(name + "\n");

		for (Profile profile : profiles) {
			unitRepresentation.append(" " + profile.getName() + profile.toString() + "\n");
		}

		for (Rule rule : rules) {
			unitRepresentation.append(" " + rule.getName() + "\n");
		}
		return unitRepresentation.toString();
	}
}
