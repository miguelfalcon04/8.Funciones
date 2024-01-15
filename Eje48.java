/*Ejercicio 48
Define la función concatena con la siguiente cabecera:
public static int[] concatena(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es el
resultado de concatenar ambos. Por ej. si a = { 8, 9, 0 } y b = { 1, 2, 3 },
concatena(a, b) devuelve { 8, 9, 0, 1, 2, 3 }.
*/

public class Eje48 {

    public static int[] concatena(int[] a, int[] b){
        int[] concatenado = new int[a.length+b.length];

        for (int i = 0; i < a.length; i++) {
            concatenado[i] = a[i];
            concatenado[i+a.length]=b[i];
        }

        return concatenado;
    }
    public static void main(String[] args) {
        int[] a = {8,9,0};
        int[] b = {1,2,3};
        int[] ab = concatena(a, b);
        for (int i = 0; i < ab.length; i++) {
            System.out.print(ab[i]+" ");
        }
    }
}
