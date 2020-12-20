import java.io.*;
public class Login_System{
	
	static String [][] info = new String [50][50]; 
	public static void try_catch()throws IOException{
		boolean back = true;
		int x;
		while(back == true){
			try{
				x = Integer.parseInt(br.readLine());
				back = false;
			}catch(Exception e){
				System.out.println("Invalid character!"+ e);
				
			}
		}

		
	}
	
	public static void main(String[]args)throws IOException{
		int x= 0;
		while(x<8)
		{
			user[x] = " ";
			pass[x] = " ";
			x++;
		}
		Menu();
	}
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void Menu()throws IOException{
		
		for(int i = 0; i == 0;)
		{
			try{
			System.out.println();
			System.out.println("Welcome to my Program!");
			System.out.println();
			System.out.println("[1] Login");
			System.out.println("[2] Register");
			System.out.println("[3] EXIT");
			System.out.println();
			System.out.print("Enter your choice: ");
			menu = Integer.parseInt(br.readLine());
			
			
			switch(menu){
				case 1:
				login();
				i = 1;
				Menu();
				break;
				
				case 2:
				if (usinc == 7)
				{
					System.out.println("Account slot full!");
				}
				else
				{
					register();
					i = 1;
					Menu();
				}
				break;
				case 3:
				System.out.println();
				System.out.println("T H A N K");
				System.out.println(" Y O U");
				System.out.println();	
				break;
				default:
				System.out.println("Invalid Input!");
			}
			
			}
			catch(Exception e){
				System.out.println("Invalid Character!"+e);
			}
		}
	}
	public static void login()throws IOException{
		menu m = new menu();
		ShowList l = new ShowList();
		System.out.println();
		System.out.println("L O G I N");
		System.out.println();
		l_error = 0;
		for (int i = 0;i == 0;)
		{
			System.out.print("Username: ");
			us = br.readLine(); 
			System.out.print("Password: ");
			ps = br.readLine();
			for (int y =0;y < 8;y++)
			{
				if ((us.equals(user[y]))&&(ps.equals(pass[y])))
				{
					l_check = 1;
					i = 1;
				}
			}
			if (l_check == 0)
			{
				l_error++;
				System.out.println("Invalid Username and Password!");
			}
			if (l_error == 3)
			{
				System.out.println("System close!");
				i = 1;
			}
		}
		if (l_check == 1)
		{
			System.out.println();
			System.out.println("You are successfully logged in!");
			System.out.println();
			l.show_product();
			m.mainMenu(info);
		}
	}
	public static void register()throws IOException{
		
		System.out.println();
		
		System.out.println( "R E G I S T E R");
		
		System.out.println();
		for (int i = 0;i == 0;)
		{
			System.out.print("Enter your Username: ");
			reuse = br.readLine();
			i = 1;
			for (int p = 0;p < user.length;p++)
			{
				if(reuse.equals(user[p]))
				{
					System.out.println("Username already taken!");
					i = 0;
				}
			}
		}
		user[usinc] = reuse;
		usinc++;
		for (int y = 0;y == 0;)
		{
			System.out.print("Enter you Password: ");
			repass = br.readLine();
			System.out.print("Confirm your Password: ");
			repassCon = br.readLine();
			if(repass.equals(repassCon)){
				y = 1;
				pass_conf = repass;
				for (int p = 0;p < pass.length;p++)
				{
					if(pass_conf.equals(pass[p]))
					{
						System.out.println("Username already taken!");
						y = 0;
					}
				}
			}
			else{
				System.out.println("password not match");
			}
		}
		pass[passinc] = repass;
		passinc++;
	}
	
	static int array[];
	public static String user[] = new String[8];
	public static String pass[] = new String[8];
	
	public static String repass,reuse,repassCon,lo,pass_conf,us,ps;
	public static int menu,e_menu,usinc = 0,passinc = 0,uscheck = 0,passcheck = 0,l_check = 0,l_error = 0;
	
}