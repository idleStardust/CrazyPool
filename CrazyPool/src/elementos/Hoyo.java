package elementos;

import java.util.Observable;

public class Hoyo extends Observable
{
	static int CantHoy;
	String _ID;
	Hoyo()
	{
		this._ID = "HOYO" + CantHoy;
	}
}
