package org.bbo.armybuilder.model;

public class Profile {
	private int m;
	private int cc;

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
		return "Profile [m=" + m + ", cc=" + cc + "]";
	}


}
