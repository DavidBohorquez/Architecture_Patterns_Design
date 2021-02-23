package edu.presentacion;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import edu.cableado.IControlable;
import edu.cableado.IMovibleDer;
import edu.cableado.IPintable;
import edu.cableado.IUbicable;
import edu.presentacion.command.Command;
import edu.presentacion.command.Derecha;
import edu.presentacion.command.Invoker;
import edu.presentacion.command.MovDer;
import edu.presentacion.command.MovIzq;

public class Teclado implements KeyListener, MouseListener {

	private IControlable objeto;

	private Correr control;

	private int velo = 0;

	private Derecha der;

	private Command commDer;
	private Command commIzq;

	private Invoker inv;

	public Teclado() {
		der = new Derecha(getObjeto(), getVeloDer());
		commDer = new MovDer(der);
		commIzq = new MovIzq(getObjeto(), velo);
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int c = e.getKeyCode();
		if (c == KeyEvent.VK_RIGHT) {
			inv = new Invoker(commDer);
			inv.click();
		}
		if (c == KeyEvent.VK_LEFT) {
			inv = new Invoker(commIzq);
			inv.click();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		System.out.println("MOUSE ESCUCHADOR : " + velo);
		((IUbicable) getObjeto()).setPosX(((IUbicable) getObjeto()).getPosX() + velo);
		((IMovibleDer) getObjeto()).orientarDerecha();
		((IPintable) getObjeto()).pintar(((IPintable) getObjeto()).lapiz());
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	public IControlable getObjeto() {
		return objeto;
	}

	public void setObjeto(IControlable objeto) {
		this.objeto = objeto;
	}

	public int getVeloDer() {
		return velo;
	}

	public void setVeloDer(int veloDer) {
		this.velo = veloDer;
	}

	public Correr getControl() {
		return control;
	}

	public void setControl(Correr control) {
		this.control = control;
	}
}
