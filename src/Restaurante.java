
public class Restaurante {

	private Prato[] pratos = new Prato[3];

	
	public Restaurante(Prato[] pratos){
		super();
		this.pratos = pratos;
	}
	
	public void mostrarCardapio(){
		this.imprimePratos(this.pratos);
	}
	
	private void imprimePratos(Prato[] pratos){
		for (int i = 0; i < pratos.length; i++) {
			 System.out.println("Nome do Prato: "+pratos[i].getName());
			 System.out.println("Descrição do Prato: "+pratos[i].getDescricao());
			}
	}
}
