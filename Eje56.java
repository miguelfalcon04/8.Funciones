/*Ejercicio 56
Implementa una función con nombre corteza que sea capaz de extraer la capa
exterior de un array bidimensional. Esta capa se extrae en forma de array de
una dimensión. La extracción de números comienza en la esquina superior
izquierda y continúa en el sentido de las agujas del reloj. Se debe entregar
tanto el código de la función como el código de prueba que la usa. La cabecera
de la función es la siguiente:
public static int[] corteza(int[][] n)
*/

import array.ArrayBi;
import array.Array;

public class Eje56 {

    public static int[] corteza(int[][] array){
        //1º FILA
        int[] fila0 = ArrayBi.filaDeArrayBiInt(array, 0);
        String fila0S = Array.convierteArrayEnString(fila0);

        //ULTIMA FILA
        int[] filaUlt = ArrayBi.filaDeArrayBiInt(array, array.length-1);
        filaUlt = Array.volteaArrayInt(filaUlt);
        String filaUltS = Array.convierteArrayEnString(filaUlt);

        //COLUMNA IZQUIERDA
        int[] colIzqCompleta = ArrayBi.columnaDeArrayBiInt(array, 0);
        int[] colIzq = new int[colIzqCompleta.length-2];
        int cont = 0;
        for (int i = 1; i < colIzqCompleta.length-1; i++) {
            colIzq[cont] = colIzqCompleta[i];
            cont++;
        }
        colIzq = Array.volteaArrayInt(colIzq);
        String colIzqS = Array.convierteArrayEnString(colIzq);

        //COLUMNA DERECHA
        int[] colDerCompleta = ArrayBi.columnaDeArrayBiInt(array, array[0].length-1);
        int[] colDer = new int[colDerCompleta.length-2];
        cont = 0;
        for (int i = 1; i < colDerCompleta.length-1; i++) {
            colDer[cont] = colDerCompleta[i];
            cont++;
        }
        String colDerS = Array.convierteArrayEnString(colDer);

        String cort = fila0S+colDerS+filaUltS+colIzqS;

        int[] cortz = Array.convierteStringEnArray(cort);

        return cortz;
    }

    public static void main(String[] args) {
        int[][] array = ArrayBi.generaArrayBiInt(4, 3, 0, 99);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%2d ",array[i][j]);
            }
            System.out.println();
        }

        System.out.println();

        int[] corteza = corteza(array);
        for (int i = 0; i < corteza.length; i++) {
            System.out.print(corteza[i]+" ");
        }

    }
}
