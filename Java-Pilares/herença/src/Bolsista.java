public class Bolsista extends Aluno {
    
    private int bolsa;

    public int getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(int bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Bolsa renovada...");
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Mensalidade bolsista paga");
    }





}
