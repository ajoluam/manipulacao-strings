package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Reversing {
	

	/* Retirado de https://www.baeldung.com/string-processing-commons-lang.
	 * 
	 * A classe StringUtils define dois métodos para reverter seqüências de caracteres: reverse e reverseDelimited.
	 * O método reverse reorganiza todos os caracteres de uma String na ordem oposta, enquanto o método reverseDelimited 
	 * reordena grupos de caracteres, separados por um delimitador especificado.
	 */

	@Test
	public void reverse() {
		String originalString = "baeldung";
		String originalString2 = "BaelDung";
		String reversedString = StringUtils.reverse(originalString);
		String reversedString2 = StringUtils.reverse(originalString2);
		  
		assertEquals("gnudleab", reversedString);
		assertEquals("gnuDleaB", reversedString2);
	}
	
	@Test
	public void reverseDelimited() {
		
		//Observe que o delimitador será o ponto, assom o centro ficará no mesmo lugar
		//mas as extremidades trocarão de posição
		String originalString = "www.baeldung.com";
		String reversedString = StringUtils.reverseDelimited(originalString, '.');
		assertEquals("com.baeldung.www", reversedString);
		
		//Observe que neste caso ele trocará de fora para dentro
		//Primeiro trocarpa de posição "br" e "com" e depois trocará 
		//"com" e "baeldung".
		String originalString2 = "www.baeldung.com.br";
		String reversedString2 = StringUtils.reverseDelimited(originalString2, '.');
		assertEquals("br.com.baeldung.www", reversedString2);
	}

}
