package org.bbo.armybuilder.dataloader;

import static org.fest.assertions.Assertions.assertThat;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.bbo.armybuilder.model.Army;
import org.junit.Test;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class DataLoaderTest {

	@Test
	public void test() throws FileNotFoundException {

		final Constructor constructor = new Constructor(Army.class);

		final TypeDescription armyDescription = new TypeDescription(Army.class);
		constructor.addTypeDescription(armyDescription);

		final Yaml yaml = new Yaml(constructor);

		final FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/test.yaml"));
		final Army army = (Army) yaml.load(fileInputStream);

		System.out.println(army);
		assertThat(army.getUnits().size() > 0);
	}

}
