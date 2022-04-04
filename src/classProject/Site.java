package classProject;

public class Site {
	
	String name;
	String address;
	String folder;
	
	public Site() {
	}
	
	public Site(String name, String address) {
		this.name= name;
		this.address= address;

	}
	public Site(String name, String address, String folder) {
		this.name= name;
		this.address=address;
		this.folder= folder;
	}
	
	public void printInfo() {
		System.out.println("name: "+name+ "address: "+address+ "folder: "+folder);
	}
}
	
