
public class SistemaDePedidos {

	public static void main(String[] args) {
		Prato p1 = new Prato("Xis S", 1.5D, "Xis Salada");
		Prato p2 = new Prato("Xis SS", 1.5D, "Xis Super Salada");
		Prato p3 = new Prato("Xis V", 1.5D, "Xis Vento");
		Prato[] pratos = {p1,p2,p3};
		Prato[] pratosPedidos = {p1,p2};
		
		Pedido pedido = new Pedido(pratosPedidos);

		Restaurante equilibrium = new Restaurante(pratos);
		equilibrium.mostrarCardapio();
		equilibrium.fazerPedido(pedido);
		equilibrium.finalizarPedido(5D);
		equilibrium.mostrarCaixa();
	}

}
