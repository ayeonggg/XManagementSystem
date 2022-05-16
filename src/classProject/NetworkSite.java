package classProject;

import java.util.Scanner;

import exception.FolderFormatException;

public abstract class NetworkSite extends Site {
	
	public NetworkSite(SiteKind kind) {
		super(kind);
	}

	@Override
	public abstract void getUserInput(Scanner input);
	 
	@Override
	public void printInfo() {
		// TODO Auto-generated method stub
		String kind =getKindString();
		System.out.println("name: "+name+ "address: "+address+ "folder: "+folder+ "program address: "+ address+ "program folder: "+folder);
	}
	public void setSitefolderwithYN(Scanner input) {
		char answer ='x';
		while(answer !='y' && answer!= 'Y' && answer !='n' && answer != 'N')
		{
			System.out.print("Does site have a site folder? (Y/N): ");
		    answer = input.next().charAt(0);
		    try{
				if(answer == 'y'||answer=='Y') {
					setSitefolder(input);
					break;
				}
				else if (answer=='n'||answer=='N') {
					this.setFolder("");
					break;
				}
				else {
				}
			}
		    catch(FolderFormatException e) {
		    	System.out.print("Incorrect Folder Format. put the folder name contains Æú´õ");
		    }
		}
	}
}
