import java.util.Random;

public class Luta  {

    private Lutador desafiante;
    private Lutador desafiado;
    private int rounds;
    private boolean aprovada;
    
    

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria() == l2.getCategoria() && l1 != l2 ) {
            this.setAprovada(true);

            this.setDesafiante(l1);
            this.setDesafiado(l2);
        } else {
            this.setAprovada(false);
            this.setDesafiante(null);
            this.setDesafiado(null);
        }
    }

    public void lutar() {
        if (this.getAprovada()) {
            desafiado.apresentar();
            desafiante.apresentar();

            Random random = new Random();
            int vencedor = random.nextInt(2);

            if (vencedor == 0) {
                System.out.println("A LUTA FOI EMPATE");
                desafiado.empatarLuta();
                desafiante.empatarLuta();
            } else if (vencedor == 1) {
                System.out.println("O LUTADOR " + desafiado.getNome() + " GANHOU A LUTA");
                desafiado.ganharLuta();
                desafiante.perderLuta();
            } else if (vencedor == 2) {
                System.out.println("O LUTADOR " + desafiante.getNome() + " GANHOU A LUTA");
                desafiante.ganharLuta();
                desafiado.perderLuta();
            }

        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean getAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }



    
}
