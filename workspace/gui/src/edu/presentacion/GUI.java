package edu.presentacion;

import javax.swing.JOptionPane;

import edu.cableado.IEntrada;
import edu.cableado.ISalida;

public class GUI implements IEntrada, ISalida {

	@Override
	public void desplegarInformacion() {
		JOptionPane.showMessageDialog(null, "Desplegando los resultados del perfilmaiento. \n"+getClass().getName());
	}

	@Override
	public void recibirInformacion() {
		JOptionPane.showMessageDialog(null, "Recibiendo informaci�n...\n"
				+ "*Datos personales\n*Preferencias Acad�micas\n*... \n" + getClass().getName());
	}

}
