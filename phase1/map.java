package core.programs.assissted.project;

import java.util.*;


public class Map {

	public static void main(String[] args) {
	    HashMap<Integer,String> map=new HashMap<Integer,String>();          
	      map.put(101,"mina");    
	      map.put(102,"mohan");    
	      map.put(103,"sima");  
	      map.put(104, "radha");  
	    System.out.println("Initial list of elements: "+map);  
	    //key-based removal  
	    map.remove(100);  
	    System.out.println("Updated list of elements: "+map);  
	    //value-based removal  
	    map.remove(101);  
	    System.out.println("Updated list of elements: "+map);  
	    //key-value pair based removal  
	    map.remove(102, "Rahul");  
	    System.out.println("Updated list of elements: "+map);  
	   }      
	}  


	
