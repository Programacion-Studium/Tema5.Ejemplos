package es.Studium;
import java.awt.event.*;
import java.awt.*;
public class ListenerCerrar extends Frame implements WindowListener
{
	private static final long serialVersionUID = 1L;
	public ListenerCerrar()
	{
		setTitle("Ventana que se cierra"); 
		setSize(300,100);
		//Añadir el Listener a la ventana 
		addWindowListener(this); 
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new ListenerCerrar(); 
	}
	//A continuación debemos colocar TODOS los métodos de la clase 
	//abstracta WindowListener, aunque solamente vayamos a trabajar 
	//con el método windowClosing()
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {} 
	public void windowClosing(WindowEvent we)
	{
		//Llamamos al método exit de la clase System, 
		//devolviendo como código de salida un 0 
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {} 
	public void windowIconified(WindowEvent we) {} public void windowOpened(WindowEvent we) {}
}

