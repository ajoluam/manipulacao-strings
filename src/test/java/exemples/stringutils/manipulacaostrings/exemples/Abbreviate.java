package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Abbreviate {
	
	/*
	 * Retirado de http://commons.apache.org/proper/commons-lang/apidocs/org/apache/commons/lang3/StringUtils.html
	 * 
	 * A documentaçao apresenta vários usos do Abbreviate com diversos parâmetros, aqui só usaremos a seguinte impementaçao:
	 *
	 * ****public static String abbreviate(String str, int maxWidth)****
	 * 
	 * Se o número de caracteres em str for menor ou igual a maxWidth, retorne str. 
	 * Caso contrário, abrevie-o para (substring (str, 0, max-3) + "...").
	 * 
	 * Se maxWidth for menor que 4, lance uma IllegalArgumentException. 
	 * Em nenhum caso ele retornará uma String de comprimento maior que maxWidth.
	 */

	@Test (expected = IllegalArgumentException.class)
	public void test() {
		//Nossa string tem tamanho 7, como o maxWidth==6 então será aplicada a abreviação
		//(substring (str, 0, max-3) + "...") , ou seja (substring("abcdefg", 0, 3) + "...")
		assertEquals(StringUtils.abbreviate("abcdefg", 6),"abc..." );
		
		assertEquals(StringUtils.abbreviate("abcdefg", 7),"abcdefg" );
		assertEquals(StringUtils.abbreviate("abcdefg", 8),"abcdefg" );
		
		//Mesmo pensamento para o caso de maxWidth==6
		assertEquals(StringUtils.abbreviate("abcdefg", 4),"a..." );
		
		//Este caso retornará uma IllegalArgumentException avisando que o comprimento minimo de abreviação é 4
		//Para verificar é só retirar o expected
		StringUtils.abbreviate("abcdefg", 3);
		
		 
		
	}

}
