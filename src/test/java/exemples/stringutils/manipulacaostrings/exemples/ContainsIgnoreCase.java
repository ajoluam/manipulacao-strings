package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class ContainsIgnoreCase {

	/* Retirado de https://www.baeldung.com/string-processing-commons-lang.
	 * 
	 * O método containsIgnoreCase verifica se uma determinada String contém outra String 
	 * de maneira que não diferencia maiúsculas de minúsculas. 
	 * 
	 */
	
	@Test
	public void test() {
		String string = "baeldung.com";
		boolean contained1 = StringUtils.containsIgnoreCase(string, "BAELDUNG");
				  
		assertTrue(contained1);
		
	}

}
