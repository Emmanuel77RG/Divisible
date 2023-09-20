package divisible;

import java.util.Scanner;

/**
 *
 * @author Emmanuel77rg
 * 
 * Prueba de divisibilidad; es el programa Divisible al que se añadió la 
 * cláusula else; 
 * se leen dos números enteros y con el operador módulo (%) se comprueba si 
 * son divisibles o no.
 *
 *
 */
public class Divisible2 {

    int n, d;
    Scanner entrada = new Scanner(System.in);

    public void valores()
    {
        System.out.print("Introduzca primer valor ");
        n = entrada.nextInt();
        System.out.print("Introduzca segundo valor ");
        d = entrada.nextInt();
        calculos(n, d);
    }
    
    public void calculos(int n, int d)
    {
        
        if (n%d == 0) {
            System.out.println(n + " es divisible entre " + d);
        } else {
            System.out.println(n + " no es divisible entre " + d);
    }
    }

    public static void main(String[] args) {
        Divisible2 rune = new Divisible2();
        rune.valores();
    }
}
