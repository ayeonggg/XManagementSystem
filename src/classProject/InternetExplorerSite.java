package classProject;

import java.util.Scanner;

import exception.FolderFormatException;

public class InternetExplorerSite extends NetworkSite {
	
	protected String programfolder;
	protected String programaddress;
	
	public InternetExplorerSite(SiteKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setSiteaddress(input);
		setSitename(input);
		setSitefolderwithYN(input);
		setProgramfolderwithYN(input);
		setSitefolder(input);
	}
	
	public void setProgramfolderwithYN(Scanner input) {
		char answer ='x';
		while(answer !='y' && answer!= 'Y' && answer !='n' && answer != 'N')
		{
			System.out.print("Does site have a program site folder? (Y/N): ");
		    answer = input.next().charAt(0);
		    try {
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
	public void printInfo() {
		String kind =getKindString();
		System.out.println("name: "+name+ "address: "+address+ "folder: "+folder+ "program address: "+ address+ "program folder: "+folder);
	}
	

}
		

