package org.bbo.armybuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Army {
	private List<Unit> units = new ArrayList<Unit>();

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(final List<Unit> units) {
		this.units = units;
	}

	@Override
	public String toString() {
		StringBuilder stringRepresentation = new StringBuilder("Army:\n");
		for(Unit unit : units){
			stringRepresentation.append("  " + unit.toString() + "\n");
		}
		return stringRepresentation.toString();
	}
}
