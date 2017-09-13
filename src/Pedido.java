
public class Pedido {
	private Prato[] pratos = new Prato[3];
	private Double precoTotal;

	public Prato[] getPratos() {
		return pratos;
	}

	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

}
