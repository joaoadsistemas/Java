public class Nintendo {
    
    String cor;
    String modelo;
    boolean ligado;

    public Nintendo(String cor,String modelo, boolean ligado) {
        this.cor = cor;
        this.modelo = modelo;
        this.ligado = ligado;
    }

    public void jogar() {
        if (this.ligado) {
            System.out.println("Jogando");
        } else {
            System.out.println("Console desligado, ligue-o");
        }
    }

    public void ligar() {
        this.ligado = true;
    }


}
