public class controleRemoto {
    
    int volume;
    boolean ligado;
    boolean mudo;

    public controleRemoto() {
        setVolume(50);
        setLigado(false);
        setMudo(true);
    }







    private int getVolume() {
        return this.volume;
    }

    private void setVolume(int v) {
        this.volume = v;
    }

    private boolean getLigado() {
        return this.ligado;
    }

    private void setLigado(boolean l) {
        this.ligado = l;
    }

    private boolean getMudo() {
        return this.mudo;
    }

    private void setMudo(boolean m) {
        this.mudo = m;
    }


}
