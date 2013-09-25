import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class testKataPotter 
{
	KataPotter kp;
	
	@Before
	public void setUp()
	{
		kp=new KataPotter();
	}

	@Test
	public void testNoSeComproNingunLibro() 
	{
		assertEquals("0",kp.CalcularPrecio(0));
	}

}
