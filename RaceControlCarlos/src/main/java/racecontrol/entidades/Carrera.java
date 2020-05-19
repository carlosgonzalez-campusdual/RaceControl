package racecontrol.entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public abstract class Carrera {
	private String nombrePremio;
	private Garaje garajeCarrera;
	protected List<Garaje> garajesParticipantes;
	protected List<Coche> listaCoches;
	protected int duracion;
	protected Podio podio;
	protected int vueltaActual;

	protected abstract List<Coche> vuelta();

	public Carrera(String nombrePremio, int duracion) {
		this.vueltaActual = 1;
		this.nombrePremio = nombrePremio;
		this.duracion = duracion;
		this.garajesParticipantes = new ArrayList<Garaje>();
		this.listaCoches = new ArrayList<Coche>();
	}

	public String toString() {
		return "Nombre del Premio : " + nombrePremio + "\n\t" + "Duracion: " + duracion + "\n\t" + "Coches: "
				+ listaCoches.toString() + "\n\t";
	}

	public Carrera(String nombrePremio, int duracion, List<Coche> listaCoches) {
		this(nombrePremio, duracion);
		this.listaCoches.addAll(listaCoches);
	}

	public void setGaraje(List<Garaje> garajesParticipantes) {
		this.garajesParticipantes.addAll(garajesParticipantes);
	}

	public void setCoches(List<Coche> listaCoches) {
		this.listaCoches.addAll(listaCoches);
	}

	private Comparator compararContador = new Comparator<Coche>() {
		public int compare(Coche coche1, Coche coche2) {
			return (int) ((coche1.getContador() + coche2.getContador()));

		}
	};

	protected void ordenarCoches() {
		Collections.sort(listaCoches, compararContador);

	}

	protected void setMediaVelocidad() {
		for (Coche coche : listaCoches) {
			coche.distancias();
		}
	}

	public abstract Podio correrCarrera();

	public int getTotalVueltas() {
		return this.vueltaActual;
	}

//	public double pasarMedia() {
//		List<Double> velocidades = new ArrayList<Double>();
//		double velocidadAleatoria;
//		double velocidadInicial = 300;
//		double suma = 0.0;
//		double media = 0.0;
//
//		for (int i = 0; i < 180; i++) {
//			velocidadAleatoria = generarRandomVelocity();
//			double velocidadTotal = velocidadInicial + velocidadAleatoria;
//			velocidades.add(velocidadTotal);
//
//		}
//		for (int i = 0; i < velocidades.size(); i++) {
//			suma += Double.parseDouble(velocidades.get(i).toString());
//		}
//		// System.out.println("suma " + suma);
//
//		media = suma / velocidades.size();
//		// System.out.println("media " + media);
//
//		return media;
//	}
//
//	public static int generarRandomVelocity() {
//
//		int aceleracionFrenanda = (int) (Math.random() * 60 * (Math.random() > 0.5 ? 1 : -1));
//
//		return aceleracionFrenanda;
//	}

}
