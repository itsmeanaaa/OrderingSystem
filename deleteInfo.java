import java.io.*;

public class deleteInfo
{
	static BufferedReader n = new BufferedReader (new InputStreamReader (System.in));
	public void  delete(String [][] info)throws IOException
	{
		int pass = 0 ,let = 0;
		System.out.println("\n\n");
		System.out.println("\t\t  :::::   ::::   ::   :::: :::::: :::: ");
		System.out.println("\t\t  ::  ::  ::     ::   ::     ::   ::   ");
		System.out.println("\t\t  ::  ::  ::::   ::   ::::   ::   :::: ");
		System.out.println("\t\t  ::  ::  ::     ::   ::     ::   ::   ");
		System.out.println("\t\t  :::::   ::::   :::: ::::   ::   ::::\n\n");
		while(pass == 0){
			try{
				for( ; let < 50 ; let++){
					if(info [let][0] != null){
						System.out.println("Delete no " + (let + 1));
						System.out.println("Information List");	
						System.out.println("\nRecord No:\t" + info [let] [7]);
						System.out.println("Last Name:\t" + info [let] [0]);
						System.out.println();
					}
				}
				System.out.print("\n\nEnter delete no: ");
				int del = Integer.parseInt(n.readLine());
				
					info[del - 1] [0] = null;
					info[del - 1] [1] = null;
					info[del - 1] [2] = null;
					info[del - 1] [2] = null;
					info[del - 1] [3] = null;
					info[del - 1] [5] = null;
					info[del - 1] [6] = null;
					info[del - 1] [7] = null;
					System.out.println("Delete Succesfull");
					System.out.println();
					pass = 666 ;
				
			
			}
			catch(NumberFormatException e){
				System.out.println("Invalid Input");
			}
			
		}
		
	}

}