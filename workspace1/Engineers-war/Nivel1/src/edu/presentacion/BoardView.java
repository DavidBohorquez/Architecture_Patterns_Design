package edu.presentacion;

import java.awt.Color;

import javax.swing.JFrame;

public class BoardView extends JFrame {

	private TestCanvas lienzo;

	public BoardView() {
		lienzo = new TestCanvas();

		add(lienzo);

		initialize();
		setVisible(true);
	}

	private void initialize() {
		setBounds(100, 100, 816, 518);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public TestCanvas getLienzo() {
		if (lienzo == null) {
			lienzo = new TestCanvas();
			lienzo.setBounds(0, 0, 800, 480);
			lienzo.setBackground(Color.red);
		}
		return lienzo;
	}

}
