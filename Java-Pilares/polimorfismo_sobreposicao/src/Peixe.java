public class Peixe extends Animal {
    private String corDaEscama;

    public String getCorDaEscama() {
        return corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    public void soltarBolha() {
        System.out.println("Peixe soltou uma bolha");
    }

    @Override
    public void locomover() {
        System.out.println("Nadando...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Peixe nao emite som");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo nutrientes");
    }
    
    
    
}
