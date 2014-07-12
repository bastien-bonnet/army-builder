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
	private List<Item> items = new ArrayList<Item>();
	private List<Item> magicItems = new ArrayList<Item>();

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

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Item> getMagicItems() {
		return magicItems;
	}

	public void setMagicItems(List<Item> magicItems) {
		this.magicItems = magicItems;
	}

	@Override
	public String toString() {
		return "Army [name=" + name + ", lords=" + lords + ", heroes=" + heroes
				+ ", coreUnits=" + coreUnits + ", specialUnits=" + specialUnits
				+ ", rareUnits=" + rareUnits + ", rules=" + rules + ", items="
				+ items + ", magicItems=" + magicItems + "]";
	}
}
