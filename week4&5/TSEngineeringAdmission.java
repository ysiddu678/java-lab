class NotEligibleForEngineering extends RuntimeException 
	{
		NotEligibleForEngineering(String s)
		{
        super(s);
		}
}
class NotEligibleForVJIT extends RuntimeException 
	{
    NotEligibleForVJIT(String s) 
	{
        super(s);
    }
}
public class TSEngineeringAdmission 
{
    public static void main(String args[]) 
		{
        try 
			{
				 int TSEAMCETScore = Integer.parseInt(args[0]);

				  if (TSEAMCETScore < 50) 
					  {
						throw new NotEligibleForEngineering("Sorry You Are Not Eligible To Apply Engineering Admission");
					  } 
				else if (TSEAMCETScore < 70) 
					 {
						throw new NotEligibleForVJIT("Sorry You Are Not Eligible To Apply VJIT-Hyderabad");
					  }
				else 
					{
					System.out.println("Welcome to VJIT-Thanks For Your Registration!");
					 }
			} 
			catch (NotEligibleForEngineering | NotEligibleForVJIT e) 
				{
				System.out.println("Exception Caught: " + e.getMessage());  
				}
        System.out.println("Rest of the Code");  
    }
}