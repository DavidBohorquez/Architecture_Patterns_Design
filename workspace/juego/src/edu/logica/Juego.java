package edu.logica;

import java.awt.List;

import javax.swing.JOptionPane;

import edu.cableado.IAplicable;
import edu.cableado.IJugable;

public class Juego implements IJugable {

	@Override
	public void escogerJuego(IAplicable arg0) {
		JOptionPane.showMessageDialog(null,
				"Escogiendo un juego con base en las �reas de conocimiento planteadas.\n" + getClass().getName());
	}

	@Override
	public void divertir() {
		JOptionPane.showMessageDialog(null, "Jugando...\n" + getClass().getName());
	}

	@Override
	public List obtenerPuntajes() {
		JOptionPane.showMessageDialog(null, "Totalizando resultados de las partidas jugadas.\n" + getClass().getName());
		return null;
	}

}
