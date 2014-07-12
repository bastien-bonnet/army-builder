package org.bbo.armybuilder.model;

public class Item {
	private String name;
	private Weapon weapon;
	private String description = "";
	private int points;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Weapon getWeapon() {
		return weapon;
	}
	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", weapon=" + weapon + ", description="
				+ description + ", points=" + points + "]";
	}
}
