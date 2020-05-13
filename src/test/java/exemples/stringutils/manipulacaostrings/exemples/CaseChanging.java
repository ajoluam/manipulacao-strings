package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class CaseChanging {
	
	/* Retirado de https://www.baeldung.com/string-processing-commons-lang.
	 * 
	 * A classe String já define métodos para converter todos os caracteres de uma 
	 * String em maiúsculas ou minúsculas. Esta subseção ilustra apenas o uso de métodos 
	 * que alteram o caso de uma String de outras maneiras, incluindo swapCase, capitalize e uncapitalize.
	 */

	@Test
	public void swapcase() {
		//SwapCase troca o que for Upper para Lower e Lower para Upper
		String originalString = "baeldung.COM";
		String swappedString = StringUtils.swapCase(originalString);
		assertEquals("BAELDUNG.com", swappedString);

		String originalString2 = "BaelDung.CoM";
		String swappedString2 = StringUtils.swapCase(originalString2);
		assertEquals("bAELdUNG.cOm", swappedString2);

	}
	
	@Test
	public void capitalize() {
		
		//capitalize converte em Upper o primeiro caracter de uma string.
		//apenas o primeiro caracter será modificado, todo o resto fica como está
		String originalString = "baeldung course";
		String capitalizedString = StringUtils.capitalize(originalString);
		
		assertEquals("Baeldung course", capitalizedString);
	}
	
	@Test
	public void uncapitalize() {
		
		//capitalize converte em Lower o primeiro caracter de uma string.
		//apenas o primeiro caracter será modificado, todo o resto fica como está
		String originalString = "Baeldung course";
		String capitalizedString = StringUtils.uncapitalize(originalString);
		  
		assertEquals("baeldung course", capitalizedString);
	}
	
	

}
