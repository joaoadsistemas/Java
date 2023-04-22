public class Visualizacao  {
    private Gafanhoto espectador;
    private Video filme;

    

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    

    public Gafanhoto getEspectador() {
        return espectador;
    }



    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }



    public Video getFilme() {
        return filme;
    }



    public void setFilme(Video filme) {
        this.filme = filme;
    }



    public void avaliar() {
        this.filme.setAvaliacoes(5);
    }

    public void avaliar(int nota) {
        this.filme.setAvaliacoes(nota);
    }

    public void avaliar(double porcent) {
        int total = 0;
        if (porcent <=20) {
            total = 3;
        } else if (porcent <= 50) {
            total = 5;
        } else if (porcent <= 90) {
            total = 8;
        } else {
            total = 10;
        }
    }
}
