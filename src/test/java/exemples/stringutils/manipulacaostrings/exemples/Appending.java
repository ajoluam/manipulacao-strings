package exemples.stringutils.manipulacaostrings.exemples;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Appending {
	
	/* Retirado de https://www.baeldung.com/string-processing-commons-lang.
	 * 
	 * Os métodos appendIfMissing (case sensitive)  e appendIfMissingIgnoreCase (case Insensitive)
	 * anexam um sufixo ao final de uma determinada String se ele ainda não termina com nenhum dos 
	 * sufixos passados ​​de maneira case sensitive e insensitive, respectivamente.
	 */

	@Test
	public void test() {
		String string = "baeldung.com";
		String string2 = "baeldung.com";
		String stringWithSuffix = StringUtils.appendIfMissing(string, ".COM");
		String stringWithSuffixIgnoreCase = StringUtils.appendIfMissingIgnoreCase(string2, ".COM");
		
		System.out.println(stringWithSuffix);
		/*
		 * Essa string retornará baeldung.com.COM, porque ele entende que ("com" != "COM")
		 * Se a string fosse baeldung.COM, ele não acrescentaria nada por entender que já existe este sufixo
		 */
		
		System.out.println(stringWithSuffixIgnoreCase);
		/*
		 * Essa string retornará baeldung.com, porque ele entende que ("com" == "COM") então não adiciona nada
		 */
	}

}
