public class App {
    
    public static void main(String[] args) {
        
        controleRemoto c = new controleRemoto();

        c.ligar();
        c.play();
        c.ligarMudo();
        c.desligarMudo();
        c.maisVolume();
        c.abrirMenu();


    }
}
