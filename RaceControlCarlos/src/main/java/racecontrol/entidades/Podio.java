package racecontrol.entidades;

import java.util.ArrayList;
import java.util.List;

public class Podio {
	 private Coche primero;
	    private Coche segundo;
	    private Coche tercero;

	    public Podio(Coche primero, Coche segundo, Coche tercero) {
	        this.primero = primero;
	        this.segundo = segundo;
	        this.tercero = tercero;
	    }

	    public List<Coche> getCoches() {
	        List<Coche> coches = new ArrayList<Coche>();
	        coches.add(primero);
	        coches.add(segundo);
	        coches.add(tercero);
	        return coches;
	    }

	    public String toString() {
	        return "1:- " + this.primero.toString() + "\n"
	                + "2.- " + this.segundo.toString() + "\n"
	                + "3.- " + this.tercero.toString();
	    }

	
	
}
