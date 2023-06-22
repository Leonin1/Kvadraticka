public class Kvadraticka implements Rovnince
{
    private double a;
    private double b;
    private double c;

    Kvadraticka(double pA, double pB, double pC) {
        this.a = pA;
        b = pB;
        c = pC;
    }

    public double getDiskriminant() {
        double D = b * b - 4 * a * c;
        return D;
    }

    public pocetKorenov getPocetKorenov() {
        pocetKorenov pocetK;
        double D = getDiskriminant();
        if (D == 0) {
            pocetK = pocetKorenov.ZIADNY;
        } else if (D > 0) {
            pocetK = pocetKorenov.DVA;
        } else {
            pocetK = pocetKorenov.JEDEN;
        }
        return pocetK;
    }

    public void vypisKorene() {
        System.out.println(vratKorene());
    }

    public Koren vratKorene() {

        if(a==0)
        {
            System.out.println("Rovnica je linearna");
            return new RovnicaLn(b,c).vratKorene();
        }

        return switch (getPocetKorenov()) {
            case ZIADNY -> new Koren(pocetKorenov.ZIADNY, Double.NaN, Double.NaN);
            case JEDEN -> new Koren(pocetKorenov.JEDEN, -b / (2 * a), Double.NaN);
            case DVA -> new Koren(pocetKorenov.DVA, (-b + Math.sqrt(getDiskriminant())) / (2 * a), (-b - Math.sqrt(getDiskriminant())) / (2 * a));
            case VELA -> new Koren(pocetKorenov.VELA, Double.NaN, Double.NaN);
        };
    }

    @Override
    public String toString() {
        return a + "x^2+" + b + "x+" + c + "=0";
    }
}
