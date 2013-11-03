package elementos;

public abstract class Elemento 
{
	String _ID;
	public Elemento(String pTipo, int pSerie)
	{
		this._ID = pTipo + pSerie;
	}
}
