public class controleRemoto implements controlador {
    
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public controleRemoto() {
        this.setVolume(50);
        this.setLigado(false);
        this.setTocando(false);
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

    private boolean getTocando() {
        return this.tocando;
    }

    private void setTocando(boolean m) {
        this.tocando = m;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("-----MENU-----");
       System.out.println("Está ligado? " + this.getLigado());
       System.out.println("Está tocando? " + this.getTocando());
       System.out.println("Volume: " + this.getVolume());

       for (int i = 1; i <= this.getVolume(); i+= 10) {
            if (getVolume() == 0) {
                System.out.print(" o");
            } else {
                System.out.print(" |");
            }
        
        }


    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() + 5);
        }
    }

    @Override
    public void menosVolume() {
        if (this.getLigado()) {
            this.setVolume(this.getVolume() - 5);
        }
    }

    @Override
    public void ligarMudo() {
        if (this.getLigado() && this.getVolume() > 0) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.getLigado() && this.getVolume() == 0) {
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if (this.getLigado() && !(this.getTocando())) {
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getLigado() && this.getTocando()) {
            this.setTocando(false);
        }
    }





}
