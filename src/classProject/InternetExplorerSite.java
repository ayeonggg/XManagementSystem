package classProject;

import java.util.Scanner;

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
		setParentfolderwithYN(input);
		setSitefolder(input);
	}
	
	public void setParentfolderwithYN(Scanner input) {
		char answer ='x';
		while(answer !='y' && answer!= 'Y' && answer !='n' && answer != 'N')
		{
			System.out.print("Does site have a program site folder? (Y/N): ");
		    answer = input.next().charAt(0);
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
	}
	public void printInfo() {
		String kind =getKindString();
		System.out.println("name: "+name+ "address: "+address+ "folder: "+folder+ "program address: "+ address+ "program folder: "+folder);
	}
	

}
		

