package classProject;

import java.util.Scanner;

public class ChormeSite extends Site implements UserInput{
	
	public MicrosoftEdgeSite(SiteKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		System.out.print("Site Address: ");
		String address= input.next();
		this.setAddress(address);
		
		System.out.print("Site Name: ");
		String name= input.next();
		this.setName(name);
		
		System.out.print("Folder: ");
		String folder= input.next();
		this.setFolder(folder);
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

