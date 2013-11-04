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
		
		//Generar Bola de Jugador
		this.addBola( new CBolaJugador(pNumero) );
		
		//Generar Bolas De Nivel
		this.generarBolas( 3 );
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
	
	public void generarBolas(int pCantidad)
	{
		for(int x = 0; x < pCantidad; x++)
		{
			this.addBola(new CBolaNivel( 1, this._Numero));
			this.addBola(new CBolaNivel( 2, this._Numero ));
			this.addBola(new CBolaNivel( 3, this._Numero ));
		}
	}
	
	public CBola buscarBola(String pID)
	{
		CBola result = null;
		for(CBola x: this._ListaBolas)
			if( x.getID().equalsIgnoreCase(pID) )
			{
				result = x;
				break;
			}
		return result;
	}
}