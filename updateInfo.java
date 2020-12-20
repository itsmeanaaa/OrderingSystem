import java.io.*;

public class updateInfo
{
	
	static BufferedReader n = new BufferedReader (new InputStreamReader (System.in));
	public String [][] update(String [][] info)throws IOException
	{
		
		int ch = 0 , edit  = 0, pass = 0 , pass1 = 0 , z = 0;
		System.out.println();
		System.out.println("\n\n");
        	System.out.println("\t\t ::  :: :::::: ::::    :::: :::::: ::::   ");
		System.out.println("\t\t ::  :: ::  :: ::  :: ::  ::  ::   ::	");
		System.out.println("\t\t ::  :: :::::: ::  :: ::::::  ::   ::::	");
		System.out.println("\t\t ::  :: ::     ::  :: ::  ::  ::   ::     ");
	   	System.out.println("\t\t  ::::  ::     ::::   ::  ::  ::   ::::\n\n");
		System.out.print("Enter Last Name:\t");
		String lastname = n.readLine();
		System.out.print("Enter Record NO:\t");
		String record = n.readLine();
		for( ; edit < 40 ; edit ++){
			if(info [edit][0] != null){
				if(info [edit][0].equals(lastname) && info [edit][7].equals(record)){
					while(z == 0){
						try{
							System.out.println("\n");
							System.out.println("(1) By Last name:\t" + info [edit] [0]);
							System.out.println("(2) By Middle name:\t" + info [edit] [1]);
							System.out.println("(3) By First name:\t" + info [edit] [2]);
							System.out.println("(4) By Age:\t" + info [edit] [3]);
							System.out.println("(5) By Gender:\t" + info [edit] [4]);
							System.out.println("(6) By Birthday:\t" + info [edit] [5]);
							System.out.println("(7) By Address:\t" + info [edit] [6]);
							System.out.println("(8) Back");
							System.out.print("Choose : ");
							ch = Integer.parseInt(n.readLine());
							if(ch == 1){
									System.out.println("Enter New Last name");
									String lname = n.readLine();
									info [edit] [0] = lname;
									System.out.println("Succesfully Change");
							}
							else if(ch  == 2){
									System.out.println("Enter New Middle name");
									String middle = n.readLine();
									info [edit] [1] = middle;
									System.out.println("Succesfully Change");
							}
							else if(ch  == 3){
		



































		System.out.println("Enter New First name");
									String first = n.readLine();
									info [edit] [2] = first;
									System.out.println("Succesfully Change");
							}
							else if(ch == 4){
									System.out.println("Enter New Age");
									String age = n.readLine();
									info [edit] [3] = age;
									System.out.println("Succesfully Change");
							}
							else if(ch == 5){
									System.out.println("Enter New Gender");
									String gender = n.readLine();
									info [edit] [4] = gender ;
									System.out.println("Succesfully Change");
							}
							else if(ch == 6){
									System.out.println("Enter New Birthday");
									String bday = n.readLine();
									info [edit] [5] = bday;
									System.out.println("Succesfully Change");
							}
							else if(ch == 7){
									System.out.println("Enter New Address");
									String add = n.readLine();
									info [edit] [6] = add;
									System.out.println("Succesfully Change");
							}
							else if(ch == 8){
									z = 888;
									edit = 1000;
							}
						}
						catch(Exception e){
							System.out.println("Invalid Input");
						}
					}
				}	
			}
			else{
				System.out.println(lastname + " " + record + "\tNot Found");
				edit = 666 ;
			}
		}
		return info ;
	}

}