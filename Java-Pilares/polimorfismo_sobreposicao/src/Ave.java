public class Ave extends Animal {
    
    private String corDaPena;

    public String getCorDaPena() {
        return corDaPena;
    }

    public void setCorDaPena(String corDaPena) {
        this.corDaPena = corDaPena;
    }

    public void fazerNinho() {
        System.out.println("Fazendo ninho...");
    }

    @Override
    public void locomover() {
        System.out.println("Voando...");
    }

    @Override
    public void emitirSom() {
       System.out.println("Som de passaro");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo graos...");
    }

    

}
