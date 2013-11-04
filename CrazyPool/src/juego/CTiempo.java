package juego;

public class CTiempo extends Thread
{
	private int _Minutos;
	private int _Segundos;
	private boolean _Detenido;
	private boolean _Pausado;
	
	CTiempo(int pSegundos)
	{
		this._Segundos = pSegundos;
		this._Minutos = pSegundos/60;
		this._Detenido = false;
		this._Pausado = false;
	}
	
	@Override
	public void run()
	{
		while(_Segundos >= 0 && !(this._Detenido))
		{
			System.out.println("Segundos: " + this._Segundos);
			try {
				Thread.sleep(1000);
			} 
			catch (InterruptedException e) {
				e.printStackTrace();
			}
			this._Segundos--;
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
	
	public synchronized void detener()
	{
		this._Detenido = true;
	}
	
	public synchronized void continuar()
	{
		this._Pausado = false;
	}
}
