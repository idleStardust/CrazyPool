package bolas;

public class CBolaNivel extends CBola
{

	//ID
	static int _CantBolNiv;
	protected String _Tipo = "HOYO";
	
	//Juego
	protected int _Nivel;
	
	public CBolaNivel(int pNivel, int pJugador)
	{
		super("BolaNivel", ++_CantBolNiv, pJugador);
		this._Nivel = pNivel;
	}

	@Override
	public void entrarEnHoyo() 
	{
		this.setEnJuego(false);
	}
}
