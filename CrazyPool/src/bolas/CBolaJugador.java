package bolas;

public class CBolaJugador extends CBola
{
	static int _CantBolJug;
	
	public CBolaJugador()
	{
		super("BolaJugad", ++_CantBolJug);
	}

	@Override
	public void entrarEnHoyo() 
	{
		
	}
}
