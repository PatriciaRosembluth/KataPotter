import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class testKataPotter 
{
	KataPotter kp;
	String lista;
	
	@Before
	public void setUp()
	{
		kp=new KataPotter();
		lista = new String();
	}

	@Test
	public void testBasico() 
	{
		int cantidad=3;
		assertEquals(0,kp.CalcularPrecio(0));
		assertEquals(8,kp.CalcularPrecio(1));
		assertEquals(8*cantidad ,kp.CalcularPrecio(cantidad));
	}

}
