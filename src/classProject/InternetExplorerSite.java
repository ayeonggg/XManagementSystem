package classProject;

import java.util.Scanner;

public class InternetExplorerSite extends Site {
	
	protected String programfolder;
	protected String programaddress;
	
	public InternetExplorerSite(SiteKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Site Address: ");
		String address= input.next();
		this.setAddress(address);
		
		System.out.print("Site Name: ");
		String name= input.next();
		this.setName(name);
		
		char answer ='x';
		while(answer !='y' && answer!= 'Y' && answer !='n' && answer != 'N')
		{
			System.out.print("Does site have a parent's site folder? (Y/N): ");
		    answer = input.next().charAt(0);
			if(answer == 'y'||answer=='Y') {
				System.out.print("parent's site folder: ");
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
		
		System.out.print("site address: ");
		String Address=input.next();
		this.setAddress(address);
	}
	
	public void printInfo() {
		String skind="none";
		switch(this.kind) {
		case Chrome:
			skind="Chorme";
			break;
		case MicrosoftEdge:
			skind="Edge";
			break;
		case InternetExplorer:
			skind="Explorer";
			break;
		case Safari:
			skind="Safari";
			break;
		default:
			
		}
		System.out.println("name: "+name+ "address: "+address+ "folder: "+folder+ "program address: "+ address+ "program folder: "+folder);
	}
}
		

