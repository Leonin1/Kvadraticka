public class Kvadraticka
{
    private double a;
    private double b;
    private double c;

    Kvadraticka(double pA, double pB, double pC)
    {
        this.a = pA;
        b = pB;
        c = pC;
    }

    public double getDiskriminant()
    {
        double D = b*b-4*a*c;
        return D;
    }

    public pocetKorenov getPocetKorenov()
    {
        pocetKorenov pocetK;
        double D = getDiskriminant();
        if(D==0)
        {
            pocetK=pocetKorenov.ZIADNY;
        }
        else if(D > 0)
        {
            pocetK=pocetKorenov.DVA;
        }
        else
        {
            pocetK=pocetKorenov.JEDEN;
        }
        return pocetK;
    }

    public void vypisKorene()
    {
        Koren Moj = vratKorene();
        System.out.printf(Moj.toString());
    }

    public Koren vratKorene()
    {
        pocetKorenov pocet = getPocetKorenov();
        Koren Vrat;
        switch (pocet)
        {
            case ZIADNY :
                 Vrat = new Koren(pocetKorenov.ZIADNY,Double.POSITIVE_INFINITY,Double.POSITIVE_INFINITY);
                break;
            case JEDEN:
                 Vrat = new Koren(pocetKorenov.JEDEN, -b/(2*a), Double.POSITIVE_INFINITY);
                 break;
            default:
                Vrat = new Koren(pocetKorenov.DVA, (-b+Math.sqrt(getDiskriminant()))/(2*a), (-b-Math.sqrt(getDiskriminant()))/(2*a));

        }
        return Vrat;
    }

    @Override
    public String toString() {
        return a+"x^2+"+b+"x+"+c+"=0";
    }
}
