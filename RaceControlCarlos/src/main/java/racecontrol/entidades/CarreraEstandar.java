package racecontrol.entidades;

import java.util.List;

public class CarreraEstandar extends Carrera {
	private int conjuntoVueltas;

	public CarreraEstandar(String nombrePremio, int duracion, int conjuntoVueltas) {
		super(nombrePremio, duracion);
		this.duracion = duracion;
		this.conjuntoVueltas = conjuntoVueltas;

	}

	public CarreraEstandar(String nombrePremio, int duracion, List<Coche> listaCoches, int conjuntoVueltas) {
		this(nombrePremio, duracion, conjuntoVueltas);
		this.listaCoches.addAll(listaCoches);
	}

	protected List<Coche> vuelta() {
		setMediaVelocidad();
		ordenarCoches();
		System.out.println(listaCoches.toString());
		return this.listaCoches;
	}

	private int getPrimerCocheVuelta() {
		Coche primerCoche = listaCoches.get(0);
		return primerCoche.getContador() / this.duracion;
	}

	@Override
	public Podio correrCarrera() {
		while (vueltaActual < conjuntoVueltas) {
			vuelta();
			if (vueltaActual == getPrimerCocheVuelta()) {
				vueltaActual++;
			}
		}
		podio = new Podio(listaCoches.get(0), listaCoches.get(1), listaCoches.get(2));
		return podio;
	}

}
