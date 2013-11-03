package juego;

import bolas.CBolaNivel;

public class CJuego 
{
	//Caracteristicas
	private CTiempo _Tiempo;
	private char _Forma;
	
	//Jugadores
	private CJugador _Jugador1;
	private CJugador _Jugador2;
	
	public CJuego(int pTiempo, char pForma) 
	{
		//Caracteristicas
		this._Tiempo = new CTiempo(pTiempo);
		this._Forma = pForma;
		
		//Jugadores
		this._Jugador1 = new CJugador(1);
		this._Jugador2 = new CJugador(2);
	}
	
	
	public char getForma()
	{
		return this._Forma;
	}
	
	public int getMinutos()
	{
		return this._Tiempo.getMinutos();
	}
	
	public int getSegundos()
	{
		return this._Tiempo.getSegundos();
	}
}