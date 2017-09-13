
public class Prato {
	
	//um nome, um preço, e uma descrição.
	
	private String name;
	private Double preco;
	private String descricao;
	
	public Prato(String name, Double preco){
		super(); 
		this.name = name;
		this.preco = preco;
	}
	
	public Prato(String name, Double preco, String descricao){
		super(); 
		this.name = name;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return descricao;
	}

	@Override
	public String toString() {
		return "Prato [name=" + name + ", preco=" + preco + ", descricao=" + descricao + "]";
	}
	
	
}
