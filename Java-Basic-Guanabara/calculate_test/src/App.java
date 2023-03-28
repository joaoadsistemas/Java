public class App {
    public static void main(String[] args) {

        int x = Integer.parseInt(args[1]);
        int y = Integer.parseInt(args[2]);


         if (args[0].equals("somar")) {
            sum(x, y);
        } else if (args[0].equals("subtrair")) {
            sub(x, y);
        } else if (args[0].equals("multiplicar")) {
            mult(x, y);
        } else if (args[0].equals("dividir")) {
            div(x, y);
        } else {
            System.out.println("Por favor, digite um dos valores: 'somar', 'subtrair', 'multplicar'ou 'dividir'");
        }
        
    }

    static void sum(int x, int y) {
        System.out.println("Sua soma foi de " + (x + y));
    }

    static void sub(int x, int y) {
        System.out.println("Sua subtração foi de " + (x - y));
    }

    static void mult (int x, int y) {
        System.out.println("Sua multiplicacao foi de " + (x * y));
    }

    static void div (int x, int y) {
        System.out.println("Sua divisão foi de " + (x / y));
    }
}
