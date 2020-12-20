	 import java.io.*;

public class menu
{ 
	static int mid;
	static BufferedReader n = new BufferedReader (new InputStreamReader (System.in));
	public String [][] mainMenu (String [][] info)throws IOException
	{
		BufferedReader reader = new BufferedReader(new FileReader("saveInfo.txt"));
		String chuh[] = new  String [8];
		String box;
		mid = 0;
		while((box = reader.readLine())!= null){
			chuh =  box.split (",");
			
			for(int dex = 0 ; dex < chuh.length ; dex ++  ){
				if (chuh[mid] != null){
					info[mid][dex] = chuh [dex];
				}
			}
			mid++;
		
		}
		
		int loop = 0 , choose = 0;
		while(loop == 0){
			try{
				System.out.print("\n");
            			System.out.println("\t\t::      ::  ::::::  ::  ::  ::  ::");
		     		System.out.println("\t\t:::    :::  ::      ::: ::  ::  ::");
		     		System.out.println("\t\t::::  ::::  :::::   ::::::  ::  ::");
		    		System.out.println("\t\t:: :::: ::  ::      :: :::  ::  ::");
		    		System.out.println("\t\t::  ::  ::  ::::::  ::  ::  ::::::\n\n");
				System.out.println();
				System.out.println("\t(1) ADD\n\t(2) View\n\t(3) Delete\n\t(4) Search\n\t(5) Update\n\t(6) Exit");
				System.out.print("\tChoose: ");
				choose = Integer.parseInt(n.readLine());
				if(choose == 6){
					File cc = new File("saveInfo.txt");
					BufferedWriter bw = new BufferedWriter(new FileWriter(cc));
					int aa = 0;
					for(int nn = 0; nn< 50; nn++ ){
						if (info[nn][0] != null){
							aa++;
						}
					}
					for(int grid = 0; grid < aa; grid++){
						for(int tx = 0; tx < 8 ; tx++ ){
							if (info[grid][tx] != null){
								bw.write(info[grid][tx]);
								bw.write(",");
							}
						}
						if(grid != (aa)){
							bw.write("\r\n");
						}
					}
					bw.close();
					System.out.println("\n\tThank you");
					System.exit(0);
				}
				else if(choose == 1){
					addInfo ad  = new addInfo();
					info = ad.add(info);
				}
				else if(choose == 2){
					viewInfo vi = new viewInfo();
					vi.view(info);
				}
				else if(choose == 3){
					deleteInfo del =new deleteInfo();
					 del.delete(info);
				}
				else if(choose == 4){
					searchInfo si = new searchInfo();
					 info = si.search(info);
				}
				else if(choose == 5){
					updateInfo up = new updateInfo();
					info = up.update(info);
				}
			}
			catch(Exception e){
				System.out.println("\n\tInvalid Input");
			}
		} 

		return info ;
	}
}