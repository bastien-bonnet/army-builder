package org.bbo.armybuilder.dataloader;

import static org.fest.assertions.Assertions.assertThat;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

import org.bbo.armybuilder.model.Army;
import org.bbo.armybuilder.model.Unit;
import org.junit.Test;

public class DataLoaderTest {

	@Test
	public void should_return_army_with_units_when_loading_army() throws FileNotFoundException {
		final Army army = DataLoader.load("src/main/resources/test.yaml");

		System.out.println(army);
		assertThat(army.getUnits().size() > 0);
	}

	@Test
	public void should_return_string_with_unit_names_when_filling_template_with_army_data() throws FileNotFoundException {
		Army army = DataLoader.load("src/main/resources/test.yaml");
		String armyString = DataLoader.fillTemplateWithArmyData("src/main/resources/armyBook.html", army);

		System.out.println(armyString);

		for (Unit unit : army.getUnits()) {
			assertThat(armyString).contains(unit.getName());
		}

		PrintWriter out = new PrintWriter("army-test.html");
		out.println(armyString);
		out.close();
	}
}
