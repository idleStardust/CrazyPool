package elementos;

public class CBolaNivel extends CBola
{
	static int _CantBolNiv;
	public CBolaNivel()
	{
		super("BolaNivel", ++_CantBolNiv);
	}
}
