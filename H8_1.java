package KT;

public class Har8_1 {


		public class Pindalad {
		    // Meetod arvutamaks rööpküliku pindalat
		    public static double roopkylikS(String alus, String korgus) {
		        // Aluse ja kõrguse väärtuste teisendamine lihtsadest stringidest arvulisteks väärtusteks
		        double a = Double.parseDouble(alus);
		        double h = Double.parseDouble(korgus);
		        // Rööpküliku pindala arvutamine
		        return a * h;
		    }

		    // Meetod arvutamaks ristküliku pindalat
		    public static double ristkylikS(String alus, String korgus) {
		        // Ristküliku pindala arvutamine rööpküliku meetodi abil
		        return roopkylikS(alus, korgus);
		    }

		    // Meetod arvutamaks kolmnurga pindalat
		    public static double kolmnurkS(String alus, String korgus, String kolmas) {
		        // Aluse ja kõrguse väärtuste teisendamine lihtsadest stringidest arvulisteks väärtusteks
		        double a = Double.parseDouble(alus);
		        double h = Double.parseDouble(korgus);
		        // Kolmanda väärtuse kontrollimine, kas see on olemas
		        if (kolmas != null) {
		            // Kolmanda väärtuse teisendamine lihtsast stringist arvuliseks väärtuseks
		            double c = Double.parseDouble(kolmas);
		            // Kolmnurga pindala arvutamine
		            return a * h * c / 2;
		        } else {
		            // Kolmanda väärtuse puudumisel, arvutatakse kolmnurga pindala baasi ja kõrgusega
		            return a * h / 2;
		        }
		    }
		}

		
		
	 

	 

}
