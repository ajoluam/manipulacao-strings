package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class ContainsAny {
	
	/* Retirado de https://www.baeldung.com/string-processing-commons-lang.
	 * 
	 * O método containsAny verifica se uma determinada String contém algum caractere 
	 * no conjunto de caracteres especificado. Esse conjunto de caracteres pode ser transmitido 
	 * na forma de uma string ou de caracteres.
	 * Ele é case sensitive, portanto cuidado  ('A' != 'a')
	 * O retorno será um boolean.
	 */

	@Test
	public void test() {
		String string = "baeldung.com";
		//Verifica se algum dos caracteres existem na string especificada
		boolean contained1 = StringUtils.containsAny(string, 'a', 'b', 'c');
		boolean contained2 = StringUtils.containsAny(string, 'x', 'y', 'z');
		//verifica se algum caracter das strings "abc" e "xyz" estão individualmente na string base
		boolean contained3 = StringUtils.containsAny(string, "abc");
		boolean contained4 = StringUtils.containsAny(string, "xyz");
		//Ele olhará caractere por caracter e devolverá TRUE se ao menos 1 estiver contido na string base
		boolean contained5 = StringUtils.containsAny(string, "kja");
		  
		assertTrue(contained1);
		assertFalse(contained2);
		assertTrue(contained3);
		assertFalse(contained4);
		//Neste caso apenas 1 caracter está na string base
		assertTrue(contained5);
	}

}
