package classProject;

import java.util.Scanner;

import exception.FolderFormatException;

public class MicrosoftEdgeSite extends Site {
	
	public MicrosoftEdgeSite(SiteKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setSiteaddress(input);
		setSitename(input);
		setSitefolderwithYN(input);
		setSitefolder(input);
	}
	
	public void setSitefolderwithYN(Scanner input) {
		char answer ='x';
		while(answer !='y' && answer!= 'Y' && answer !='n' && answer != 'N')
		{
			System.out.print("Does site have an folder? (Y/N): ");
		    answer = input.next().charAt(0);
		    try {
				if(answer == 'y'||answer=='Y') {
					System.out.print("Site folder: ");
					String folder= input.next();
					this.setFolder(folder);
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
		    	System.out.println("Incorrect Folder Format. put the folder name contains ????");
		    }
		}
		    
	}
	
	public void printInfo() {
		String kind =getKindString();
			System.out.println("name: "+name+ "address: "+address+ "folder: "+folder+ "program address: "+ address+ "program folder: "+folder);
		}
	}

		
