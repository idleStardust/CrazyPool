package orificios;

public class CHoyoBinario extends CHoyo
{
	private static int _CantHoyoBinario;
	
	public CHoyoBinario()
	{
		super("HoyoBin", ++_CantHoyoBinario);
	}
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
