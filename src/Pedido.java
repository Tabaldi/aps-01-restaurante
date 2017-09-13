
public class Pedido {
	private Prato[] pratos = new Prato[3];
	private Double precoTotal;
	
	public Pedido(Prato[] pratos){
		this.precoTotal = somaTotal(pratos);
	}

	private Double somaTotal(Prato[] pratos) {
		double total = 0;
		for(int i=0; i < pratos.length; i++){
			total =+ pratos[i].getPreco();
		}
		return total;
	}

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
