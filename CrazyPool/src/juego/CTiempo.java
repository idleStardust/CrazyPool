package juego;

public class CTiempo extends Thread
{
	private int _Minutos;
	private int _Segundos;
	
	CTiempo(int pMinutos)
	{
		this._Minutos = pMinutos;
		this._Segundos = 0;
		this.run();
	}
	
	@Override
	public void run()
	{
		for(int x = this._Minutos; x >= 0; x--)
		{
			for(int y = _Segundos; y >= 0; y--)
			{
				System.out.println("Minutos " + this._Minutos + " Segundos: " + this._Segundos);
				this._Segundos--;
				try 
				{
					Thread.sleep(1000);
				} catch (InterruptedException e) 
				{
					e.printStackTrace();
				}
			}
			this._Segundos = 59;
			this._Minutos--;
		}
	}
	
	public int getMinutos()
	{
		return this._Minutos;
	}
	
	public int getSegundos()
	{
		return this._Segundos;
	}
}
