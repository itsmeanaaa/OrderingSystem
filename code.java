import java.io.*;

public class code
{
	
	static String [][] info = new String [50][50]; 
	public static void main (String [] args)throws IOException
	{
	
		menu m = new menu();
		m.mainMenu(info);	
	}
}