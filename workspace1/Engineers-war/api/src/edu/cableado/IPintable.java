package edu.cableado;

import java.awt.Graphics;
import java.awt.Image;
import java.net.URL;

public interface IPintable {

	void pintar(Graphics g);

	Image figura();

	void sprite(Image img);

	Graphics lapiz();
}
