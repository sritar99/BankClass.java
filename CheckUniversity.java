import java.util.*;
class NoUniversityFoundException extends Exception 
{ 
    public NoUniversityFoundException(String s) 
    { 
         
        super(s); 
    } 
}
public class CheckUniversity{

	public static void checkStatus(String s)throws NoUniversityFoundException{
         String test=s;
         String match ="University";
         String[] sentence=test.split();
         for(String word: sentence)
            {
              if(word.equals(match))
              	System.out.println(test+" is Accrediated By NBA!" );
                 
             }

         //int intIndex = s1.indexOf("University");
         
         	//if(intIndex == - 1)
         //while(intIndex>=0){
         //if(s1.contains(test))
         	//System.out.println(s1+" is Accrediated By NBA!" );
         		//throw new NoUniversityFoundException("College is Not recognized by NBA");
         //}
               
            //else
            	//throw new NoUniversityFoundException("College is Not recognized by NBA");

             // System.out.println(s1+" is Accrediated By NBA!" );      
            
         
    
         

	}
  
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
  	System.out.println("Enter Collge Name: ");
  	String s1=sc.next();
  	try{
  		checkStatus(s1);
  	}
  	catch(Exception e){
  		System.out.println("Exception Occured:"+e);
  	}
  	
  }

	


}