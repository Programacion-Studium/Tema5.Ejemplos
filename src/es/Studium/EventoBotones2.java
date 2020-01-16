package es.Studium;

import java.awt.*;
import java.awt.event.*;
public class EventoBotones2 extends WindowAdapter implements ActionListener //cambiamos esta linea
{
	//Quitamos private static final long serialVersionUID = 1L;
	//añadimos
	Frame frmVentana = new Frame ("Diferenciar botones");
	Button btnCerrar = new Button("Cerrar");
	//Dejamos como esta
	Button btnBoton1 = new Button("Uno");
	Button btnBoton2 = new Button("Dos");
	Label lblEtiqueta = new Label("    ");
	//creamos el evento botones y añadimos los frm
	public EventoBotones2()
	{
		frmVentana.setLayout(new FlowLayout());
		frmVentana.add(btnBoton1);
		frmVentana.add(btnBoton2);
		frmVentana.add(lblEtiqueta);
		frmVentana.addWindowListener(this);
		btnBoton1.addActionListener(this);
		btnBoton2.addActionListener(this);
		frmVentana.setSize(300,100);
		frmVentana.setVisible(true);
	}
	//cargamos el evento botones
	public static void main(String[] args)
	{
		new EventoBotones2();
	}

	public void actionPerformed(ActionEvent ae)
	{
		if(btnBoton1.equals(ae.getSource()))
		{
			lblEtiqueta.setText("Uno");
		}
		else
		{
			lblEtiqueta.setText("Dos");
		}
	}
	//Evento de cerrado
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}