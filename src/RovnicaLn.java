import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class RovnicaLn  implements  Rovnince
{
    private double b;
    private double c;


    public RovnicaLn(double bc) {
        b = c = bc;

    }

    public RovnicaLn(double mojeb, double mojec) {
        b = mojeb;
        c = mojec;
    }

    static double vratCislo(String text) {
        double cislo;
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.println(text);
                cislo = sc.nextDouble();
                return cislo;
            } catch (InputMismatchException e) {
                System.out.println("Nebolo zadane cislo!");
                sc.nextLine();
            }
        }
    }

    public pocetKorenov getPocetKorenov() {
        if (b == 0) {
            if (c == 0) {
                return pocetKorenov.VELA;
            }
            return pocetKorenov.ZIADNY;
        }
        return pocetKorenov.JEDEN;
    }

    public Koren vratKorene() {
        return switch (getPocetKorenov()) {
            case ZIADNY -> new Koren(pocetKorenov.ZIADNY, Double.NaN, Double.NaN);
            case JEDEN -> new Koren(pocetKorenov.JEDEN, -c/b, Double.NaN);
            case DVA -> new Koren(pocetKorenov.DVA,Double.NaN, Double.NaN);
            case VELA -> new Koren(pocetKorenov.VELA, Double.POSITIVE_INFINITY, Double.POSITIVE_INFINITY);
        };
    }

    public RovnicaLn() {

        b = vratCislo("zadaj koeficient b:");
        c = vratCislo("zadaj koeficient c:");
    }


    public void vypisKorene() {
        System.out.print(vratKorene());
    }


/*    public double getKoren() {
        if (b == 0) {
            if (c == 0) {
                return Double.POSITIVE_INFINITY;
            }
            return Double.NaN;
        }
        return -c/b;
    }

    public void printKoren() {
        double vysledok = getKoren();
    }

    {
        double vysledok = getKoren();
        if (Double.isInfinite(vysledok)) {
            System.out.println("vela rieseni");
        } else if (Double.isNaN(vysledok)) {
            System.out.println("nema rieenie");
        } else {
            System.out.println("koren je:" + -c / b);
        }
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }


    public double getC() {
        return c;
    }


    public void setC(double mojec) {
        c = mojec;
    }*/

    public String toString() {
        return String.format("%.2fx%x%+.2f = 0", b, c);
    }
}
