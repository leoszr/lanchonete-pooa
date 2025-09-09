package pooarevisao.db;
import java.util.ArrayDeque;

public class PedidosSingleton {

	private static PedidosSingleton instance;
	private PedidosSingleton() {};
	private ArrayDeque<String> pedidos = new ArrayDeque<>();

	public static PedidosSingleton getInstance() {
		if (instance==null) {
		instance = new PedidosSingleton();	
		}
		return instance;
	}
	public void addPedido(String pedido) {
		this.pedidos.add(pedido);
	}
	public void removePedido() {
		if(this.pedidos.isEmpty()) {
			System.out.println("sem pedidos a remover");
		}
		this.pedidos.remove();
	}
	public void showPedidos() {
		System.out.println(this.pedidos.toString());
	}
}
