package juego;

import java.util.ArrayList;

import bolas.*;

public class CJugador 
{
	private int _Numero;
	private int _Puntos;
	private ArrayList<CBola> _ListaBolas;
	
	CJugador(int pNumero)
	{
		this._Numero = pNumero;
		
		//Generar Bola Comodin
		this.addBola( new CBolaComodin() );
		
		//Generar Bola de Jugador
		this.addBola( new CBolaJugador() );
		
		//Generar Bolas De Nivel
		this.generarBolas( 3, 1);
		this.generarBolas( 3, 2);
		this.generarBolas( 3, 3);
	}
	
	public int getJugador()
	{
		return this._Numero;
	}
	
	public int getPuntos()
	{
		return this._Puntos;
	}
	
	public void addPuntos(int pPuntos)
	{
		this._Puntos += pPuntos;
	}
	
	public ArrayList<CBola> getBolas()
	{
		return this._ListaBolas;
	}
	
	public void addBola(CBola pBola)
	{
		this._ListaBolas.add(pBola);
	}
	
	public void removeBola(CBola pBola)
	{
		this._ListaBolas.remove(pBola);
	}
	
	public int getNumBolas()
	{
		return this._ListaBolas.size();
	}
	
	public void generarBolas(int pCantidad, int pNivel)
	{
		for(int x = 0; x < pCantidad; x++)
			this.addBola(new CBolaNivel(pNivel));
	}
}
