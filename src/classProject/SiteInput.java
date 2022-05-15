package classProject;

import java.util.Scanner;

public interface SiteInput {
	
	public String getAddress();
	
	public void setAddress(String address);
	
	public void setName(String name);
	
	public void setFolder(String floder);
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setSiteaddress(Scanner input);
	
	public void setSitename(Scanner input);
	
	public void setSitefolder(Scanner input);
}
