package elementos;

import java.util.Observable;
import java.util.Observer;

public abstract class CBola implements Observer, ISerializable
{
	//Juego
	protected boolean _EnJuego;
	
	//ID
	protected String _ID;
	protected String _Tipo;
	protected int _Serie;
	
	
	public CBola(String pTipo, int pSerie)
	{
		this._Serie = pSerie;
		this._ID = pTipo + pSerie;
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
	public void printID()
	{
		System.out.println("ID: " + this._ID);
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
	
	@Override
	public void update(Observable o, Object arg) 
	{
		
	}
}