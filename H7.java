//Jass Õunapuu
import java.util.Scanner;

public class H7 {

	public static void main(String[] args) {
		
		viga();
		}
		
	public static void viga() {
		
		Scanner scanner = new Scanner (System.in); 
	
	try {
		System.out.println("Sisesta arv: ");
		int arv1 = scanner.nextInt();
		System.out.println("Sisesta arv: " );
		int arv2 = scanner.nextInt();
		
		int s = arv1/arv2;
		System.out.println(s);
	} catch (Exception e) { 
		System.out.println("error");
	}
	System.out.println("Programm töötab edasi");
	viga();
			   
	}	 
			
}