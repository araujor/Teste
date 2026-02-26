package models;

public class Esfera implements Figura3DInterface {

	private Double raio;
	
	public Esfera(Double raio) {
		setRaio(raio);
	}

	public Double getRaio() {
		return raio;
	}

	public void setRaio(Double raio) {
		this.raio = raio;
	}

	@Override
	public Double calcularVolume() {
		return (4/3) * Math.PI * Math.pow(raio,3);
	}

}
