package models;

public class Cubo implements Figura3DInterface {

	private Double aresta;
	
	public Cubo(Double aresta) {
		setAresta(aresta);
	}

	public Double getAresta() {
		return aresta;
	}

	public void setAresta(Double aresta) {
		this.aresta = aresta;
	}

	@Override
	public Double calcularVolume() {
		return  Math.pow(aresta,3);
	}

}
