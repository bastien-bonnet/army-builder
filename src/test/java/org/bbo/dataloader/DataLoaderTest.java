package org.bbo.dataloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.bbo.armybuilder.model.Army;
import org.bbo.armybuilder.model.Profile;
import org.bbo.armybuilder.model.Unit;
import org.junit.Test;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class DataLoaderTest {

	@Test
	public void test() throws FileNotFoundException {
		final FileInputStream fileInputStream = new FileInputStream(new File("src/main/resources/test.yaml"));
		final TypeDescription unitDescription = new TypeDescription(Unit.class);
		unitDescription.putListPropertyType("profiles", Profile.class);

		final Constructor constructor = new Constructor(Army.class);
		constructor.addTypeDescription(unitDescription);
		final Yaml yaml = new Yaml(constructor);
//		final List<Unit> data = (List<Unit>) yaml.load(fileInputStream);
		final Army army = (Army) yaml.load(fileInputStream);

		System.out.println(army);
//		System.out.println("oooooooooooooo" + army.get(0).toString());
//		assertThat(army.size()).isEqualTo(2);
	}

}
