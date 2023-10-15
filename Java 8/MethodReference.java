package java8;


		@FunctionalInterface 
		interface Display {  
		    void display();  
		}  
 public class MethodReference {  
    public void myMethod() { 
		    	
	System.out.println("method reference in java 8");  
		   }  
		    
  public static void main(String[] args) {  
	MethodReference obj = new MethodReference();   
			
	 Display ref = obj::myMethod;  
			
	  ref.display();  
		    
		
	}

}
