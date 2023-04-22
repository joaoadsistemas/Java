public class App {
    public static void main(String[] args) throws Exception {
        Video[] v = new Video[3];

        v[0] = new Video("Oop Java");
        v[1] = new Video("Php basico");

        Gafanhoto[] g = new Gafanhoto[3];

        g[0] = new Gafanhoto("Joao", 19, "Masculino", "jones");
        g[1] = new Gafanhoto("Jorginho", 23, "Masculino", "login-jorge");

        Visualizacao vis = new Visualizacao(g[0], v[1]);

        

    }
}
