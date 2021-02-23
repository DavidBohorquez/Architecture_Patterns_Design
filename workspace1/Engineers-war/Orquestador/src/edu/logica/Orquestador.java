package edu.logica;

import java.awt.event.KeyListener;

import edu.cableado.IControlable;
import edu.cableado.IEscenario;
import edu.cableado.IModerador;
import edu.cableado.IMovibleDer;
import edu.cableado.IPintable;
import edu.cableado.IUbicable;
import edu.cargador.Cargador;

public class Orquestador implements IModerador {

	@Override
	public void moderar() {
		Cargador cf = new Cargador("front/");
		Class cls = cf.getClase(IEscenario.class.getName());

		IEscenario nivel1 = null;
		IControlable controlCorrer = null;

		if (cls != null) {
			try {
				nivel1 = (IEscenario) cls.newInstance();
				nivel1.crear();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		cf = new Cargador("front/");
		cls = cf.getClase(IControlable.class.getName());

		if (cls != null) {
			try {
				controlCorrer = (IControlable) cls.newInstance();
				nivel1.crear().addKeyListener((KeyListener) controlCorrer.configurar());
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		Cargador cb = new Cargador("back/");
		cls = cb.getClase(IUbicable.class.getName());

		IUbicable personaje = null;

		if (cls != null) {
			try {
				personaje = (IUbicable) cls.newInstance();
				((IPintable) personaje).pintar(nivel1.pincel());
				nivel1.mostrar((IPintable) personaje);
				controlCorrer.controlar((IControlable) personaje);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		cb = new Cargador("back/");
		cls = cb.getClase(IMovibleDer.class.getName());

		IMovibleDer derecha = null;

		if (cls != null) {
			try {
				derecha = (IMovibleDer) cls.newInstance();

				((IMovibleDer) controlCorrer).asignarVelocidad(derecha.velocidad());
				// derecha.moverDer((IControlable) personaje);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		new Orquestador().moderar();
	}

}
