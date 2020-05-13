package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;

class Rotate {
	
	/* Retirado de http://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html#rotate-java.lang.String-int-
	 * 
	 * O método rotate () desloca circularmente os caracteres de uma String em um dado número de posições,
	 * Se o número for >0, o deslocamento será para direita
	 * Se o número for <0, o deslocamento será para a esquerda 
	 */
	 
	

	@Test
	void rotate() {
		
		assertEquals(StringUtils.rotate("abcdefg", 0), "abcdefg");
		
		//Como a string é deslocada duas posições para a direita, os 2 ultimos caracteres vão para o começo
		assertEquals(StringUtils.rotate("abcdefg", 2), "fgabcde");
		
		//Como a string é deslocada duas posições para a esquera, os 2 primeiros caracteres vão parao final
		assertEquals(StringUtils.rotate("abcdefg", -2), "cdefgab");
		
		//7 é o tamanho da string não fazendo qualquer efeito
		assertEquals(StringUtils.rotate("abcdefg", 7), "abcdefg");
		assertEquals(StringUtils.rotate("abcdefg", -7), "abcdefg");
		
		//Como a string só tem 7 caracteres, 9 significa a mesma coisa de 2 na hora do deslocamento
		assertEquals(StringUtils.rotate("abcdefg", 9), "fgabcde");
		assertEquals(StringUtils.rotate("abcdefg", -9), "cdefgab");
		  
	}

}
