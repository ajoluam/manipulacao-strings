package exemples.stringutils.manipulacaostrings.exemples;

import static org.junit.Assert.assertEquals;

import org.apache.commons.lang3.StringUtils;
import org.junit.Test;

public class Difference {
	
	/* Retirado de https://www.baeldung.com/string-processing-commons-lang.
	 * 
	 * O método difference compara duas strings, retornando o restante da segunda String,
	 *  começando na posição em que é diferente da primeira.
	 */

	@Test
	public void difference() {
		String tutorials = "Baeldung Tutorials";
		String courses = "Baeldung Courses";
		
		//Comparando a primeria com a segunda, o que está diferente da primeira é "Courses"
		String diff1 = StringUtils.difference(tutorials, courses);
		assertEquals("Courses", diff1);
		
		//Comparando a segunda com a primeira, o que está diferente da segunda é "Tutorials"
		String diff2 = StringUtils.difference(courses, tutorials);
		assertEquals("Tutorials", diff2);
	
		  
	}

}
