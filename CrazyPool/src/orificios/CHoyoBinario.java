package orificios;

public class CHoyoBinario extends CHoyo
{

	@Override
	public boolean recibeBola() 
	{
		boolean result = false;
		if(this._Abierto)
		{
			result = true;
		}
		return result;
	}

}
