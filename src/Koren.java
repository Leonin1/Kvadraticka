public class Koren
{
    private pocetKorenov pocet;
    private double k1;
    private double k2;

    Koren(pocetKorenov pPocet, double pk1, double pk2)
    {
        pocet = pPocet;
        k1 = pk1;
        k2 = pk2;
    }

    @Override
    public String toString()
    {
        return switch(pocet)
        {
            case ZIADNY -> "Rovnica nema koren!";
            case JEDEN ->  String.format("Rovnica ma koren x= %.2f",k1);
            case DVA -> String.format("Rovnica ma koren x1=%.2f x2= %.2f" ,k1,k2);
            case VELA -> "Rovnica ma vela korenov!";
        };
    }
}
