package es.Studium;
import java.awt.*;
import java.awt.event.*;
public class EventoCheckbox2 extends WindowAdapter implements ItemListener
{
	Frame frmVentana = new Frame ("Diferenciar botones");
	Button btnCerrar = new Button("Cerrar");
	// En este caso, se pueden elegir todas las opciones que queramos 
	Checkbox chkUno = new Checkbox("Uno");
	Checkbox chkDos = new Checkbox("Dos");
	Checkbox chkTres = new Checkbox("Tres");
	Label lblEtiqueta1 = new Label("Desactivado");
	Label lblEtiqueta2 = new Label("Desactivado");
	Label lblEtiqueta3 = new Label("Desactivado");
	public EventoCheckbox2() 
	{
		frmVentana.setLayout(new FlowLayout()); 
		frmVentana.setTitle("Botones de Opción"); 
		frmVentana.add(chkUno);
		frmVentana.add(lblEtiqueta1); 
		frmVentana.add(chkDos); 
		frmVentana.add(lblEtiqueta2); 
		frmVentana.add(chkTres); 
		frmVentana.add(lblEtiqueta3);
		frmVentana.addWindowListener(this);
		// Añadir los listeners a los botones de opción 
		chkUno.addItemListener(this);
		chkDos.addItemListener(this);
		chkTres.addItemListener(this);
		frmVentana.setSize(500,100);
		frmVentana.setVisible(true); 
	}
	public static void main(String[] args) 
	{
		new EventoCheckbox2();
	}
	// Primero debemos averiguar qué opción produjo este evento 
	// A continuación veremos su estado actual y actuaremos en 
	// consecuencia
	public void itemStateChanged(ItemEvent ie)
	{
		// Comparamos mediante equals, una cadena con el elemento 
		// que produjo el evento mediante getItem() 
		if("Uno".equals(ie.getItem()))
		{
			// Comparamos el estado actual del checkbox mediante
			// getStateChange() con la constante SELECTED aplicada 
			// al tipo de evento producido 
			if(ie.getStateChange()==ItemEvent.SELECTED)
			{
				lblEtiqueta1.setText("Activado"); 
			}
			else 
			{
				lblEtiqueta1.setText("Desactivado"); 
			}
		}
		else if("Dos".equals(ie.getItem())) 
		{
			if(ie.getStateChange()==ItemEvent.SELECTED) 
			{
				lblEtiqueta2.setText("Activado"); 
			}
			else 
			{
				lblEtiqueta2.setText("Desactivado"); 
			}
		}
		else if("Tres".equals(ie.getItem())) 
		{
			if(ie.getStateChange()==ItemEvent.SELECTED) 
			{
				lblEtiqueta3.setText("Activado"); 
			}
			else
			{
				lblEtiqueta3.setText("Desactivado");
			}
		}
	}
	public void windowClosing(WindowEvent we)
	{
		System.exit(0);
	}
}