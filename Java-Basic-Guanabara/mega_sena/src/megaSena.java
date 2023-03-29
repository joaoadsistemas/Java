import java.util.Scanner;

public class megaSena {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número da tabuada");

        String number = scanner.nextLine();

        int num = Integer.parseInt(number);

        int[] tabuada = tabuada(num);

        for (int i = 0; i <= 10; i++) {
                System.out.println(i + " x " + num + " = " + tabuada[i]);
            
        }

    }

    static int[] tabuada(int num) {

        int[] tab = new int[11]; 

        for (int i = 0; i <= 10; i++) {
            tab[i] = num * i;
        }

        return tab;

    }

}
