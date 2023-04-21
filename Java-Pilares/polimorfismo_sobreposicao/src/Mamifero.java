public class Mamifero extends Animal{

    private String corDoPelo;

    public String getCorDoPelo() {
        return this.corDoPelo;
    }

    public void setCorDoPelo(String corDoPelo) {
        this.corDoPelo = corDoPelo;
    }

    @Override
    public void locomover() {
        System.out.println("Correndo");
    }

    @Override
    public void emitirSom() {
        System.out.println("Emitindo som de mamifero");
    }

    @Override
    public void alimentar() {
        System.out.println("Tomando leite");
    }
    
}
