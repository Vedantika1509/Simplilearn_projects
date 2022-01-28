package core.programs.assissted.project;

public class overloadmethod {
	
		public void area(int b,int h)
		    {
		         System.out.println("Area of Triangle : "+(0.5*b*h));
		    }
		    public void area(int r) 
		    {
		         System.out.println("Area of Circle : "+(3.14*r*r));
		    }

		    public static void main(String[] args) {
		    	overloadmethod ob=new overloadmethod();
		        ob.area(13,15);
		        ob.area(7);  

		    }
		
		    
		    class Std{
	        int id;
	        String name;

	        Std(int i,String n)
	          {
	         id=i;
	         name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
		    }

 class ConstrDemo{
	public static void main(String[] args) {

		Std std1 = new Std(4,"vedu");
		Std std2 =new Std(34,"ram");
		std1.display();
		std2.display();
			}
	}
}



