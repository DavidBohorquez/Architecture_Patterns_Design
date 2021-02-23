package edu.core.builder;

import java.awt.Graphics;
import java.awt.Image;
import java.util.EventListener;

import javax.swing.ImageIcon;

import edu.cableado.IControlable;
import edu.cableado.IMovibleDer;
import edu.cableado.IPintable;
import edu.cableado.IUbicable;

public class Character implements IUbicable, IPintable, IControlable, IMovibleDer {
	
	int posX = 0;
	int posY = 0;

	Graphics lapiz;
	Image sprite;

	public Character() {
		posY = 280;
		sprite = new ImageIcon(getClass().getResource("/recursos/images/game/sprite1.png")).getImage();
	}

	@Override
	public void pintar(Graphics g) {
		sprite(sprite);
		lapiz = g;
		lapiz.drawImage(figura(), getPosX(), getPosY(), null);
	}

	@Override
	public Image figura() {
		return sprite;
	}

	@Override
	public void sprite(Image img) {
		sprite = img;
	}

	@Override
	public Graphics lapiz() {
		return lapiz;
	}

	@Override
	public int getPosX() {
		return posX;
	}

	@Override
	public int getPosY() {
		return posY;
	}

	@Override
	public void setPosX(int x) {
		posX = x;
	}

	@Override
	public void setPosY(int y) {
		posY = y;
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

	@Override
	public void moverDer(IControlable arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public int velocidad() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void asignarVelocidad(int arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void orientarDerecha() {
		sprite(new ImageIcon(getClass().getResource("/recursos/images/game/walkRight.png")).getImage());
	}
}
