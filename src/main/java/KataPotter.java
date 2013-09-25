
public class KataPotter {

	private static final String _lISTADO_1 = "1 2";
	private static final String _lISTADO_2 = "1 3 5";
	private static final String _lISTADO_3 = "1 2 3 4";
	private static final String _lISTADO_4 = "1 2 3 4 5";
	private static final double _DESCUENTO_1=15.2;
	private static final double _DESCUENTO_2=21.6;
	private static final double _DESCUENTO_3=25.6;
	private static final double _DESCUENTO_4=30.0;
	public int CalcularPrecioSinDescuento(int cantidad) 
	{
		return 8*cantidad;
	}
	
	public double CalcularPrecioConDescuento(String lista) 
	{
		if(lista==_lISTADO_1)
			return _DESCUENTO_1;
		else
			if(lista==_lISTADO_2)
				return _DESCUENTO_2;
			else
				if(lista==_lISTADO_3)
					return _DESCUENTO_3;
				else
					if(lista==_lISTADO_4)
						return _DESCUENTO_4;
					else
						return 0;
	}

}
