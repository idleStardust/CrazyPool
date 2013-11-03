package bolas;

public class CBolaNivel extends CBola
{

	//ID
	static int _CantBolNiv;
	protected String _Tipo = "HOYO";
	
	//Juego
	protected int _Numero;
	
	public CBolaNivel(int pNum)
	{
		super("BolaNivel", ++_CantBolNiv);
		this._Numero = pNum;
	}

	@Override
	public void entrarEnHoyo() 
	{
		this.setEnJuego(false);
	}
}
