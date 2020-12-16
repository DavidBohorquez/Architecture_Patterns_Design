package edu.logica;

import javax.swing.JOptionPane;

import edu.cableado.IAplicable;

public class Profesion implements IAplicable {

	@Override
	public void analizarEscenarios() {
		JOptionPane.showMessageDialog(null, "Analizando la demanda de profesiones.\n" + getClass().getName());
	}

	@Override
	public void plantearEscenarios() {
		JOptionPane.showMessageDialog(null, "Seleccionando áreas de conocimiento.\n" + getClass().getName());
	}

}
