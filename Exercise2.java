package lab5;

public class Exercise2 {
	static void Validate(String fname) throws InvalidName
	{
		if(fname==null)
		{
			throw new InvalidName("Invalid First Name");
		}
		else
		{
			System.out.println("Valid First Name");
		}
	}
	
	static void ValLname(String lname) throws InvalidLast
	{
		if(lname==null)
		{
			throw new InvalidLast("Invalid Last Name");
		}
		else
		{
			System.out.println("Valid Last Name");
		}
	}
	

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		try
		{
			Validate("Roosa");
			ValLname(null);
		}
		catch(Exception e)
		{
			System.out.println("Exception occured "+e);
		}

	}

}


class InvalidName extends Exception
{
	InvalidName(String fname)
	{
		super(fname);
		
	}
}

class InvalidLast extends Exception
{
	InvalidLast(String lname)
	{
		super(lname);
	}
}