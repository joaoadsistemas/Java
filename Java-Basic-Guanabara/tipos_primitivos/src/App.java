import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        // boolean isLogged = true;
        // byte b = 'b'; // um bit
        // char c = 'c'; // Uma letra
        // short s = -123; // Int (só que com menos espaços)
        // int i = 12435; 
        // double j = 123.54; // Decimal


        // CONVERTER TIPOS PRIMITIVOS (casting)


        // Scanner scanner = new Scanner(System.in);
        // int z = (int) scanner.nextDouble(); // Casting

        // System.out.println(z);


        // MANIPULAÇÃO STRINGS


        String x = "Olá mundo, esse é o novo mundo";
        System.out.println(x.length()); // tamanho
        System.out.println(x + " concatenada"); // concatena
        System.out.println(x.contains("novo")); // mostra em forma de boolean se tem ou nao essa palavra contida
        System.out.println(x.indexOf("mundo")); // index que começa essa palavra
        System.out.println(x.lastIndexOf("mundo")); // index que começa a ultima palavra na string
        System.out.println(x.trim()); // retira todos os espaços    
        


    }
}
