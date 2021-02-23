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
public class TestCanvas extends Canvas implements Runnable {

	private Background backOne;
	private Background backTwo;

	private BufferedImage image;

	private Graphics lapiz;

	private IPintable trazo;

	private Thread drawThread;

	TestCanvas() {
		backOne = new Background(0, 0);
		backTwo = new Background(backOne.getImageWidth(), 0);

		drawThread = new Thread(this);
		drawThread.start();
	}

	@Override
	public void paint(Graphics g) {
		Graphics2D pincel = (Graphics2D) g;

		if (image == null) {
			image = (BufferedImage) (createImage(getWidth(), getHeight()));
			lapiz = image.createGraphics();
		}
		super.paint(lapiz);

		lapiz.setColor(getBackground());
		lapiz.fillRect(0, 0, getWidth(), getHeight());

		lapiz.drawImage(backOne.getImage(), backOne.getX(), backOne.getY(), null);
		lapiz.drawImage(backTwo.getImage(), backTwo.getX(), backTwo.getY(), null);

		if (trazo != null)
			trazo.pintar(lapiz);

		pincel.drawImage(image, null, 0, 0);

		backOne.move();
		backTwo.move();
	}

	@Override
	public void update(Graphics window) {
		paint(window);
	}

	@Override
	public void run() {
		try {
			while (true) {
				Thread.currentThread().sleep(5);
				repaint();
			}
		} catch (Exception e) {
		}
	}

	public IPintable getTrazo() {
		return trazo;
	}

	public void setTrazo(IPintable trazo) {
		this.trazo = trazo;
	}

	Graphics getLapiz() {
		return lapiz;
	}

}
