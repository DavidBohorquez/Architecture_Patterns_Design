package edu.logica;

import edu.cableado.IAplicable;
import edu.cableado.IEntrada;
import edu.cableado.IJugable;
import edu.cableado.IModerador;
import edu.cableado.IPerfilable;
import edu.cableado.ISalida;
import edu.cargador.Cargador;

public class TuPerfil implements IModerador {

	@Override
	public void moderar() {
		Cargador cf = new Cargador("front/");
		@SuppressWarnings("rawtypes")
		Class cls = cf.getClase(IEntrada.class.getName());

		IEntrada entrada = null;

		if (cls != null) {
			try {
				entrada = (IEntrada) cls.newInstance();
				entrada.recibirInformacion();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		IAplicable contexto = null;
		IJugable juego = null;
		IPerfilable perfil = null;

		Cargador cb = new Cargador("back/");
		cls = cb.getClase(IAplicable.class.getName());

		if (cls != null) {
			try {
				contexto = (IAplicable) cls.newInstance();
				contexto.analizarEscenarios();
				contexto.plantearEscenarios();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		cb = new Cargador("back/");
		cls = cb.getClase(IJugable.class.getName());

		if (cls != null) {
			try {
				juego = (IJugable) cls.newInstance();
				juego.escogerJuego(contexto);
				juego.divertir();
				juego.obtenerPuntajes();
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		cb = new Cargador("back/");
		cls = cb.getClase(IPerfilable.class.getName());

		if (cls != null) {
			try {
				perfil = (IPerfilable) cls.newInstance();
				perfil.perfilar(perfil);
			} catch (InstantiationException | IllegalAccessException e) {
				e.printStackTrace();
			}
		}

		((ISalida) entrada).desplegarInformacion();

	}

	public static void main(String[] args) {
		new TuPerfil().moderar();
	}

}
