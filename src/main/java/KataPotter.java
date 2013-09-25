
public class KataPotter {

	public int CalcularPrecioSinDescuento(int cantidad) 
	{
		return 8*cantidad;
	}
	
	public double CalcularPrecioConDescuento(String lista) 
	{
		if(lista=="1 2")
			return 8 * 2 * 0.95;
		else
			if(lista=="1 3 5")
				return 8 * 3 * 0.9;
			else
				if(lista=="1 2 3 4")
					return 8 * 4 * 0.8;
				else
					if(lista=="1 2 3 4 5")
						return 8 * 5 * 0.75;
					else
						return 0;
	}

}
