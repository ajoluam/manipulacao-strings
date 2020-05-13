package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class DeleteWhitespace {
	
	/* Retirado de http://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
	 * 
	 * Exclui todos os espaços em branco de uma String
	 * 
	 */

	@Test
	public void deleteWhitespace() {
		
		assertEquals(StringUtils.deleteWhitespace("   ab  c  "), "abc");
	}

}
