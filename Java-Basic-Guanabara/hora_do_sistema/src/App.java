import java.util.Date;
import java.util.Locale;

import java.awt.Toolkit;
import java.awt.Dimension;

public class App {
    public static void main(String[] args) {
        Date data = new Date();
        System.out.print("A hora do sistema é");
        System.out.println(data.toString());



        Locale currLocale = Locale.getDefault();
        System.out.println("O idioma usado no PC é " + currLocale);


        
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        int screenWidht = screenSize.width;
        int screenHeight = screenSize.height;

        System.out.println("A dimensão da imagem exibida é de " + screenWidht + "X" + screenHeight);

    }
    }

