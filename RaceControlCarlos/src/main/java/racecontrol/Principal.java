package racecontrol;


import java.io.IOException;

import javax.xml.bind.JAXBException;

import racecontrol.entidades.Control;

public class Principal {

	public static void main(String[] args) throws JAXBException, IOException {
		
		
//		ObtenerDatosCoche obtenerDatos = new ObtenerDatosCoche();
//		
//		Garaje g = obtenerDatos.convertirObjeto("ferrari");
//		
//	System.out.println(g.getNombreGaraje());	
//		
//		List<Coche> listaCoches = g.getCoches();
//		
//		for (int i = 0; i < listaCoches.size(); i++) {
//			System.out.println(listaCoches.get(i).getModelo());
//		}
		
//		
		
		
		
		
		
		
//		Menu m = new Menu();
//		
//		m.menu();
		
		
		Control c = new Control();
		
		c.testCarrera();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		Garaje g = new Garaje();
//		Coche c1 = new Coche("marca", "modelo");
//		Coche c2 = new Coche("coche2", "modelo2");
//		CarreraEliminacion ce = new CarreraEliminacion();
//
//		g.setCoche(c1);
//		g.setCoche(c2);
//
//		//g.setCoches(g.agregarCoche());
//
//		List<Coche> listaCochesGarage = new ArrayList<Coche>();
//		listaCochesGarage.add(c1);
//		listaCochesGarage.add(c2);
//
//		//ce.cochesParticipantesEliminacion(listaCochesGarage);
//
//		List<Coche> lista = new ArrayList<Coche>();
//
//		lista = ce.cochesParticipantesEliminacion(listaCochesGarage);
//
//		for (int i = 0; i < lista.size(); i++) {
//			lista.get(i).setVelocidadMedia(ce.pasarMedia());
//
//			System.out.println(lista.get(i).getMarca());
//			System.out.println(lista.get(i).getVelocidadMedia());
//
//		}

		
//		 Coche c = new Coche();
//		 
//		 
//		//System.out.println(c.pasarMedia());
//		 
//		 double primero = 0;
//		 double segundo = 0;
//		 double tercero = 0;
//		 List<Double> listaOrdenada = new ArrayList<Double>();
//		 
//		 CarreraEliminacion ce = new CarreraEliminacion();
//		 for (int i = 0; i < ce.cochesParticipantesEliminacion().size(); i++) {
//			 
//			// System.out.println(ce.cochesParticipantesEliminacion().get(i).pasarMedia());
//			 
//			 
//			 
//			listaOrdenada.add(ce.cochesParticipantesEliminacion().get(i).pasarMedia());
//			
//			
//			Comparator<Double> comparador = Collections.reverseOrder();
//			Collections.sort(listaOrdenada, comparador);
//			
//			//System.out.println(listaOrdenada.get(i));
//			
//			
//			
//		
//			
//			
//		}
//		 primero = listaOrdenada.get(0);
//		 segundo = listaOrdenada.get(1);
//		 tercero = listaOrdenada.get(2);
//		 System.out.println("primero: " + primero);
//		 System.out.println("segundo: "+ segundo);
//		 System.out.println("tercero: "+ tercero);
//		

	}
}
