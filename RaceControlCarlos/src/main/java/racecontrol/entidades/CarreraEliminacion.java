package racecontrol.entidades;

import java.util.List;

public class CarreraEliminacion extends Carrera {
	// private int numCoche;
	// private int duracionCalentamiento = 20;
	private int vueltas;
	// private int duracionTotal = duracionCalentamiento + duracionCarrera;

	public CarreraEliminacion(String nombreCarrera, int duracion) {
		super(nombreCarrera, duracion);
		this.vueltas = listaCoches.size();
	}

	public CarreraEliminacion(String nombreCarrera, int duracion, List<Coche> listaCoches) {
		this(nombreCarrera, duracion);
		this.listaCoches = listaCoches;
	}

	protected List<Coche> vuelta() {
		setMediaVelocidad();
		ordenarCoches();
		borrarUltimoCoche();
		System.out.println(listaCoches.toString());
		return listaCoches;
	}

	private void borrarUltimoCoche() {
		Coche ultimoCoche = listaCoches.get(listaCoches.size() - 1);
		int ultimoCocheVuelta = (int) (ultimoCoche.getContador() / this.duracion);
		if (ultimoCocheVuelta == this.vueltaActual && ultimoCocheVuelta > 0) {
			listaCoches.remove(listaCoches.size() - 1);
			this.vueltaActual++;
		}
	}

	public Podio correrCarrera() {
		while (listaCoches.size() > 3) {
			vuelta();
		}
		this.podio = new Podio(listaCoches.get(0), listaCoches.get(1), listaCoches.get(2));
		return this.podio;
	}

}
