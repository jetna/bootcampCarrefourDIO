package colletionsStreams;

import java.util.LinkedHashSet;

public class ExemploLinkedHashSet {

	public static void main(String[] args) {
		LinkedHashSet<Integer> seqNum = new LinkedHashSet<Integer>();
		seqNum.add(6);
		seqNum.add(2);
		seqNum.add(4);
		seqNum.add(0);
		seqNum.add(8);
		System.out.println(seqNum);
		
		seqNum.remove(4);
		System.out.println(seqNum);
	}
}
