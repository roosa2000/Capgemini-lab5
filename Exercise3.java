package lab5;

public class Exercise3 {
	
	static void Salary(int amt)throws EmployeeException
	{
		if(amt<3000)
		{
			throw new EmployeeException("not Accepted"); 
		}
		else
		{
			System.out.println("Accepted");
		}
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			Salary(500);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured"+e);
		}
	}

}

class EmployeeException extends Exception
{
	EmployeeException(String s)
	{
		super(s);
	}
	
}
