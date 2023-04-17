public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, int pagAtual, boolean aberto, Pessoa leitor) {
        setTitulo(titulo);
        setAutor(autor);
        setTotPaginas(totPaginas);
        setAberto(false);
        setPagAtual(0);
        setLeitor(leitor);
    }
    private String getTitulo() {
        return titulo;
    }
    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    private String getAutor() {
        return autor;
    }
    private void setAutor(String autor) {
        this.autor = autor;
    }
    private int getTotPaginas() {
        return totPaginas;
    }
    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }
    private int getPagAtual() {
        return pagAtual;
    }
    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }
    private boolean getAberto() {
        return aberto;
    }
    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }
    private Pessoa getLeitor() {
        return leitor;
    }
    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("Livro: " + getTitulo());
        System.out.println("Contem: " + getTotPaginas() + " paginas");
    }
    @Override
    public void abrir() {
        setAberto(true);
    }
    @Override
    public void fechar() {
        setAberto(false);
    }
    @Override
    public void folhear(int p) {
       setPagAtual(p);
    }
    @Override
    public void avancarPag() {
        setPagAtual(getPagAtual() + 1);
    }
    @Override
    public void voltarPag() {
        setPagAtual(getPagAtual() - 1);
    }


    

}
