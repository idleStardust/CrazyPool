package orificios;

import java.util.Observable;

import colecciones.ISerializable;

public abstract class CHoyo extends Observable implements ISerializable
{
	//ID
	static int CantHoy;
	
	protected String _ID;
	protected String _Tipo;
	protected int _Serie;
	
	//Juego
	protected boolean _Abierto;
	
	CHoyo()
	{
		this._Tipo = "HOYO";
		this.setID(++CantHoy);
	}
	
	public void setAbierto(boolean pValor)
	{
		this._Abierto = pValor;
	}
	
	public boolean isAbierto()
	{
		return this._Abierto;
	}
	
	@Override
	public void printID() 
	{	
		System.out.println("ID: " + this._ID);
	}
	
	
	@Override
	public void setID(int pSerie) 
	{	
		this._ID = this._Tipo + pSerie;
	}
	
	
	@Override
	public String getID() 
	{
		return this._ID;
	}


	@Override
	public int getSerie() 
	{
		return this._Serie;
	}


	@Override
	public String getTipo() 
	{
		return this._Tipo;
	}
	
	public abstract boolean recibeBola();
}