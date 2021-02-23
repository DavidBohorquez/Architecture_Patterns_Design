package edu.presentacion;

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import edu.cableado.IPintable;

/**
 * @author bluep
 *
 */
public class TestCanvas extends Canvas {

	private Background backOne;
	private Background backTwo;

	private BufferedImage image;

	private Graphics lapiz;

	TestCanvas() {
		backOne = new Background(0, 0);
		backTwo = new Background(backOne.getImageWidth(), 0);
	}

	Graphics getLapiz() {
		return lapiz;
	}

	IPintable trazo;

	public IPintable getTrazo() {
		return trazo;
	}

	public void setTrazo(IPintable trazo) {
		this.trazo = trazo;
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		Graphics2D pincel = (Graphics2D) g;

		if (image == null) {
			image = (BufferedImage) (createImage(getWidth(), getHeight()));
			lapiz = image.createGraphics();
		}

		lapiz.setColor(getBackground());
		lapiz.fillRect(0, 0, getWidth(), getHeight());

		lapiz.drawImage(backOne.getImage(), backOne.getX(), backOne.getY(), null);
		lapiz.drawImage(backTwo.getImage(), backTwo.getX(), backTwo.getY(), null);

		pincel.drawImage(image, null, 0, 0);

		if (trazo != null)
			trazo.pintar(g);

		backOne.move();
		backTwo.move();
	}

	@Override
	public void update(Graphics window) {
		paint(window);
	}

}
