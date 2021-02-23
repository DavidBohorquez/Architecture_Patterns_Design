package edu.presentacion;

import java.awt.Component;
import java.awt.Graphics;
import java.util.EventListener;

import edu.cableado.IControlable;
import edu.cableado.IEscenario;
import edu.cableado.IPintable;

public class Nivel1 implements IEscenario, IControlable {

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

	@Override
	public EventListener configurar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void controlar(IControlable arg0) {
		// TODO Auto-generated method stub

	}

	/* IEscuchable */
	/*
	 * 
	 * @Override public EventListener escuchar() { // TODO Auto-generated method
	 * stub return null; }
	 * 
	 * @Override public void escuchar(IEscuchable arg0) { // TODO Auto-generated
	 * method stub
	 * 
	 * }
	 */

	/*
	 * @Override public void escuhar(IEscuchable arg0) {
	 * 
	 * 
	 * }
	 * 
	 * @Override public EventListener hablar() {
	 * 
	 * return null; }
	 */

}
