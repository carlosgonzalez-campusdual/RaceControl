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
		
		Garaje bmw = ObtenerDatosCoche.convertirObjeto("BMW");
		bmw.setNombreGaraje(bmw.getNombreGaraje());
		
		System.out.println(ferrari.getNombreGaraje());
		
		System.out.println(bmw.getNombreGaraje());
		
		List<Garaje> riasTeams = new ArrayList<Garaje>();
		riasTeams.add(ferrari);
		//riasTeams.add(bmw);
		//Carrera estandar1 = new CarreraEstandar("estandar1", 2, 3);
		
		Carrera eliminacion1 = new CarreraEliminacion("eliminacion1", 2);
		
		List<Carrera> riasTournamentRaces = new ArrayList<Carrera>();
		//riasTournamentRaces.add(estandar1);
		
		
		riasTournamentRaces.add(eliminacion1);
		
		
		Torneo riasTorneo = new Torneo("Torneo Rias", riasTeams, riasTournamentRaces);
		
		riasTorneo.celebrarTorneo();
		System.out.println(riasTorneo.toString());
		
		return null;
		
	}
	public void testCarrera() throws JAXBException {
		Carrera carrera = crearCarrera();
	}
	
	

}
