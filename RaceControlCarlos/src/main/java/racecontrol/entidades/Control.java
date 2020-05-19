package racecontrol.entidades;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBException;

import racecontrol.utils.ObtenerDatosCoche;

public class Control {
	
	public Control() {
		// TODO Auto-generated constructor stub
	}
	
	public Carrera crearCarrera() throws JAXBException {
		Garaje ferrari = ObtenerDatosCoche.convertirObjeto("ferrari");
		ferrari.setNombreGaraje(ferrari.getNombreGaraje());
		
		System.out.println(ferrari.getNombreGaraje());
		
		List<Garaje> riasTeams = new ArrayList<Garaje>();
		riasTeams.add(ferrari);
		
		Carrera eliminacion1 = new CarreraEliminacion("eliminacion1", 20);
//		Carrera estandar1 = new CarreraEstandar("estandar1", 20, 3);
		
		List<Carrera> riasTournamentRaces = new ArrayList<Carrera>();
//		riasTournamentRaces.add(estandar1);
		//riasTournamentRaces.add(eliminacion1);
		
		Torneo riasTorneo = new Torneo("Torneo Rias", riasTeams, riasTournamentRaces);
		
		riasTorneo.celebrarTorneo();
		System.out.println(riasTorneo.toString());
		
		return null;
		
	}
	public void testCarrera() throws JAXBException {
		Carrera carrera = crearCarrera();
	}
	
	

}
