package org.lang;

public class LanguageInfo {
	
	public static void main(String arges[]) {
		LanguageInfo a = new LanguageInfo();
		
		a.tamilLang();
		a.englishLang();
		a.hindiLang();
//		StateDetails b = new StateDetails();
//		a.southIndia();
//		a.northIndia();
	}
	private void tamilLang()
	{
		System.out.println("Language:Tamil");
	}
	private void englishLang()
	{
		System.out.println("Language:english");
	}
	private void hindiLang()
	{
		System.out.println("Language:hindi");
	}

}
