package bolas;

public class CBolaComodin extends CBola
{
	static int _CantBolCom;
	
	public CBolaComodin()
	{
		super("BolaComod", ++_CantBolCom);
	}

	@Override
	public void entrarEnHoyo() 
	{
	}
}
