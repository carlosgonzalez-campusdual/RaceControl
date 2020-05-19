package racecontrol.entidades;

import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "garaje")
public class Garaje {

	private String nombreGaraje;
	// private Coche coche;
	private List<Coche> coches;

	public Garaje() {

	}

	public void setNombreGaraje(String nombreGaraje) {
		this.nombreGaraje = nombreGaraje;
	}

	public void setCoches(List<Coche> coches) {
		this.coches = coches;
	}

	// ------GETTERS-------
	@XmlElement(name = "nombre_garaje")
	public String getNombreGaraje() {
		return nombreGaraje;
	}

	@XmlElement(name = "coche")
	public List<Coche> getCoches() {
		return coches;
	}

	@Override
	public String toString() {
		return "Nombre de garaje: " + nombreGaraje + "\n" + coches.toString();
	}

//	public Coche getCoche() {
//		return coche;
//	}
//
//
//	public void setCoche(Coche coche) {
//		this.coche = coche;
//	}

//	public List<Coche>agregarCoche(){
//		List<Coche>lista = new ArrayList<Coche>();
//		
//		for (int i = 0; i < lista.; i++) {
//			
//			lista.add(getCoche());	
//		}
//		return lista;
//	}

//	@XmlElement(name = "escuderia")
//	public List<Escuderia> getEscuderia() {
//		return escuderia;
//	}

}
