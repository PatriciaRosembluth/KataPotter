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
		assertEquals(0,kp.CalcularPrecioSinDescuento(0));
		assertEquals(8,kp.CalcularPrecioSinDescuento(1));
		assertEquals(8*cantidad ,kp.CalcularPrecioSinDescuento(cantidad));
	}

	@Test
	public void testDescuentosSimples()
	{
		 assertEquals(15,2,kp.CalcularPrecioConDescuento("1 2"));
		 assertEquals(21,6,kp.CalcularPrecioConDescuento("1 3 5"));
		 assertEquals(25,6,kp.CalcularPrecioConDescuento("1 2 3 4"));
		 assertEquals(30,0,kp.CalcularPrecioConDescuento("1 2 3 4 5"));
	}
	
	@Test
	public void testDescuentosEspeciales()
	{
		assertEquals(23,2,kp.CalcularPrecioConDescuento("1 1 2"));
		assertEquals(30,4,kp.CalcularPrecioConDescuento("1 1 2 2"));
		assertEquals(40,8,kp.CalcularPrecioConDescuento("1 1 2 3 3 4"));
		assertEquals(38,0,kp.CalcularPrecioConDescuento("1 2 2 3 4 5"));
	}
	
	

	
}
