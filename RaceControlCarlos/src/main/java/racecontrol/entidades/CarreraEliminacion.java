package racecontrol.entidades;

import java.util.List;

public class CarreraEliminacion extends Carrera {
	private int numCoche;
	private int duracionCalentamiento = 20;
	private int duracionCarrera = numCoche - 1;
	private int duracionTotal = duracionCalentamiento + duracionCarrera;

	public CarreraEliminacion(String nombreCarrera, int duracion) {
		super(nombreCarrera, duracion);
		this.duracionCarrera = listaCoches.size() - 1;
	}

	public CarreraEliminacion(String nombreCarrera, int duracion, List<Coche> listaCoches) {
		this(nombreCarrera, duracion);
		this.listaCoches = listaCoches;
	}

	protected List<Coche> vuelta() {
		setMediaVelocidad();
		ordenarMedia();
		borrarUltimoCoche();
		System.out.println(listaCoches.toString());
		return listaCoches;
	}

	private void borrarUltimoCoche() {
		Coche ultimoCoche = listaCoches.get(listaCoches.size() - 1);
		int ultimoCocheVuelta = (int) (ultimoCoche.getVelocidadMedia() / this.duracionCarrera);
		if (ultimoCocheVuelta == this.duracionCarrera && listaCoches.size() > 0) {
			listaCoches.remove(listaCoches.size() - 1);
			this.duracionCarrera++;
		}
	}

	public Podio correrCarrera() {
		while (listaCoches.size() > 3) {
			vuelta();
		}
		this.podio = new Podio(listaCoches.get(0), listaCoches.get(1), listaCoches.get(2));
		return this.podio;
	}

//		List<Coche> listaCoches = new ArrayList<Coche>();
//		Coche c = new Coche("BMW", "M4");
//		Coche c1 = new Coche("Nissan", "GTR", c1.pasarMedia());
//		Coche c2 = new Coche("uno","uno ",c.pasarMedia());
//		Coche c3 = new Coche("BMW", "M4",c.pasarMedia());
//		Coche c4 = new Coche("Nissan", "GTR",c.pasarMedia());

//		listaCoches.add(c);
//		listaCoches.add(c1);
//		listaCoches.add(c2);
//		listaCoches.add(c3);
//		listaCoches.add(c4);

	// return cochesParticipantes;
}
