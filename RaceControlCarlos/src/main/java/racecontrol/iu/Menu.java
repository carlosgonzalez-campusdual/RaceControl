package racecontrol.iu;

import java.util.Scanner;

import javax.xml.bind.JAXBException;

import racecontrol.entidades.Control;

public class Menu {

	public void menu() throws JAXBException {
		Scanner sc = new Scanner(System.in);
		int opcion = 0;
		System.out.println("1.Carrera elimininacion.");
		System.out.println("seleccione una opcion: ");
		opcion = sc.nextInt();

		do {

			switch (opcion) {
			case 1:
				
			Control c = new Control();
			
			c.crearCarrera();
				
				
				
				
				

//				Garaje g = new Garaje();
//				Coche c1 = new Coche("marca", "modelo");
//				Coche c2 = new Coche("coche2", "modelo2");
//				Coche c3 = new Coche("coche3", "modelo3");
				

//				g.setCoche(c1);
//				g.setCoche(c2);
//				g.setCoche(c3);
				//g.setCoches(g.agregarCoche());

			//	List<Coche> listaCochesGarage = new ArrayList<Coche>();
//				listaCochesGarage.add(c1);
//				listaCochesGarage.add(c2);
//				listaCochesGarage.add(c3);

				//List<Coche> lista = new ArrayList<Coche>();
//				CarreraEliminacion ce = new CarreraEliminacion();
//				ObtenerDatosCoche obtenerDatos = new ObtenerDatosCoche();
//				
//				Garaje g = obtenerDatos.convertirObjeto("ferrari");
//				
//			System.out.println(g.getNombreGaraje());	
//				
//				List<Coche> listaCoches = g.getCoches();
//				
//				for (int i = 0; i < listaCoches.size(); i++) {
//					listaCoches.get(i).setVelocidadMedia(ce.pasarMedia());
//				}
//
//				Collections.sort(listaCoches, (y, x) -> String.valueOf(x.getVelocidadMedia())
//						.compareToIgnoreCase(String.valueOf(y.getVelocidadMedia())));
//
//				System.out.println("PRIMER PUESTO: " + " Marca: " + listaCoches.get(0).getMarca() + "Modelo: "
//						+ listaCoches.get(0).getModelo() +" Velocidad Media: " + listaCoches.get(0).getVelocidadMedia());
//				System.out.println("SEGUNDO PUESTO: " + " Marca: " + listaCoches.get(1).getMarca() + "Modelo: "
//						+ listaCoches.get(1).getModelo() +" Velocidad Media: " + listaCoches.get(1).getVelocidadMedia());
//				System.out.println("TERCER PUESTO: " + " Marca: " + listaCoches.get(2).getMarca() + "Modelo: "
//						+ listaCoches.get(2).getModelo() +" Velocidad Media: " + listaCoches.get(2).getVelocidadMedia());
//
//				
				
//				try {
//				listaDeEscuderias = ObtenerDatosCoche.convertirObjeto().getEscuderia();
//				for (int i = 0; i < listaDeEscuderias.size(); i++) {
//					System.out.println("===========================================================================");
//					System.out
//							.println("NOMBRE DE LA ESCUDERIA: " + listaDeEscuderias.get(i).getNombreEscuderia() + "\n");
//
//					List<Coche> listaDeCoches = new ArrayList<Coche>();
//
//				listaDeCoches = listaDeEscuderias.get(i).getCochesEscuderia();
//					for (int j = 0; j < listaDeCoches.size(); j++) {
//						System.out.println(" - " + "Marca: " + listaDeCoches.get(j).getMarca());
//						System.out.println(" - " + "Modelo:  " + listaDeCoches.get(j).getModelo());
//						System.out
//								.println(" - " + "Velocidad: " + listaDeCoches.get(j).getVelocidad() + " Km/h" + "\n");
//					}
//				}
//			} catch (JAXBException e) {
//				e.printStackTrace();
//			}
				break;

			default:
				break;
			}
		} while (opcion < 1);

	}

//	int opcion;
//	int escuderia;
//
//	public void menu() {
//
//		int opcion;
//		
//		
//		System.out.println("Introduce la opcion: " );
//		Scanner sc = new Scanner(System.in);
//		
//		opcion = sc.nextInt();
//		
//
//		switch (opcion) {
//		case 1:
//			System.out.println("Importrar coches.");
////			List<Escuderia> listaDeEscuderias = new ArrayList<Escuderia>();
//
//			try {
////				listaDeEscuderias = ObtenerDatosCoche.convertirObjeto().getEscuderia();
////				for (int i = 0; i < listaDeEscuderias.size(); i++) {
////					System.out.println("===========================================================================");
////					System.out
////							.println("NOMBRE DE LA ESCUDERIA: " + listaDeEscuderias.get(i).getNombreEscuderia() + "\n");
//
//					List<Coche> listaDeCoches = new ArrayList<Coche>();
//
////					listaDeCoches = listaDeEscuderias.get(i).getCochesEscuderia();
//					for (int j = 0; j < listaDeCoches.size(); j++) {
//						System.out.println(" - " + "Marca: " + listaDeCoches.get(j).getMarca());
//						System.out.println(" - " + "Modelo:  " + listaDeCoches.get(j).getModelo());
////						System.out
////								.println(" - " + "Velocidad: " + listaDeCoches.get(j).getVelocidad() + " Km/h" + "\n");
//					}
//				}
//			} catch (JAXBException e) {
//				e.printStackTrace();
//			}
//
//			break;
//		case 2:
////			SE CREA UNA CARRERA PARA UNO O TODOS LOS GARAJES A LA VEZ
//			System.out.println("Crear carrera.");
//			break;
//
//		case 3:
//			System.out.println("Crear torneo.");
//			break;
//		case 4:
//			System.out.println("Crear carrera para un garaje.");
//			break;
//		case 5:
////			SE SELECCIONA UN COCHE ALEATORIO PARA CADA GARAJE
//			System.out.println("Seleccionar todos los garajes para carrera.");
//			break;
//		case 6:
////			SE EXPORTAN LOS DATOS DE UN TORNEO EN UN DOCUMENTO DE TEXTO
//			System.out.println("Exportar resultados del torneo.");
//			break;
//		case 7:
////			SE SIMULA LA CARRERA QUE LOS COCHES ACELEREN O FRENEN DE FORMA ALEATORIA
//			System.out.println("Simular la carrera.");
//			break;
//		default:
//		}
//	}
//
}
