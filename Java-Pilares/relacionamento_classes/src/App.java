public class App {
    public static void main(String[] args) {
        Lutador l1 = new Lutador("João", "Brasil", 19, 1.86, 78, 12, 1, 2);
        Lutador l2 = new Lutador("Roberto", "EUA", 54, 1.54, 71.2, 12, 4, 5);
        l1.apresentar();;

        Luta luta = new Luta();

        luta.marcarLuta(l1, l2);
        luta.lutar();

        l2.status();

    }
}
