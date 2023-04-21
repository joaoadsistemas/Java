public class Reptil extends Animal {

    private String corDaEscama;

    public String getCorDaEscama() {
        return this.corDaEscama;
    }

    public void setCorDaEscama(String corDaEscama) {
        this.corDaEscama = corDaEscama;
    }

    @Override
    public void locomover() {
        System.out.println("Rastejar...");
    }

    @Override
    public void emitirSom() {
        System.out.println("Som de reptil");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais...");
    }
    
}