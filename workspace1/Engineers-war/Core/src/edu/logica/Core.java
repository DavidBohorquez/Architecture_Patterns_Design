package edu.logica;

import javax.swing.JOptionPane;

import edu.cableado.IRegla;

public class Core implements IRegla {

	@Override
	public void verificarReglas() {
		JOptionPane.showMessageDialog(null, "Soy 2 " + getClass().getName());
	}

}
