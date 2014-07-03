package org.bbo.armybuilder.model;

public class Profile {
	private String name;
	private int m;
	private int cc;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM() {
		return m;
	}

	public void setM(final int m) {
		this.m = m;
	}

	public int getCc() {
		return cc;
	}

	public void setCc(final int cc) {
		this.cc = cc;
	}

	@Override
	public String toString() {
		return m + " " +cc;
	}
}
