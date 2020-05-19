package racecontrol.entidades;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coche")
public class Coche {

	private int contador;
	private String marca;
	private String modelo;
	private final int velocidadMaxima = 300;
	private Garaje garaje;
	private int ultimaDistancia;

	public Coche() {

	}

	public Coche(String marca, String modelo) {
		this.marca = marca;
		this.modelo = modelo;
		this.contador = 0;
	}

	public Coche(int contador, String marca, String modelo) {
		this(marca, modelo);
		this.contador = contador;
	}

	public void setGaraje(Garaje garaje) {
		this.garaje = garaje;
	}

	// ------SETTERS-----
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	// --------GETTERS-----
	@XmlElement(name = "marca")
	public String getMarca() {
		return marca;
	}

	@XmlElement(name = "modelo")
	public String getModelo() {
		return modelo;
	}

	@XmlElement(name = "velocidad")
	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void distancias() {
		ultimaDistancia = generarDistancia(velocidadMaxima);
		System.out.println(this.toString() + ", " + ultimaDistancia);
		contador += ultimaDistancia;
	}

	 private int generarDistancia(int velocidadMaxima) {
	        Double distanciaAleatoria = new Double(Math.random() * velocidadMaxima);
	        int nuevaDistancia = distanciaAleatoria.intValue();
	        return nuevaDistancia;
	    }

	    public int getContador() {
	        return this.contador;
	    }
	    
	    public void reiniciarContador() {
	        this.contador = 0;
	    }

	public String toString() {
		return this.marca + ", " + this.modelo + ", " + this.contador;
	}

//	public double pasarMedia() {
//		List<Double> velocidades = new ArrayList<Double>();
//		double velocidadAleatoria;
//		double velocidadInicial = 300;
//		double suma = 0.0;
//		double media = 0.0;
//
//		for (int i = 0; i < 180; i++) {
//			velocidadAleatoria = generarRandomVelocity();
//			double velocidadTotal = velocidadInicial + velocidadAleatoria;
//			velocidades.add(velocidadTotal);
//
//		}
//		for (int i = 0; i < velocidades.size(); i++) {
//			suma += Double.parseDouble(velocidades.get(i).toString());
//		}
//		// System.out.println("suma " + suma);
//
//		media = suma / velocidades.size();
//		// System.out.println("media " + media);
//
//		return media;
//	}
////
//	public static int generarRandomVelocity() {
//
//		int aceleracionFrenanda = (int) (Math.random() * 60 * (Math.random() > 0.5 ? 1 : -1));
//
//		return aceleracionFrenanda;
//	}

}
