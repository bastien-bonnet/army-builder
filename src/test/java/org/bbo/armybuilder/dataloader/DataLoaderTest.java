package org.bbo.armybuilder.dataloader;

import static org.fest.assertions.Assertions.assertThat;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.bbo.armybuilder.model.Army;
import org.bbo.armybuilder.model.Unit;
import org.junit.Test;

public class DataLoaderTest {

	private static final String SAMPLE_YAML = "src/test/resources/army-sample.yaml";

	@Test
	public void should_return_army_with_units_when_loading_army() throws FileNotFoundException {
		// WHEN
		final Army army = DataLoader.load(SAMPLE_YAML);

		// THEN
		assertThat(army.getAllUnits().size() > 0);
	}

	@Test
	public void should_return_string_with_unit_names_when_filling_template_with_army_data() throws FileNotFoundException {
		// GIVEN
		Army army = DataLoader.load(SAMPLE_YAML);
		
		// WHEN
		String armyString = DataLoader.fillTemplateWithArmyData(TemplateType.HTML, army);


		// THEN
		for (Unit unit : army.getAllUnits()) {
			assertThat(armyString).contains(unit.getName());
		}

		System.out.println(army.toString());
		PrintWriter out = new PrintWriter("army-test.html");
		out.println(armyString);
		out.close();
	}
}
