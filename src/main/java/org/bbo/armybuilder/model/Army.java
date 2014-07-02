package org.bbo.armybuilder.model;

import java.util.ArrayList;
import java.util.List;

public class Army {
	private List<Unit> units = new ArrayList<Unit>();

	public Army(final Unit... units) {
		for (final Unit unit : units) {
			this.units.add(unit);
		}
	}

	public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(final List<Unit> units) {
		this.units = units;
	}
}
