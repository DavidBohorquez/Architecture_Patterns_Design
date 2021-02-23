package edu.presentacion.command;

import edu.cableado.IControlable;
import edu.cableado.IMovibleDer;
import edu.cableado.IPintable;
import edu.cableado.IUbicable;

public class MovIzq extends Command {

	private IControlable ic;
	private int vel;

	public MovIzq(IControlable ic, int vel) {
		this.ic = ic;
		this.vel = vel;
	}

	@Override
	public void ejecutar() {
		System.out.println("KEY PRESSED DERECHA");
		((IUbicable) ic).setPosX(((IUbicable) ic).getPosX() + vel);
		((IMovibleDer) ic).orientarDerecha();
		((IPintable) ic).pintar(((IPintable) ic).lapiz());

	}

}
