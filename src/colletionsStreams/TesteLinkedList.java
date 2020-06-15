package colletionsStreams;

import java.util.LinkedList;
import java.util.Queue;


public class TesteLinkedList {
	public static void main(String[] args) {
		Queue<String> filaBanco = new LinkedList<>();
		
	filaBanco.add("Patr�cia");
	filaBanco.add("Roberto");
	filaBanco.add("Pamela");
	filaBanco.add("Anderson");
	
	
	
	String clienteAtendido = filaBanco.poll();
	//poll = retorna e remove a 'cabe�a' da fila. retorna null se a fila estiver vazia
	System.out.println(clienteAtendido);		
	System.out.println("poll"+filaBanco);

	String primeiroCliente = filaBanco.peek();
	//peek= retorna, mas n�o remove; retorna null se estiver vazia
	System.out.println(primeiroCliente);
	System.out.println("peek"+filaBanco);
	
	//element= n�o remove o elemento, ele retorna. se estiver vazio ele retorna um erro
	/*filaBanco.clear(); //esvaziar filaBanco
	String primeiroClienteouErro = filaBanco.element();
	System.out.println(primeiroClienteouErro);
	System.out.println(filaBanco);
	*/
	
	for (String cliente : filaBanco) {
		System.out.println(">>"+cliente);
	}
	}

}
