package orificios;

public class CHoyoRetenedor extends CHoyo
{
	private static int _CantHoyoRetenedor;
	public CHoyoRetenedor()
	{
		super( "HoyoRet", ++_CantHoyoRetenedor );
	}
	@Override
	public boolean recibeBola() 
	{
		return true;
	}

}
