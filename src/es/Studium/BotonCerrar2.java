package es.Studium;
import java.awt.event.*;
import java.awt.*;
//Declaramos nuestra clase que hereda de Frame e implementa 
//WindowListener y ActionListener para el botón
public class BotonCerrar2 extends WindowAdapter implements ActionListener
{
	//añadimos
	Frame frmVentana = new Frame ("Diferenciar botones");//Es donde meteremos todo los botones y ventanas
	Button btnCerrar = new Button("Cerrar");
	//Dejamos como esta
	public BotonCerrar2() 
	{
		frmVentana.setLayout(new FlowLayout()); 
		//Titulo de la ventana
		frmVentana.setTitle("Botón que cierra la ventana"); 
		//Añadimos el boton
		frmVentana.add(btnCerrar); 
		//añadimos el Listener
		frmVentana.addWindowListener(this);
		//Añadir el listener al botón 
		btnCerrar.addActionListener(this);
		//Configuramos el tamaño de la ventana
		frmVentana.setSize(100,100);
		//Hacemos visible la ventana
		frmVentana.setVisible(true);
	}
	public static void main(String[] args) 
	{
		new BotonCerrar2(); 
	}
	//A continuación debemos colocar el método de la clase
	//abstracta ActionListener
	public void actionPerformed(ActionEvent ae) 
	{
		System.exit(0); 
	}

	public void windowClosing(WindowEvent we)
	{
		System.exit(0); 
	}
}
