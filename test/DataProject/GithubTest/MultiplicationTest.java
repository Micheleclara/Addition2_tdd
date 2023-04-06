package DataProject.GithubTest;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class MultiplicationTest {

	   private static Collection<Object[]> dt() {
	        Object[][] data = new Object[][] { 
	        	{5, 7 , 35},
	        	{-5, -2, 10},
	        	{-5, 2, -10},
	        	{5, -2, -10},
	        	{-5, 0, 0},
	        	{5, 0, 0},
	        	{0, 0, 0}
	        };
	        return Arrays.asList(data);
	    }
		

		@ParameterizedTest
		@MethodSource("dt")
		public void testgetResult(int a, int b, int c) {
			Multiplication A = new Multiplication(a, b);
			assertEquals(c,A.calcul());
			
		}
}
