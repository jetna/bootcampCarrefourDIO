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
		campeoesMundialFifa.put("Itália",4);
		campeoesMundialFifa.put("Uruguai",2);
		campeoesMundialFifa.put("Argentina",2);
		campeoesMundialFifa.put("França",2);
		campeoesMundialFifa.put("Inglaterra",1);
		campeoesMundialFifa.put("Espanha",1);
		
		System.out.println(campeoesMundialFifa+"\n----------------------------------");
		
		//atualizar o valor para a chave Brasil
		campeoesMundialFifa.put("Brasil",6);
		System.out.println("Atualizando para 6: "+campeoesMundialFifa);

		//Retorna a Argentina
		System.out.println("Retorna Argentina com 'get' : "+campeoesMundialFifa.get("Argentina"));
		
		//Retorna se existe ou não um campeão Franca
		System.out.println("Se tem frança ' containsKey: "+campeoesMundialFifa.containsKey("França"));
	
		//remove campeão frança
		campeoesMundialFifa.remove("França");
		//Retorna se existe ou não um campeão Franca
		System.out.println("Se tem frança ' containsKey: "+campeoesMundialFifa.containsKey("França"));
	
		//retorna se existe ou não alguma seleção hexa campeã
		System.out.println("Existe ou não alguma hexa: "+campeoesMundialFifa.containsValue(6));
	
		System.out.println("Tamanho do mapa: "+campeoesMundialFifa.size());
		
		//navega nos registros do mapa
		for(Map.Entry<String, Integer> entry: campeoesMundialFifa.entrySet()) {
			System.out.println(entry.getKey()+" --- "+entry.getKey());
		}
		
		//navega nos registros do mapa
		for(String key: campeoesMundialFifa.keySet()) {
			System.out.println(key+" -- "+campeoesMundialFifa.get(key));
		}
		
		//verifica se o mapa contém US
		System.out.println("US: "+campeoesMundialFifa.containsKey("US"));
		
		
	}

}
