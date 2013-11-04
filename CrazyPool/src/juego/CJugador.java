package juego;

import java.util.ArrayList;

import bolas.*;

public class CJugador 
{
	private int _Numero;
	private int _Puntos;
	private int _NivelAcabado;
	private ArrayList<CBolaNivel> _ListaBolas;
	private CBolaJugador _BolaJugador;
	CJugador(int pNumero)
	{
		this._Numero = pNumero;
		
		//Generar Bola de Jugador
		this._BolaJugador = new CBolaJugador(pNumero);
		
		//Generar Bolas De Nivel
		this.generarBolas( 3 );
		
		this._NivelAcabado = 1;
	}
	
	public int getJugador()
	{
		return this._Numero;
	}
	
	public int getPuntos()
	{
		return this._Puntos;
	}
	
	public int getNivelAcabado()
	{
		return this._NivelAcabado;
	}
	
	public CBolaJugador getBolaJugador()
	{
		return this._BolaJugador;
	}
	
	public void addPuntos(int pPuntos)
	{
		this._Puntos += pPuntos;
	}
	
	public ArrayList<CBolaNivel> getBolas()
	{
		return this._ListaBolas;
	}
	
	public void addBola(CBolaNivel pBola)
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
				this._NivelAcabado++ ;
				result = x;
				break;
			}
		return result;
	}
	
	public void revisarNivelAcabado()
	{
		this.bolasMenores(this._NivelAcabado, this._ListaBolas);
	}
	

	public boolean bolasMenores(int pNivel, ArrayList<CBolaNivel> pLista)
	{
		boolean result = false;
		for(CBolaNivel x: pLista)
		{
			if( x.getNivel() < pNivel )
			{
				result = true;
				break;
			}
		}
		return result;
	}
}