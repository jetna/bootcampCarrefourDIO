package colletionsStreams;

import java.util.TreeSet;

public class ExemploTreeSet {
public static void main(String[] args) {
	TreeSet<String> treeCapitais = new TreeSet<String>();
	treeCapitais.add("Porto Alegre");
	treeCapitais.add("Florian�polis");
	treeCapitais.add("Curitiba");
	treeCapitais.add("S�o Paulo");
	treeCapitais.add("Rio de JAneiro");
	treeCapitais.add("Belo Horizonte");
	System.out.println(treeCapitais);
	
	System.out.println(treeCapitais.first());
	System.out.println(treeCapitais.last());
	System.out.println(treeCapitais.lower("Florian�polis"));
	System.out.println(treeCapitais.higher("Florian�polis"));
	//pollfirst = retorna e remove
	
}
}
