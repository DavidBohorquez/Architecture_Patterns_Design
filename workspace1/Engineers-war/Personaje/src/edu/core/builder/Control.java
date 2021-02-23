package edu.core.builder;

import java.awt.Graphics;

public class Control extends Game {
	
	int posX = 0;
	int posY = 0;
	Graphics g;
	
	public void controlAvatar() {
		chara.orientarDerecha();
	}
	
	public void paintPicture() {
		chara.pintar(g);
	}
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosX(int x) {
		posX = x;
	}

	public void setPosY(int y) {
		posY = y;
	}
}
