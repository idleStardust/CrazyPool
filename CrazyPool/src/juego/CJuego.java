package juego;

import java.util.ArrayList;

import bolas.*;
import orificios.*;

public class CJuego 
{
	//Caracteristicas
	private CTiempo _Tiempo;
	private char _Forma;
	private ArrayList<CHoyo> _ListaOrificios;
	
	//Jugadores
	private CJugador _Jugador1;
	private CJugador _Jugador2;
	private CBolaComodin _BolaComodin;
	
	public CJuego(int pTiempo, char pForma) 
	{
		//Caracteristicas
		this._Tiempo = new CTiempo(pTiempo);
		this._Forma = pForma;
		
		//Jugadores
		this._Jugador1 = new CJugador(1);
		this._Jugador2 = new CJugador(2);
		
		//Bola Comodin
		this._BolaComodin = new CBolaComodin();
		
		//Inicio del Tiempo
		this._Tiempo.start();
	}
	
	
	/**
	 * Retorna la forma del tablero de Juego, R es rectangular y C es circular.
	 * @return Forma {@link Character}
	 */
	public char getForma()
	{
		return this._Forma;
	}
	
	
	//Metodos Tiempo
	public int getMinutos()
	{
		return this._Tiempo.getMinutos();
	}
	
	public int getSegundos()
	{
		return this._Tiempo.getSegundos();
	}
	
	public int getPuntosJugador1()
	{
		return this._Jugador1.getPuntos();
	}
	
	public int getPuntosJugador2()
	{
		return this._Jugador2.getPuntos();
	}
	
	public void crearHoyos()
	{
		
	}
}