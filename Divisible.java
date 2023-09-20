package divisible;

import java.util.Scanner;

/**
 *
 * @author maryse
 *
 * Prueba de divisibilidad. Éste es un programa en el que se introducen dos
 * números enteros y mediante una sentencia de selección se determina si son
 * divisibles.
 *
 */
public class Divisible {
    int n, d;
    Scanner entrada = new Scanner(System.in);

    public void valores ()
    {
        System.out.println("Introduzca dos enteros:");
        n = entrada.nextInt();
        d = entrada.nextInt();
        operaciones(n, d);
    }

    public void operaciones(int n, int d){
        if (n%d == 0) {
            System.out.println(n + " es divisible por " + d);
        } 
    }
    
    
    public static void main(String[] args) {
        Divisible rune = new Divisible();
        rune.valores();
   }

  

}
