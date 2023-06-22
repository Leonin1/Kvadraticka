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
        if(pocet == pocetKorenov.ZIADNY)
        {
           return "Rovnica nema koren!";
        }
        else if(pocet==pocetKorenov.JEDEN)
        {
            return "Rovnica ma koren x="+k1;
        }
        else
        {

            return "Rovnica ma koren x1="+k1+" x2="+k2;
        }
    }
}
