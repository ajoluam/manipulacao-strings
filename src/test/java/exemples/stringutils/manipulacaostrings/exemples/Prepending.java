package exemples.stringutils.manipulacaostrings.exemples;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Prepending {

	/* Retirado de https://www.baeldung.com/string-processing-commons-lang.
	 * 
	 * Os métodos prependIfMissing  (case sensitive)  e prependIfMissingIgnoreCase  (case Insensitive)
	 * anexam um prefixo no começo de uma determinada String se ele ainda não começa com nenhum dos 
	 * prefixos passados ​​de maneira case sensitive e insensitive, respectivamente.
	 */
	@Test
	public void test() {
		String string = "www.baeldung.com";
		String string2 = "baeldung.com";
		String stringWithPrefix  = StringUtils.prependIfMissing(string, "WWW.");
		String stringWithPrefixIgnoreCase = StringUtils.prependIfMissingIgnoreCase(string2, "WWW.");
		
		System.out.println(stringWithPrefix );
		/*
		 * Essa string retornará WWW.www.baeldung.com, porque ele entende que ("www." != "WWW.")
		 * Se a string fosse WWW.baeldung.com, ele não acrescentaria nada por entender que já existe este sufixo
		 */
		
		System.out.println(stringWithPrefixIgnoreCase);
		/*
		 * Essa string retornará WWW.baeldung.com
		 */
	}

}
