package orificios;

public class CHoyoTuberia extends CHoyo
{
	private static int _CantHoyoTub;
	public CHoyoTuberia() 
	{
		super( "HoyoTub" , ++_CantHoyoTub);
	}
	@Override
	public boolean recibeBola()
	{
		return true;
	}

}
