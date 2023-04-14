public class App {
    public static void main(String[] args) throws Exception {
        
        Nintendo n1 = new Nintendo("Vermelho", "3dsXL", false);
        Caneta c1 = new Caneta("Azul", "Bic", 45, 0.7, true);


        n1.jogar();
        n1.setLigar(false);
        n1.jogar();

        ContaBanco conta1 = new ContaBanco("21093812905", "cc", "João Henrique");

        conta1.abrirConta("cp");

        System.out.println(conta1.getStatus());

        System.out.println(conta1.getSaldo());

        conta1.fecharConta();
      
        

    }
}
