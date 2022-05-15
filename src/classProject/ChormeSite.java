package classProject;

import java.util.Scanner;

public class ChormeSite extends NetworkSite {
	
	public ChormeSite(SiteKind kind) {
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setSiteaddress(input);
		setSitename(input);
		setSitefolderwithYN(input);
		setSitefolder(input);
	}
	
}

