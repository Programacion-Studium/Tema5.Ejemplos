package es.Studium;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class VariosBotones extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L;
	Button btnBoton1 = new Button("Uno");
	Button btnBoton2 = new Button("Dos");
	Label lblEtiqueta = new Label("");
	public VariosBotones() 
	{
		setLayout(new FlowLayout()); setTitle("Diferenciar botones");
		add(btnBoton1);
		add(btnBoton2);
		add(lblEtiqueta);
		addWindowListener(this);
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		setSize(300,100);
		setVisible(true); 
	}
	public static void main(String[] args) 
	{
		new VariosBotones(); 
	}
	public void windowActivated(WindowEvent we) {}
	public void windowClosed(WindowEvent we) {} 
	public void windowClosing(WindowEvent we)
	{
		System.exit(0); }
	public void windowDeactivated(WindowEvent we) {} 
	public void windowDeiconified(WindowEvent we) {} 
	public void windowIconified(WindowEvent we) {} 
	public void windowOpened(WindowEvent we) {}
	public void actionPerformed(ActionEvent ae) 
	{
		//Mediante la comparación de cadenas con equals 
		//comprobaremos qué botón se pulsó mediante el método
		//getSource que al aplicarse sobre el objeto ae
		//nos dirá el nombre del botón que generó el evento 
		if(btnBoton1.equals(ae.getSource()))
		{
			lblEtiqueta.setText("Uno");
		}
		else {
			lblEtiqueta.setText("Dos");
		}
	}
	//Fin de la clase EventoBotones
}