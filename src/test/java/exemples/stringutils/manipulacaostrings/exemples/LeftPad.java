package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class LeftPad {
	
	/* Retirado de http://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
	 * 
	 * Existem 3 implementações na documentação para o LeftPad, apenas mostrei uma das.
	 * Basicamente o que ele faz é completar a esquerda a quantidade de digitos informados com um caracter especifico
	 * 
	 *  *****public static String leftPad(String str, int size, char padChar) *****

	 */

	@Test
	public void leftPad() {
		
		assertEquals(StringUtils.leftPad("bat", 3, 'z'), "bat");
		assertEquals(StringUtils.leftPad("bat", 5, 'z'), "zzbat");
		assertEquals(StringUtils.leftPad("12345", 10, '0'), "0000012345");
	}

}
