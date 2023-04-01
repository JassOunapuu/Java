// Jass Õunapuu

import java.util.Scanner;

public class H8_2 {

    public static void main(String[] args) {
        Ruumalad ruumalad = new Ruumalad(5.0, 3.0, 2.0);
        System.out.println("Risttahuka ruumala on " + ruumalad.risttahukasRuumala());
        System.out.println("Silindri ruumala on " + ruumalad.silinderRuumala());
        System.out.println("Kuubi ruumala on " + ruumalad.kuupRuumala());

        double arvutatudRuumala = ruumalad.arvutaRuumala();
        System.out.println("Arvutatud ruumala on " + arvutatudRuumala);
    }

    public static class Ruumalad {
        // Atribuudid
        private double pikkus;
        private double laius;
        private double korgus;

        // Konstruktor
        public Ruumalad(double pikkus, double laius, double korgus) {
            this.pikkus = pikkus;
            this.laius = laius;
            this.korgus = korgus;
        }

        // Klassimeetod, mis arvutab risttahuka ruumala
        public double risttahukasRuumala() {
            return pikkus * laius * korgus;
        }

        // Klassimeetod, mis arvutab silindri ruumala
        public double silinderRuumala() {
            return Math.PI * Math.pow(laius / 2, 2) * korgus;
        }

        // Klassimeetod, mis arvutab kuubi ruumala
        public double kuupRuumala() {
            return Math.pow(laius, 3);
        }

        // Klassimeetod, mis küsib kasutajalt andmed ja tagastab vastava ruumala
        public double arvutaRuumala() {
            double ruumala = 0.0;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Vali kujund, mille ruumala soovid arvutada:");
            System.out.println("1 - risttahukas");
            System.out.println("2 - silinder");
            System.out.println("3 - kuup");

            int valik = scanner.nextInt();

            switch (valik) {
                case 1:
                    System.out.println("Sisesta risttahuka pikkus:");
                    double risttahukaPikkus = scanner.nextDouble();
                    System.out.println("Sisesta risttahuka laius:");
                    double risttahukaLaius = scanner.nextDouble();
                    System.out.println("Sisesta risttahuka kõrgus:");
                    double risttahukaKorgus = scanner.nextDouble();
                    ruumala = new Ruumalad(risttahukaPikkus, risttahukaLaius, risttahukaKorgus).risttahukasRuumala();
                    break;
                case 2:
                    System.out.println("Sisesta silindri raadius:");
                    double silindriRaadius = scanner.nextDouble();
                    System.out.println("Sisesta silindri kõrgus:");
                    double silindriKorgus = scanner.nextDouble();
                    ruumala = new Ruumalad(silindriRaadius * 2, silindriRaadius * 2, silindriKorgus).silinderRuumala();
                    break;
                    case 3:
                    System.out.println("Sisesta kuubi külje pikkus:");
                    double kuupKyljePikkus = scanner.nextDouble();
                    ruumala = new Ruumalad(kuupKyljePikkus, kuupKyljePikkus, kuupKyljePikkus).kuupRuumala();
                    break;
                    default:
                    System.out.println("Vigane valik!");
                    break;
                    }

            scanner.close();
            return ruumala;
        }
    }
}
            
            
