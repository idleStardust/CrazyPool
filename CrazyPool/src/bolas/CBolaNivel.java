package bolas;

import java.util.ArrayList;

public class CBolaNivel extends CBola
{

	//ID
	static int _CantBolNiv;
	
	//Juego
	protected int _Nivel;
	
	public CBolaNivel(int pNivel, int pJugador)
	{
		super("BolaNivel", ++_CantBolNiv, pJugador);
		this._Nivel = pNivel;
	}
	
	public int getNivel()
	{
		return this._Nivel;
	}
	
	@Override
	public void entrarEnHoyo() 
	{
		this.setEnJuego(false);
	}
}
