import java.io.*;

public class addInfo
{
	static BufferedReader n = new BufferedReader (new InputStreamReader (System.in));
	public String [][] add(String [][] info)throws IOException
	{
		System.out.print("\n");
        	System.out.println("\t\t  ::::::  ::::     ::::      ");
		System.out.println("\t\t  ::  ::  ::  ::   ::  ::    ");
	   	System.out.println("\t\t  ::::::  ::  ::   ::  ::    ");
		System.out.println("\t\t  ::  ::  ::  ::   ::  ::    ");
		System.out.println("\t\t  ::  ::  ::::     ::::\n\n");
		int loop = 0 , ch = 0;
		for(int value = 0 ; value < 50 ; value ++){
			if(info [value] [0] == null){
				while(loop == 0){
					System.out.println("\n\n");
					System.out.println("Information List\n\n");
					System.out.print("Last Name:\t");
					info [value] [0] = n.readLine();
					System.out.print("Middle Name:\t");
					info [value] [1] = n.readLine();
					System.out.print("First Name:\t");
					info [value] [2] = n.readLine();
					System.out.print("Age:\t");
					info [value] [3] = n.readLine();
					System.out.print("Gender:\t");
					info [value] [4] = n.readLine();
					System.out.print("Birthday:\t");
					info [value] [5] = n.readLine();
					System.out.print("Address:\t");
					info [value] [6] = n.readLine();
					System.out.print("Record No:\t");
					info [value] [7] = n.readLine();
					loop ++ ;
					
				}
			}
		}
		return info;	
	}
} 



































