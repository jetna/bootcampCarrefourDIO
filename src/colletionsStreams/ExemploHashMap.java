package colletionsStreams;

import java.util.HashMap;
import java.util.Map;

public class ExemploHashMap {
	public static void main(String[] args) {
		Map<String, Integer> campeoesMundialFifa = new HashMap<String, Integer>();
		//puta recebe dois argumentos
		//campeoesMundialFifa.put(key, value)
		campeoesMundialFifa.put("Brasil",5);
		campeoesMundialFifa.put("Alemanha",4);
		campeoesMundialFifa.put("It�lia",4);
		campeoesMundialFifa.put("Uruguai",2);
		campeoesMundialFifa.put("Argentina",2);
		campeoesMundialFifa.put("Fran�a",2);
		campeoesMundialFifa.put("Inglaterra",1);
		campeoesMundialFifa.put("Espanha",1);
		
		System.out.println(campeoesMundialFifa+"\n----------------------------------");
		
		//atualizar o valor para a chave Brasil
		campeoesMundialFifa.put("Brasil",6);
		System.out.println("Atualizando para 6: "+campeoesMundialFifa);

		//Retorna a Argentina
		System.out.println("Retorna Argentina com 'get' : "+campeoesMundialFifa.get("Argentina"));
		
		//Retorna se existe ou n�o um campe�o Franca
		System.out.println("Se tem fran�a ' containsKey: "+campeoesMundialFifa.containsKey("Fran�a"));
	
		//remove campe�o fran�a
		campeoesMundialFifa.remove("Fran�a");
		//Retorna se existe ou n�o um campe�o Franca
		System.out.println("Se tem fran�a ' containsKey: "+campeoesMundialFifa.containsKey("Fran�a"));
	
		//retorna se existe ou n�o alguma sele��o hexa campe�
		System.out.println("Existe ou n�o alguma hexa: "+campeoesMundialFifa.containsValue(6));
	
		System.out.println("Tamanho do mapa: "+campeoesMundialFifa.size());
		
		//navega nos registros do mapa
		for(Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()) {
			System.out.println(entry.getKey()+" --- "+entry.getKey());
		}
		
		//navega nos registros do mapa
		for(String key: campeoesMundialFifa.keySet()) {
			System.out.println(key+" -- "+campeoesMundialFifa.get(key));
		}
		
		//verifica se o mapa cont�m US
		System.out.println("US: "+campeoesMundialFifa.containsKey("US"));
		
		
	}

}
