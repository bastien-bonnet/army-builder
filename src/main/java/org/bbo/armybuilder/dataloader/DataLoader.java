package org.bbo.armybuilder.dataloader;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.StringWriter;

import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.bbo.armybuilder.model.Army;
import org.yaml.snakeyaml.TypeDescription;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

public class DataLoader {
	public static Army load(String yamlPath) throws FileNotFoundException {
		final Constructor constructor = new Constructor(Army.class);

		final TypeDescription armyDescription = new TypeDescription(Army.class);
		constructor.addTypeDescription(armyDescription);

		final Yaml yaml = new Yaml(constructor);

		final FileInputStream fileInputStream = new FileInputStream(new File(yamlPath));
		final Army army = (Army) yaml.load(fileInputStream);

		return army;
	}

	public static String fillTemplateWithArmyData(TemplateType templateType, Army army) {
		VelocityEngine velocityEngine = new VelocityEngine();
		velocityEngine.init();

		Template template = velocityEngine.getTemplate(templateType.getTemplatePath(), "UTF-8");

		VelocityContext velocityContext = new VelocityContext();
		velocityContext.put("army", army);

		StringWriter stringWriter = new StringWriter();
		template.merge(velocityContext, stringWriter);

		return stringWriter.toString();
	}
}
