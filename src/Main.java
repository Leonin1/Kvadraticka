public class Main {
    public static void main(String[] args) {
        Kvadraticka Prva = new Kvadraticka(1, 5, 6);
        System.out.println(Prva);
        Prva.vypisKorene();
        Kvadraticka Druha = new Kvadraticka(0,2,3);
        System.out.println(Druha);
        Druha.vypisKorene();
    }
}