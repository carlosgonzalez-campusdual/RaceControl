package racecontrol.entidades;

import java.util.ArrayList;
import java.util.List;

public class Torneo {

	private String nombre;
	private List<Garaje> garajes;
	private List<Carrera> carreras;
	private List<Coche> coches;
	private List<Puntuacion> puntuacionCoches;

	public Torneo(String nombre, List<Garaje> garajes, List<Carrera> Carreras) {
		this.nombre = nombre;
		this.garajes = garajes;
		this.carreras = Carreras;
		this.carreras = garajesParticipantes(garajes);
		this.coches = cochesParticipantes(garajes);
		this.puntuacionCoches = new ArrayList<Puntuacion>();
		this.puntuacionCoches = resetPuntuacion(this.coches);
		for (Carrera carrera : this.carreras) {
			carrera.setCoches(coches);
		}
	}

	public String toString() {
		return "Torneo: " + nombre + "\n" + "Garajes: " + garajes.toString() + "\n" + "Races: " + carreras.toString()
				+ "\n" + "Coches: " + coches.toString() + "\n"+
		"Puntuaciones: " + puntuacionCoches.toString() + "\n" ;
	}

	private List<Carrera> garajesParticipantes(List<Garaje> garajes) {
		for (Carrera carrera : carreras) {
			carrera.setGaraje(garajes);
		}
		return carreras;
	}

	private List<Coche> cochesParticipantes(List<Garaje> garajes) {
		if (garajes.size() == 1) {
			return garajes.get(0).getCoches();
		} else {
			return seleccionarCocheAleatorio(garajes);
		}
	}

	private List<Coche> seleccionarCocheAleatorio(List<Garaje> garajes) {
		List<Coche> cochesAleatorios = new ArrayList<Coche>();
		for (Garaje garaje : garajes) {
			cochesAleatorios.add(getCocheAleatorio(garaje));
		}
		return cochesAleatorios;
	}

	private Coche getCocheAleatorio(Garaje garaje) {
		int cochesGaraje = garaje.getCoches().size();
		int seleccionarPosicionAleatoria = new Double(Math.random() * cochesGaraje).intValue();
		return garaje.getCoches().get(seleccionarPosicionAleatoria);
	}

	private void setPuntuacion(Coche coche, int puntuacion) {
		for (Puntuacion puntuacionCoches : puntuacionCoches) {
			if (puntuacionCoches.getCoche() == coche) {
				puntuacionCoches.setPuntuacion(puntuacionCoches.getPuntuacion()+puntuacion);
			}
		}
	}

	public Podio celebrarTorneo() {
		for (Carrera carrera : carreras) {
			Podio podioCarrera = carrera.correrCarrera();
			List<Coche> podio = podioCarrera.getCoches();
			for (Coche coche : podio) {
				setPuntuacion(coche, podio.size() - podio.indexOf(coche));
			}
		}
		Podio podio = new Podio(null, null, null);
		return podio;
	}

	public List<Puntuacion> resetPuntuacion(List<Coche> coches) {
		for (Coche coche : coches) {
			Puntuacion puntuacionCoches = new Puntuacion();
			puntuacionCoches.setCoche(coche);
			puntuacionCoches.setPuntuacion(0);
			this.puntuacionCoches.add(puntuacionCoches);
		}
		return this.puntuacionCoches;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public List<Garaje> getGarajes() {
		return garajes;
	}

	public void setGarajes(List<Garaje> garajes) {
		this.garajes = garajes;
	}

	public List<Carrera> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carrera> carreras) {
		this.carreras = carreras;
	}

	public List<Puntuacion> getPuntuacionCoches() {
		return puntuacionCoches;
	}

	public void setPuntuacionCoches(List<Puntuacion> puntuacionCoches) {
		this.puntuacionCoches = puntuacionCoches;
	}
	
	

}
