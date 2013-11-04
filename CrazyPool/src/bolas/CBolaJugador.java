package bolas;

public class CBolaJugador extends CBola
{
	public CBolaJugador(int pJugador)
	{
		super("BolaJugador", pJugador, pJugador);
		this._Jugador = pJugador; 
	}

	@Override
	public void entrarEnHoyo() 
	{
		
	}
}
