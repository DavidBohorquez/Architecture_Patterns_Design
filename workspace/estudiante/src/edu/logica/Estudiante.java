package edu.logica;

import javax.swing.JOptionPane;

import edu.cableado.IPerfilable;

public class Estudiante implements IPerfilable {

	@Override
	public void perfilar(IPerfilable arg0) {
		JOptionPane.showMessageDialog(null, "Estudiante perfilado.\n" + getClass().getName());
	}

}
