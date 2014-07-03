package org.bbo.armybuilder.model;

import java.util.List;

public class Unit {
	private String name;
	private List<Profile> profiles;

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
	@Override
	public String toString() {
		StringBuilder unitRepresentation = new StringBuilder(name + "\n");
		for (Profile profile : profiles) {
			unitRepresentation.append("    " + profile.getName() + profile.toString() + "\n");
		}
		return unitRepresentation.toString();
	}
}
