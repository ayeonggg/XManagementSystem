package classProject;

import java.util.Scanner;

public class ChromeSite extends NetworkSite {
	
	public ChromeSite(SiteKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setSiteaddress(input);
		setSitename(input);
		setSitefolderwithYN(input);
		setSitefolder(input);
	}
	public void printInfo() {
		String skind =getKindString();
			System.out.println("kind:"+ skind+ "name: "+name+ "address: "+address+ "folder: "+folder+ "program address: "+ address+ "program folder: "+folder);
		}
}

