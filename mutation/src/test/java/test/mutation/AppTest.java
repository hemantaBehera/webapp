package test.mutation;

import org.junit.Assert;
import org.junit.Test;


/**
 * Unit test for simple App.
 */
public class AppTest {
	
	@Test
	public void testAdd(){
		App app = new App();
		//int sum=app.add(5, 5);
		Assert.assertEquals(app.add(5, 5), 10);
	}
	
	@Test
	public void testMul(){
		App app = new App();
		int Mul=app.mul(5, 5);
		//Assert.assertEquals(Mul, 25);
	}
	
	@Test
	public void testDiv(){
		App app = new App();
		int div=app.div(5, 5);
		//Assert.assertEquals(div, 1);
	}
   
}
