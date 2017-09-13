
public class SistemaDePedidos {

	public static void main(String[] args) {
		Prato p1 = new Prato("Xis S", 1.5D, "Xis Salada");
		Prato p2 = new Prato("Xis SS", 1.5D, "Xis Super Salada");
		Prato p3 = new Prato("Xis V", 1.5D, "Xis Vento");
		Prato[] pratos = {p1,p2,p3};
		Pedido pedido = new Pedido(pratos);

		Restaurante equilibrium = new Restaurante(pedido);
		equilibrium.mostrarCardapio();
	}

}
