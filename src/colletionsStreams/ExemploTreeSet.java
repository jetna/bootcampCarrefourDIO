package colletionsStreams;

import java.util.TreeSet;

public class ExemploTreeSet {
public static void main(String[] args) {
	TreeSet<String> treeCapitais = new TreeSet<String>();
	treeCapitais.add("Porto Alegre");
	treeCapitais.add("Florianópolis");
	treeCapitais.add("Curitiba");
	treeCapitais.add("São Paulo");
	treeCapitais.add("Rio de JAneiro");
	treeCapitais.add("Belo Horizonte");
	System.out.println(treeCapitais);
	
	System.out.println(treeCapitais.first());
	System.out.println(treeCapitais.last());
	System.out.println(treeCapitais.lower("Florianópolis"));
	System.out.println(treeCapitais.higher("Florianópolis"));
	//pollfirst = retorna e remove
	
}
}
