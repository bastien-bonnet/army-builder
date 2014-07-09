package org.bbo.armybuilder.model;

import static org.fest.assertions.Assertions.assertThat;
import junitparams.JUnitParamsRunner;
import junitparams.Parameters;

import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class UnitTest {

	private Unit unit = new Unit();

	@Test
	@Parameters
	public void should_correct_unit_size_given_min_and_max(int unitMin, int unitMax, String expectedString) {
		// GIVEN
		unit.setUnitMin(unitMin);
		unit.setUnitMax(unitMax);

		// WHEN
		String unitSize = unit.getUnitSize();

		// THEN
		assertThat(unitSize).isEqualTo(expectedString);
	}

	@SuppressWarnings("unused")
	private Object[][] parametersForShould_correct_unit_size_given_min_and_max() {
		return new Object [][] {
				{5, 15, "5-15"},
				{5, 0, "5+"},
				{0, 0, "-"},
				{0, 15, "-"},
		};
	}

}
