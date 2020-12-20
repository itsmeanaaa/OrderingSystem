import java.io.*;

public class viewInfo
{
	public void view(String [][] info)throws IOException
	{
		
		System.out.print("\n");
        	System.out.println("\t\t ::  :: :::::: ::::   ::  ::  ::  ");
		System.out.println("\t\t ::  ::   ::   ::     ::  ::  ::  ");
		System.out.println("\t\t ::  ::   ::   ::::   ::  ::  ::  ");
		System.out.println("\t\t ::  ::   ::   ::     ::  ::  ::   ");
		System.out.println("\t\t  ::::  :::::: ::::     ::  ::\n\n");
		for(int all = 0 ; all < 50 ; all ++){
			for(int les = 0 ; les < 1 ; les ++){
				if(info [all] [0] != null){
					System.out.println("Information List");
					System.out.println("Record No:\t" + info [all] [7]);
					System.out.println("Last Name:\t" + info [all] [0]);
					System.out.println("Middle Name:\t" + info [all] [1]);
					System.out.println("First Name:\t" + info [all] [2]);
					System.out.println("Age:\t" + info [all] [3]);
					System.out.println("Gender:\t" + info [all] [4]);
					System.out.println("Birthday:\t" + info [all] [5]);
					System.out.println("Address:\t" + info [all] [6]);
					System.out.println("\n\n");
				}
			}
		}
	}
}






































