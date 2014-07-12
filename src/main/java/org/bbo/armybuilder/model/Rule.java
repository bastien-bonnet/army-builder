package org.bbo.armybuilder.model;

import java.util.List;

public class Rule {
	private String name;
	private String description;
	private List<String> subrules;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<String> getSubrules() {
		return subrules;
	}

	public void setSubrules(List<String> subrules) {
		this.subrules = subrules;
	}

	@Override
	public String toString() {
		return "Rule [name=" + name + ", description=" + description
				+ ", subrules=" + subrules + "]";
	}

}
