package racecontrol.entidades;

public class Puntuacion {
	private Coche coche;
	private int puntuacion;
	
	
	
	
	public Coche getCoche() {
		return coche;
	}
	public void setCoche(Coche coche) {
		this.coche = coche;
	}
	public int getPuntuacion() {
		return puntuacion;
	}
	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}
	
	public String toString() {
		return "Coche: " + coche.toString() + " Puntuacion: " + puntuacion;
	}
	
	

}
