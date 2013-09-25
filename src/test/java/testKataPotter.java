import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;


public class testKataPotter 
{
	KataPotter kp;
	ArrayList<Integer> lista;
	int tam;
	
	@Before
	public void setUp()
	{
		kp=new KataPotter();
		lista = new ArrayList<Integer>();
	}

	@Test
	public void testNoSeComproNingunLibro() 
	{
		tam=0;
		assertEquals(0,kp.CalcularPrecio(tam));
	}

	@Test
	public void testSeComproUnSoloLibro()
	{
		tam=1;
		assertEquals(8,kp.CalcularPrecio(tam));
	}
}
