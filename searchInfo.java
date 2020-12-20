import java.io.*;

public class searchInfo
{
	static BufferedReader n = new BufferedReader (new InputStreamReader (System.in));
	public 	String [][] search(String [][] info)throws IOException
	{
		int x = 0 , ch = 0 , z = 0 , pass = 0 , pass1 = 0 , y = 0 ;
		System.out.println("\n");
		System.out.println("\t\t  :::::: :::::: :::::  :::::   ::::: ::  ::");
		System.out.println("\t\t  ::     ::    ::   :: ::  :: ::     ::  ::");
		System.out.println("\t\t   ::    ::::  ::::::: :::::  ::     ::::::");
		System.out.println("\t\t     ::  ::    ::   :: ::  :: ::     ::  ::");
		System.out.println("\t\t  :::::  ::::: ::   :: ::  ::  ::::: ::  ::\n\n"); 
		while(x == 0){
			try{
				System.out.println("\n");
				System.out.println("(1) By Last Name");
				System.out.println("(2) By Record No");
				System.out.println("(3) Back");
				System.out.print("Choose : ");
				ch = Integer.parseInt(n.readLine());
				if(ch == 3){
					x ++ ;
				}
				else if(ch == 1){
					
						System.out.println("\nEnter Last name");
						String name = n.readLine();
						for(int las = 0 ; las < 40 ; las ++){
							if(info [las][0] != null){
								if(info[las][0].equals(name)){
									System.out.println("\nLast Name:\t" + info [las] [0]);
									System.out.println("Middle Name:\t" + info [las] [1]);
									System.out.println("First Name:\t" + info [las] [2]);
									System.out.println("Age:\t" + info [las] [3]);
									System.out.println("Gender:\t" + info [las] [4]);
									System.out.println("Birthday:\t" + info [las] [5]);
									System.out.println("Address:\t" + info [las] [6]);
									System.out.println("Record No:\t" + info [las] [7]);
									System.out.println("\n\n");
									pass = las ;
									las = 1000;
									

								}
								
							}
							else{
									System.out.println(name + "\t Not Found");
									las = 666;											
								}
						}
					
						
			
				}
				else if(ch == 2){
					
						System.out.println("\nEnter Record No");
						String id = n.readLine();
						for(int rec = 0 ; rec < 40 ; rec ++){
							if(info [rec][0] != null){
								if(info [rec][7].equals(id)){
									System.out.println("\nRecord No:\t" + info [rec] [7]);
									System.out.println("Last Name:\t" + info [rec] [0]);
									System.out.println("Middle Name:\t" + info [rec] [1]);
									System.out.println("First Name:\t" + info [rec] [2]);
									System.out.println("Age:\t" + info [rec] [3]);
									System.out.println("Gender:\t" + info [rec] [4]);
									System.out.println("Birthday:\t" + info [rec] [5]);
									System.out.println("Address:\t" + info [rec] [6]);
									System.out.println("\n\n");
									pass1 = rec;
									rec = 10001;
								}
								
							}
							else{
								System.out.println(id + "\tNot Found");
								rec = 666;
							}
						}
					
					
				} 
			}
			catch(Exception e){
				System.out.println("Invalid Input");
			}
		}
		return  info ;
	}

}