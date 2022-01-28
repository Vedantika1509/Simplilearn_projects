package core.programs.assissted.project;

import java.util.*;


public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet<String> setOfNames = new HashSet<>();
		
		setOfNames.add("nisha");
		setOfNames.add("fiza");
		setOfNames.add("hira");//Not added to the set
		setOfNames.add("sita");
		
		setOfNames.forEach(System.out::println);
	}
}




