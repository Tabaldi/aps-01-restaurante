
public class Ingrediente {
	private String tipoIngrediente;
	private boolean obrigatorio;

	public String getTipoIngrediente() {
		return tipoIngrediente;
	}

	public void setTipoIngrediente(String tipoIngrediente) {
		if(tipoIngrediente.equalsIgnoreCase("carne") || 
		   tipoIngrediente.equalsIgnoreCase("legume") || 
		   tipoIngrediente.equalsIgnoreCase("verdura") || 
		   tipoIngrediente.equalsIgnoreCase("tempero") ||
		   tipoIngrediente.equalsIgnoreCase("acompanhamento")){
			this.tipoIngrediente = tipoIngrediente;
		}
	}

	public boolean isObrigatorio() {
		return obrigatorio;
	}

	public void setObrigatorio(boolean obrigatorio) {
		this.obrigatorio = obrigatorio;
	}

}
