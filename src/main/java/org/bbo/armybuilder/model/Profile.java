package org.bbo.armybuilder.model;

public class Profile {
	private String name;
	private String troopType = "";
	private int m, ws, bs, s, t, w, i, a, ld;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTroopType() {
		return troopType;
	}

	public void setTroopType(String troopType) {
		this.troopType = troopType;
	}

	public int getM() {
		return m;
	}

	public void setM(final int m) {
		this.m = m;
	}

	public int getWs() {
		return ws;
	}

	public void setWs(int ws) {
		this.ws = ws;
	}

	public int getBs() {
		return bs;
	}

	public void setBs(int bs) {
		this.bs = bs;
	}

	public int getS() {
		return s;
	}

	public void setS(int s) {
		this.s = s;
	}

	public int getT() {
		return t;
	}

	public void setT(int t) {
		this.t = t;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getI() {
		return i;
	}

	public void setI(int i) {
		this.i = i;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getLd() {
		return ld;
	}

	public void setLd(int ld) {
		this.ld = ld;
	}

	@Override
	public String toString() {
		return m + " " + ws + " " + bs + " " + s + " " + t + " " + w + " " + i + " " + a + " " + ld;
	}
}
