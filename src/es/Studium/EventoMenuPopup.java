package es.Studium;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.PopupMenu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventoMenuPopup extends Frame implements ActionListener, WindowListener
{
	private static final long serialVersionUID = 1L;
	Button btnBoton = new Button("Púlsame...");
	// Crear el menú popup
	PopupMenu ppMenu = new PopupMenu("Popup");
	// Crear las opciones del menú
	MenuItem mnUno = new MenuItem("Rojo");
	MenuItem mnDos = new MenuItem("Blanco");
	public EventoMenuPopup() 
	{
		setLayout(new FlowLayout());
		setTitle("Menú Pop-up");
		//Añadimos el botón 
		add(btnBoton);
		//Añadimos las opciones al menú 
		ppMenu.add(mnUno);
		ppMenu.add(mnDos);
		//Añadimos el menú 
		add(ppMenu);
		//Añadir los Listenerś
		btnBoton.addActionListener(this);
		mnUno.addActionListener(this);
		mnDos.addActionListener(this); 
		addWindowListener(this);
		setSize(250,100);
		setVisible(true); 
	}
	public static void main(String[] args) 
	{
		new EventoMenuPopup(); 
	}
	public void actionPerformed(ActionEvent ae) 
	{
		Object a;
		//Obtener qué se ha producido, si pulsado el botón o una opción del menú
		a = ae.getSource();
		if(a.equals(btnBoton)) 
		{
			//Se mostrará el popup a una distancia de 10 en
			//horizontal y 10 en vertical respecto al objeto btnBoton 
			ppMenu.show(btnBoton,10,10);
		}
		else if(a.equals(mnUno)) 
		{
			setBackground(Color.red); 
		}
		else 
		{
			setBackground(Color.white); 
		}
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0); 
	}
	public void windowDeactivated(WindowEvent we) {}
	public void windowDeiconified(WindowEvent we) {}
	public void windowIconified(WindowEvent we) {}
	public void windowOpened(WindowEvent we) {}
}