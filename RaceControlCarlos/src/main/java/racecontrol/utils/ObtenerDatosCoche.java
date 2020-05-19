package racecontrol.utils;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


import racecontrol.entidades.Garaje;


public class ObtenerDatosCoche {

	public static Garaje convertirObjeto(String nombreGaraje) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(Garaje.class);
		Unmarshaller unmarchaller = context.createUnmarshaller();
		File xml = new File("resources/"+nombreGaraje+".xml");
		Garaje garaje = (Garaje) unmarchaller.unmarshal(xml);
		return garaje;

	}
}
