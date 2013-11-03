package elementos;

import java.util.Observable;
import java.util.Observer;

public class Bola implements Observer
{
	static int CantBol;
	int _Numero;
	String _ID;
	boolean _EnJuego;
	
	public Bola(int pNumero)
	{
		this._ID = "Bola" + ++CantBol;
		this._Numero = pNumero;
	}

	@Override
	public void update(Observable o, Object arg) 
	{
		
	}
}
