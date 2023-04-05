package DataProject.GithubTest;

import java.util.Arrays;
import java.util.Collection;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;




public class AdditionTest {
	
    private static Collection<Object[]> dt() {
        Object[][] data = new Object[][] { 
        	{5, 7 , 12},
        	{-5, -2, -7},
        	{-5, 2, -3},
        	{5, -2, 3},
        	{-5, 0, -5},
        	{5, 0, 5},
        	{0, 0, 0}
        };
        return Arrays.asList(data);
    }
	

	@ParameterizedTest
	@MethodSource("dt")
	public void testgetResult(int a, int b, int c) {
		Addition A = new Addition(a, b);
		assertEquals(c,A.calcul());
		
	}
}


