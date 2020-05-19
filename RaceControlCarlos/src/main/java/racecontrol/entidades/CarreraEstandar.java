package racecontrol.entidades;

import java.util.List;

public class CarreraEstandar extends Carrera {
	private final int duracionEnHoras;

	public CarreraEstandar(String nombrePremio, int duracion, int duracionEnHoras) {
		super(nombrePremio, duracion);
		this.duracion = duracion;
		this.duracionEnHoras = duracionEnHoras;
		// TODO Auto-generated constructor stub
	}

	public CarreraEstandar(String nombrePremio, int duracion, List<Coche> listaCoches, int duracionEnHoras) {
		this(nombrePremio, duracion, duracionEnHoras);
		this.listaCoches.addAll(listaCoches);
	}

	protected List<Coche> participantes() {
		setMediaVelocidad();
		ordenarMedia();
		System.out.println(listaCoches.toString());
		return this.listaCoches;
	}

	@Override
	public Podio correrCarrera() {
		for (int i = 0; i < listaCoches.size(); i++) {
			podio = new Podio(listaCoches.get(0), listaCoches.get(1), listaCoches.get(2));
		}
		return podio;
	}

}
