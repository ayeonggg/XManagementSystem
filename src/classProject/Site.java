
import java.util.Scanner;
public class Site {
	String name;
	String address;
	String folder;
	
	public Site() {
//		numSitesRegistered++;
	}
	public Site(String name, String address) {
		this.name= name;
		this.address= address;
//		numSitesRegistered++;
	}
	public Site(String name, String address, String folder) {
		this.name= name;
		this.address=address;
		this.folder= folder;
//		numSitesRegistered++;
	}
	public void printInfo() {
		System.out.println("name: "+name+ "address: "+address+ "folder: "+folder);
	}
}
	
