package edu.presentacion;

import java.awt.Component;
import java.awt.Graphics;

import edu.cableado.IEscenario;
import edu.cableado.IPintable;

public class Nivel1 implements IEscenario {

	private BoardView tablero;

	@Override
	public Component crear() {
		if (tablero == null) {
			tablero = new BoardView();
		}
		return tablero.getLienzo();
	}

	@Override
	public void mostrar(IPintable p) {
		tablero.getLienzo().setTrazo(p);
		tablero.getLienzo().repaint();
	}

	@Override
	public Graphics pincel() {
		return crear().getGraphics();
	}
}
