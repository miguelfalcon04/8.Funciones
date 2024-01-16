/*Ejercicio 54
Crea las funciones cuyas cabeceras se muestran a continuación, observa que
tienen el mismo nombre:
public static int ocurrencias(int digito, int n)
public static int ocurrencias(int digito, int[] a)
La función ocurrencias devuelve el número de veces que aparece un dígito
dentro de un número (primera función) o bien el número de veces que aparece
un dígito en una serie de números contenidos en un array (segunda función).
Ejemplos:
console ocurrencias(8, 4672) devuelve 0 ocurrencias(5, 25153) devuelve 2 ocurrencias(2,
123456) devuelve 1 Si a = {714, 81, 9, 11}, ocurrencias(1, a) devuelve 4 Si a = {42, 13,
12345, 4}, ocurrencias(4, a) devuelve 3 Si a = {6, 66, 666}, ocurrencias(6, a) devuelve
6 console
*/
import matematicas.Varias;

public class Eje54 {

    /**
     *  Se la pasa un dígito y un numero
     * @param digito
     * @param n
     * @return Número de veces que aparece un dígito dentro de un número
     */
    public static int ocurrencias(int digito, int n){
        int veces = 0;
        int numDigitos = Varias.digitos(n);

        for (int i = 0; i < numDigitos; i++) {
            if(n%10==digito){
                veces++;
            }
            n/=10;
        }

        return veces;
    }

    /**
     *  Se le pasa un dígito y un array
     * @param digito
     * @param a
     * @return El número de veces que aparece un dígito en una serie de números contenidos en un array
     */
    public static int ocurrencias(int digito, int[] a){
        int veces = 0;
        int numIndividual = 0;
        for (int i = 0; i < a.length; i++) {
            numIndividual = ocurrencias(digito, a[i]);
            veces+=numIndividual;
        }

        return veces;
    }

    public static void main(String[] args) {
        int a = ocurrencias(8, 4672);
        System.out.println("a: "+a);

        int b = ocurrencias(5, 25153);
        System.out.println("b: "+b);

        int c = ocurrencias(2, 123456);
        System.out.println("c: "+c);

        int[] d = {714, 81, 9, 11};
        int d1 = ocurrencias(1, d);
        System.out.println("d: "+d1);

        int[] e = {42, 13, 12345, 4};
        int e1 = ocurrencias(4, e);
        System.out.println("e: "+e1);

        int[] f = {6, 66, 666};
        int f1 = ocurrencias(6, f);
        System.out.println("f: "+f1);
    }
}