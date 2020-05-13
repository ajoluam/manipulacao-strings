package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class RigthPad {
	
	/* Retirado de http://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
	 * 
	 * Existem 3 implementações na documentação para o RightPad, apenas mostrei uma das.
	 * Basicamente o que ele faz é completar a direita a quantidade de digitos informados com um caracter especifico
	 * 
	 *  *****public static String rigthPad(String str, int size, char padChar) *****

	 */

	@Test
	public void rightPad() {
		
		assertEquals(StringUtils.rightPad("bat", 3, 'z'), "bat");
		assertEquals(StringUtils.rightPad("bat", 5, 'z'), "batzz");
		assertEquals(StringUtils.rightPad("12345", 10, '0'), "1234500000");
	}

}
