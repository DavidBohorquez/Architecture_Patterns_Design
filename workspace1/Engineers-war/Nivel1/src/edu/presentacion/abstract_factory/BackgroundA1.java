package edu.presentacion.abstract_factory;

import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;

public class BackgroundA1 extends ProductoAbstractoA{
	private BufferedImage image;

	private int x;
	private int y;

	public BackgroundA1(int x, int y) {
		this.x = x;
		this.y = y;
		try {
			image = ImageIO.read(getClass().getResource("/recursos/images/game/background.png"));

		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public void move() {

		this.x -= 5;

		if (this.x <= -1 * image.getWidth()) {

			this.x = this.x + image.getWidth() * 2;
		}

	}

	public void setX(int x) {
		this.x = x;
	}

	public int getX() {
		return this.x;
	}

	public int getY() {
		return this.y;
	}

	public int getImageWidth() {
		return image.getWidth();
	}

	public BufferedImage getImage() {
		return image;
	}

	public String toString() {
		return "Background: x=&amp;amp;amp;quot;" + getX() + ", y=" + getY() + ", height=" + image.getHeight()
				+ ", width=" + image.getWidth();
	}
}
