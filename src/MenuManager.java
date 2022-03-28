import java.util.Scanner;

public class MenuManager {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
	
		int num=5;
		 
		while(num!=6){
			System.out.println("*** Student Mangement System Menu ***");
			System.out.println("1. Add Site");
			System.out.println("2. Delete Site");
			System.out.println("3. Edit Site");
			System.out.println("4. View Site");
			System.out.println("5. Show a Menu");
			System.out.println("6. Exit");
			System.out.println("Select one number between 1-6:");
			num=input.nextInt();
			if(num==1) {
				addSite();
			}
			else if(num==2) {
				deleteSite();
			}
			else if(num==3) {
				editSite();
			}
			else if(num==4) {
				viewSite();
			}
			else {
				continue;
			}
		}
	}
	
//		switch(num) {
//		case 1:
//			System.out.print("Site Address:");
//			String siteAddress= input.next();
//			System.out.print("Site Name:");
//			String siteName=input.next();
//			break;
//		case 2:
//		case 3:
//		case 4:
//			System.out.print("site Address:");
//			String siteAddress2=input.next();
		public static void addSite() {
			Scanner input= new Scanner(System.in);
			System.out.print("Site Address: ");
			String siteaddress= input.next();
			System.out.print("Site name: ");
			String sitename= input.next();
			System.out.print("folder: ");
			String folder= input.next();
			}
		
		public static void deleteSite() {
			Scanner input= new Scanner(System.in);
			System.out.print("Site Address: ");
			String siteaddress= input.next();
		}
		
		public static void editSite() {
			Scanner input= new Scanner(System.in);
			System.out.print("Site Address: ");
			String siteaddress= input.next();
		}
		
		public static void viewSite() {
			Scanner input= new Scanner(System.in);
			System.out.print("Site Address: ");
			String siteaddress= input.next();
	}
	}
