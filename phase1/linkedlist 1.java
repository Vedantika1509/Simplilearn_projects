package core.programs.assissted.project;

import java.util.*;

public class LinkedList {

	
		      public static void main(String args[]){ 
		    	  
		          LinkedList<String>al= new LinkedList<String>();  
		    	  al.add("Rita");  
		    	  al.add("Vinu");  
		    	  al.add("Rajan");  
		    	  al.add("ram");  
		    	  Iterator<String> itr=al.iterator();  
		    	  while(itr.hasNext()){  
		    	  System.out.println(itr.next());  
		    	  }  
		     }
}



	


