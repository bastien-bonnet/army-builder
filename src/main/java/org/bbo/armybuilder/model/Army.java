package org.bbo.armybuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Army {
	private String name;
	private List<Unit> lords = new ArrayList<Unit>();
	private List<Unit> heroes = new ArrayList<Unit>();
	private List<Unit> coreUnits = new ArrayList<Unit>();
	private List<Unit> specialUnits = new ArrayList<Unit>();
	private List<Unit> rareUnits = new ArrayList<Unit>();
	private List<Rule> rules = new ArrayList<Rule>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Unit> getLords() {
		return lords;
	}

	public void setLords(List<Unit> lords) {
		this.lords = lords;
	}

	public List<Unit> getHeroes() {
		return heroes;
	}

	public void setHeroes(List<Unit> heroes) {
		this.heroes = heroes;
	}

	public List<Unit> getCoreUnits() {
		return coreUnits;
	}

	public void setCoreUnits(List<Unit> coreUnits) {
		this.coreUnits = coreUnits;
	}

	public List<Unit> getSpecialUnits() {
		return specialUnits;
	}

	public void setSpecialUnits(List<Unit> specialUnits) {
		this.specialUnits = specialUnits;
	}

	public List<Unit> getRareUnits() {
		return rareUnits;
	}

	public void setRareUnits(List<Unit> rareUnits) {
		this.rareUnits = rareUnits;
	}

	public List <Unit> getAllUnits() {
		List <Unit> allUnits = new ArrayList<Unit>();
		allUnits.addAll(lords);
		allUnits.addAll(heroes);
		allUnits.addAll(coreUnits);
		allUnits.addAll(specialUnits);
		allUnits.addAll(rareUnits);
		return allUnits;
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

		for(Unit unit : lords){
			stringRepresentation.append("  " + unit.toString() + "\n");
		}
		for(Unit unit : heroes){
			stringRepresentation.append("  " + unit.toString() + "\n");
		}
		for(Unit unit : coreUnits){
			stringRepresentation.append("  " + unit.toString() + "\n");
		}
		for(Unit unit : specialUnits){
			stringRepresentation.append("  " + unit.toString() + "\n");
		}
		for(Unit unit : rareUnits){
			stringRepresentation.append("  " + unit.toString() + "\n");
		}

		for (Rule rule : rules){
			stringRepresentation.append(" " + rule.toString() + "\n");
		}

		return stringRepresentation.toString();
	}
}
