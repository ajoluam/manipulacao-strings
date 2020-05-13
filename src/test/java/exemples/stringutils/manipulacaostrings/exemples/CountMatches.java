package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class CountMatches {
	
	/* Retirado de https://www.baeldung.com/string-processing-commons-lang.
	 * 
	 * O método counterMatches conta quantas vezes um caractere ou substring aparece em uma determinada String
	 */

	@Test
	public void countMatches () {
		String string = "welcome to www.baeldung.com";
		int charNum = StringUtils.countMatches(string, 'w');
		int stringNum = StringUtils.countMatches(string, "com");
		  
		assertEquals(4, charNum);
		assertEquals(2, stringNum);
	}

}
