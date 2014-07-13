package org.bbo.armybuilder.dataloader;

public enum TemplateType {
	
	HTML("armyBook.html"),
	LATEX("armyBook.tex");
	
	private static final String TEMPLATE_FOLDER = "src/main/resources/";
	private String templatePath;
	
	public String getTemplatePath() {
		return templatePath;
	}

	private TemplateType(String templateName) {
		this.templatePath = TEMPLATE_FOLDER + templateName;
	}
}
