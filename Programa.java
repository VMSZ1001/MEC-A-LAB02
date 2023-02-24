
import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        // me ayude de chat gtp y videos de yotube y aclaraciones de codigo 
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese una línea de caracteres: ");
        String linea = sc.nextLine();
        sc.close();

        // Obtenemos la letra que más repetida
        String letras = "";
        for (int i = 0; i < linea.length(); i++) {
            char letra = Character.toLowerCase(linea.charAt(i));
            if ("aeiou".indexOf(letra) >= 0) {
                continue;
            }
            if (letras.indexOf(letra) < 0) {
                letras += letra;
            }
        }
        char letra_max = '\0';
        int max_rep = 0;
        for (int i = 0; i < letras.length(); i++) {
            char letra = letras.charAt(i);
            int rep = 0;
            for (int j = 0; j < linea.length(); j++) {
                //toma siempre que charAt Este método Java toma un argumento que siempre es de tipo int
                if (Character.toLowerCase(linea.charAt(j)) == letra) {
                    rep++;
                }
            }
            if (rep > max_rep) {
                letra_max = letra;
                max_rep = rep;
            }
        }

        // Sustituimos las vocales por la letra que más se repite
        StringBuilder linea_nueva = new StringBuilder();
        for (int i = 0; i < linea.length(); i++) {
            char letra = linea.charAt(i);
            if ("aeiouAEIOU".indexOf(letra) >= 0) {
                linea_nueva.append(letra_max);
            } else {
                linea_nueva.append(letra);
            }
        }

        // Invertimos el orden de la palabra
        linea_nueva.reverse();

        // Mostramos el resultado
        System.out.println("Resultado: " + linea_nueva.toString());
    }
}
