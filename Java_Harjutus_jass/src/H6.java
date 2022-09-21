//jass õunapuu
import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.*;
public class H6 {

	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList <Integer>();
		Scanner scanner = new Scanner (System.in);
		
		int k = 1;
		
		while(k == 1) {
			System.out.print("Sisesta arv: ");
			String nr = scanner.nextLine();
			
			if(nr == "") {
				break;
			}
		
			int number = Integer.parseInt(nr);
			list.add(number);
		}
		int kokku = list.size();
		int sum = list.stream().mapToInt(Integer::intValue).sum();
		int keskmine = sum/kokku;
		

		try {
			PrintWriter bw = new PrintWriter("numbrid.txt");
			bw.println("Kõik arvud: "+ list);
			bw.println("Summa: "+sum);
			bw.println("Keskmine: "+ keskmine);
			bw.close();
			System.out.println("Fail loodud!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
