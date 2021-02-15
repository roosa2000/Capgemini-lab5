package lab5;

public class Exercise1 {
	
	static void validateAge(int age)throws InvalidAge
	{  
	     if(age<15)
	     {
	    	 throw new InvalidAge("not valid");  
	     }
	     else
	     {
	    	  System.out.println("valid Age");
	     }
	}  

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{  
		      validateAge(5);  
		}
		catch(Exception e)
		{
			System.out.println("Exception occured: "+e);
		}  
	}

}


class InvalidAge extends Exception
{  
	 InvalidAge(String str)
	 {  
		 super(str);  
	 }  
}  