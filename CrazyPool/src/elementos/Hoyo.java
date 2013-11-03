package elementos;

import java.util.Observable;

public class Hoyo extends Observable implements ISerializable
{
	//ID
	static int CantHoy;
	protected String _ID;
	protected String _Tipo;
	protected int _Serie;
	
	//Juego
	
	Hoyo()
	{
		this._ID = "HOYO" + CantHoy;
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
}