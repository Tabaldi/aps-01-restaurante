
public class Restaurante {

	private Pedido pedido;

	public Restaurante(Pedido pedido){
		super();
		this.pedido = pedido;
	}
	
	public void mostrarCardapio(){
		this.imprimePratos(this.pedido);
	}
	
	private void imprimePratos(Pedido pedido){
		for (int i = 0; i < pedido.getPratos().length; i++) {
			 System.out.println("Nome do Prato: "+pedido.getPratos()[i].getName());
			 System.out.println("Descrição do Prato: "+pedido.getPratos()[i].getDescricao());
		}
	}
}
