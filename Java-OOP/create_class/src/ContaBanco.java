import java.util.Random;

public class ContaBanco {
    private String numConta;
    private String tipo;
    private String dono;
    private double saldo;
    private boolean status;

    public ContaBanco(String numConta, String tipo, String dono) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = 0;
        this.status = false;
    }

    public String getNumConta() {
        return numConta;
    }

    public void setNumConta(String numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        if (tipo.equals("cc")) {
            this.tipo = tipo;
            depositar(50);
        } else if (tipo.equals("cp")) {
            this.tipo = tipo;
            depositar(150);
        } else {
            System.out.println("Tipo de conta inválido");
        }
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean getStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void depositar(double quant) {
        if (this.status) {
            this.setSaldo(this.getSaldo() + quant);
        } else {
            System.out.println("A conta está fechada");
        }
    }

    public void abrirConta(String tipo) {
        this.status = true;
        setTipo(tipo);
    }

    public void fecharConta() {
        if (this.saldo < 0) {
            System.out.println("Não é possível fechar sua conta, pois há dívidas nela");
        } else if (this.saldo > 0) {
            System.out.println("Você está tentando fechar a conta contendo saldo na mesma, saque-o antes de prosseguir");
        } else {
            this.status = false;
        }
    }

    public void sacar(double quant) {
        if (this.status && this.saldo >= quant) {
            this.saldo -= quant;
        } else {
            System.out.println("Saldo insuficiente ou conta fechada");
        }
    }

    public void pagarMensal() {
        double taxa = 0;
        if (this.tipo.equals("cc")) {
            taxa = 12;
        } else if (this.tipo.equals("cp")) {
            taxa = 20;
        }
        if (this.status) {
            this.saldo -= taxa;
        } else {
            System.out.println("Conta fechada");
        }
    }
}