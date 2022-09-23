package Practice;

class LanguageNotFoundException extends Exception
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public LanguageNotFoundException(String s) 
	{
		super(s);
	}
}
public class _6_Custom_Exception 
{
	static void Language(String language) throws LanguageNotFoundException 
	{
		if (language != "C++" && language != "Java" && language != "Python") 
		{
			throw new LanguageNotFoundException("This Language is not applicable for this post ...");

		}
		else
		{
			System.out.println("You are selected for the interview ... We Schedule a date and notify once it is final ...");

		}
	}
	public static void main(String[] args) 
	{

		try 
		{
			Language("Java");
		} 
		catch (LanguageNotFoundException e)
		{
			System.out.println("Caught the Exception");
			System.out.println(e);
		}
	}
}
	