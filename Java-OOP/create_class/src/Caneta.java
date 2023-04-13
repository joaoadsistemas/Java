public class Caneta {
    
    String cor;
    String modelo;
    int carga;
    double ponta;
    boolean tampada;

    public Caneta(String cor, String modelo, int carga, double ponta, boolean tampada) {

        this.cor = cor;
        this.tampada = tampada;
        this.modelo = modelo;
        this.carga = carga;
        this.ponta = ponta;


    }



    public void status(){

        System.out.println("A cor da caneta é: " + this.cor);
        System.out.println("O modelo dela é: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Está tampada?: " + this.tampada);

    }

    public void rabiscar() {

        if(this.tampada) {
            System.out.println("Impossivel rabiscar, caneta tampada");
        } else {
            System.out.println("Rabiscando");
        }

    }

    public void tampar() {
        this.tampada = true;
    }


}
