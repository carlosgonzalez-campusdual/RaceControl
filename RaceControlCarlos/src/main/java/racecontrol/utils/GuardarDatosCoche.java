package racecontrol.utils;

import java.io.File;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

import racecontrol.entidades.Garaje;

public class GuardarDatosCoche {

	public void convertirXml(Garaje e) throws JAXBException, IOException {

		JAXBContext context = JAXBContext.newInstance(Garaje.class);
		Marshaller mar = context.createMarshaller();
		mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
		mar.marshal(e, System.out);
		mar.marshal(e, new File("resources/coche1.xml"));

	}

}
