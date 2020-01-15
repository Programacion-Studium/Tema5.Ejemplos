package es.Studium;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
public class EventoMenu extends Frame implements WindowListener, ActionListener 
{
	private static final long serialVersionUID = 1L; 
	// Declarar la Barra de Menú
	MenuBar mnbMenu = new MenuBar();
	// Declarar las opciones de la Barra de Menú 
	Menu mn1 = new Menu("Colores");
	Menu mn2 = new Menu("Salir");
	// Declarar las opciones de Colores 
	MenuItem mn11 = new MenuItem("Rojo");
	MenuItem mn12 = new MenuItem("Blanco");
	MenuItem mn21 = new MenuItem("Salir");
	public EventoMenu() 
	{
		setLayout(new FlowLayout());
		setTitle("Barra de Menú");
		// Crear el primer submenú añadiendo las opciones 
		mn1.add(mn11);
		// Añadir un Separador
		mn1.addSeparator();
		mn1.add(mn12);
		// Crear el segundo submenu
		mn2.add(mn21);
		// Añadir los submenús, a la barra de menú
		mnbMenu.add(mn1);
		mnbMenu.add(mn2);
		// Establecer la Barra de Menú como tal
		setMenuBar(mnbMenu);
		setSize(250,150);
		addWindowListener(this);
		// Se añaden los Listeners a las opciones de los submenús no a las opciones del menú 
		mn11.addActionListener(this);
		mn12.addActionListener(this);
		mn21.addActionListener(this);
		setVisible(true);
	}
	public static void main(String[] args) 
	{
		new EventoMenu(); 
	}
	public void actionPerformed(ActionEvent ae) 
	{
		Object a; a=ae.getSource(); if(a.equals(mn21)) 
		{
			System.exit(0); 
		}
		else if(a.equals(mn11)) 
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