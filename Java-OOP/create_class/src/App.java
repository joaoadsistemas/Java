public class App {
    public static void main(String[] args) throws Exception {
        
        Nintendo n1 = new Nintendo("Vermelho", "3dsXL", false);

        n1.jogar();
        n1.ligar();
        n1.jogar();
    }
}
