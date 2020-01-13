package es.Studium;
import java.awt.event.*;
import java.awt.*;
//Declaramos nuestra clase que hereda de Frame e implementa 
//WindowListener y ActionListener para el botón
public class BotonCerrar extends Frame implements WindowListener, ActionListener
{
	private static final long serialVersionUID = 1L; 
	//Creamos el boton
	Button btnBoton = new Button("Cerrar");
	public BotonCerrar() 
	{
		setLayout(new FlowLayout()); 
		//Titulo de la ventana
		setTitle("Botón que cierra la ventana"); 
		//Añadimos el boton
		add(btnBoton); 
		//añadimos el Listener
		addWindowListener(this);
		//Añadir el listener al botón 
		btnBoton.addActionListener(this);
		//Configuramos el tamaño de la ventana
		setSize(100,100);
		//Hacemos visible la ventana
		setVisible(true);
	}
	public static void main(String[] args) 
		{
		new BotonCerrar(); 
		}
	//A continuación debemos colocar el método de la clase
	//abstracta ActionListener
	public void actionPerformed(ActionEvent ae) {
		System.exit(0); }
	public void windowActivated(WindowEvent we) {} 
	public void windowClosed(WindowEvent we) {} 
	public void windowClosing(WindowEvent we)
	{
		System.exit(0); }
	public void windowDeactivated(WindowEvent we) {} 
	public void windowDeiconified(WindowEvent we) {} 
	public void windowIconified(WindowEvent we) {} 
	public void windowOpened(WindowEvent we) {}
}
//Fin de la clase EventoBotonCerrar
