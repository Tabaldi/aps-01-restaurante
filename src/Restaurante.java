
public class Restaurante {

	private Prato[] pratos = new Prato[100];
	private Pedido pedido;

	public Restaurante(Prato[] pratos) {
		super();
		this.pratos = pratos;
	}

	public void fazerPedido(Pedido pedido){
		this.pedido = pedido;
		imprimirPedido(pedido);
	}
	
	private void imprimirPedido(Pedido pedido) {
		Prato[] pratosPedidoCliente = pedido.getPratos();
		Double totalPedido = 0D;
		System.out.println("\n");
		for (int i = 0; i < pratosPedidoCliente.length; i++) {
			 System.out.println("Nome do Prato: "+pratos[i].getName());
			 System.out.println("Preco: "+pratos[i].getPreco());
			 totalPedido += pratos[i].getPreco();
		}
		System.out.println("\nTotal Pedido: "+totalPedido);
		
	}

	public void mostrarCardapio(){
		 System.out.println("CARDAPIO");
		for (int i = 0; i < this.pratos.length; i++) {
			 System.out.println("Nome do Prato: "+pratos[i].getName());
			 System.out.println("Descrição do Prato: "+pratos[i].getDescricao());
		}
	}
	
	public void mostrarCaixa(){
		System.out.println("\nCaixa: "+this.pedido.getPrecoTotal());
	}
	
	public void finalizarPedido(Double pagamento){
		System.out.println("\nPagamento Recebido "+pagamento);
		if(pagamento < this.pedido.getPrecoTotal()){
			System.out.println("\nVai lavar prato mew");
		}else {
		Double troco = pagamento - this.pedido.getPrecoTotal();
		System.out.println("\nSeu troco é "+troco);
		}
	}
	
	public Prato[] getPratos() {
		return pratos;
	}

	public void setPratos(Prato[] pratos) {
		this.pratos = pratos;
	}
}
