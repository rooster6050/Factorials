package FactorialsPackage;

public class Main 
{
	
	public static void main(String args[])
	{
		float x = 18;
		float y = 1;
		
		while(x>1)
		{
			x=x/y;
			y++;
		}
		
		if(x==1)
		{
			System.out.println(y-1);
		}
		else if(x<1)
		{
			System.out.println("NONE");
		}

	
	}
	
}
