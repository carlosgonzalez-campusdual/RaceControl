package racecontrol.entidades;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "coche")
public class Coche {
	

	private String marca;
	private String modelo;
	private final int velocidadMaxima = 300;
	private Garaje garaje;
	private double velocidadMedia;

	public Coche() {
		
	}

	public Coche(String marca, String modelo, double velocidadMedia) {
		this.marca = marca;
		this.modelo = modelo;
		this.velocidadMedia = velocidadMedia;
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

	// METODOS

	// TODO HACER QUE LOS COCHES ACELEREN Y FRENEN ALEATORIAMENTE

	public double getVelocidadMedia() {
	        velocidadMedia = generateVelocidadAleatorio(velocidadMaxima);
	        System.out.println(this.toString() + ", " + velocidadMedia);
	        return this.velocidadMedia;
		
	}

//	public void setVelocidadMedia(double velocidadMedia) {
//		this.velocidadMedia = velocidadMedia;
//	}
	
	private int generateVelocidadAleatorio(int maxValue) {
        Double velocidadAleatoria = new Double(Math.random() * 60 * (Math.random() > 0.5 ? 1 : -1));
        int nuevaVelocidad = velocidadAleatoria.intValue() + maxValue;
        return nuevaVelocidad;
    }
	
	
	
	public String toString() {
        return this.marca + ", " + this.modelo + ", " + this.velocidadMedia;
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
