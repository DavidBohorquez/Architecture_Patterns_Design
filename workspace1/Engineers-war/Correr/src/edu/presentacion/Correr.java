package edu.presentacion;

import java.util.EventListener;

import edu.cableado.IControlable;
import edu.cableado.IMovibleDer;

public class Correr implements IControlable, IMovibleDer {

	private Teclado controlT;

	@Override
	public EventListener configurar() {
		if (controlT == null) {
			controlT = new Teclado();
			controlT.setControl(this);
		}
		return controlT;
	}

	@Override
	public void controlar(IControlable ic) {
		controlT.setObjeto(ic);
	}

	@Override
	public void moverDer(IControlable ic) {
		controlT.setObjeto(ic);

	}

	@Override
	public int velocidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void asignarVelocidad(int vel) {
		controlT.setVeloDer(vel);
	}

	@Override
	public void orientarDerecha() {
		// TODO Auto-generated method stub

	}
}
