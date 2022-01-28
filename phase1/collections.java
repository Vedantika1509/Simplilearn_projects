package core.programs.assissted.project;

import java.util.*;

public class Collections {

	public static void main(String[] args) {
		
	
		ArrayList<String> list=new ArrayList<String>();//Creating arraylist  
		list.add("sham");//Adding object in arraylist  
		list.add("Sam");  
		list.add("mira");  
		list.add("Sam");  
		//Traversing list through Iterator  
		Iterator itr=list.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
	}
}

		

	


