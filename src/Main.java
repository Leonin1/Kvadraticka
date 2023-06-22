public class Main {
    public static void main(String[] args) {
        Kvadraticka Prva = new Kvadraticka(1, 5, 6);
        System.out.println(Prva);
        System.out.println(Prva.getPocetKorenov());
        System.out.println(Prva.getDiskriminant());
        Prva.vypisKorene();
    }
}