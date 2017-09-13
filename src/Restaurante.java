
public class Restaurante {

	private Prato p1;
	private Prato p2;
	private Prato p3;
	
	public Restaurante(Prato p1, Prato p2, Prato p3){
		super();
		this.p1 = p1;
		this.p2 = p2;
		this.p3 = p3;
	}
	
	
	public void mostrarCardapio(){
		System.out.println("Nome do Prato: "+p1.getName());
		System.out.println("Descrição do Prato: "+p1.getDescricao());
		
		System.out.println("Nome do Prato: "+p2.getName());
		System.out.println("Descrição do Prato: "+p2.getDescricao());
		
		System.out.println("Nome do Prato: "+p3.getName());
		System.out.println("Descrição do Prato: "+p3.getDescricao());
	}

	public Prato getP1() {
		return p1;
	}

	public void setP1(Prato p1) {
		this.p1 = p1;
	}

	public Prato getP2() {
		return p2;
	}

	public void setP2(Prato p2) {
		this.p2 = p2;
	}

	public Prato getP3() {
		return p3;
	}

	public void setP3(Prato p3) {
		this.p3 = p3;
	}

}
