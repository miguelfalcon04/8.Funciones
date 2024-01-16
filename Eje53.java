/*Ejercicio 53
Implementa una función con nombre nEsimo que busque el número que hay
dentro de un array bidimensional en la posición n-ésima contando de izquierda
a derecha y de arriba abajo, como si se estuviera leyendo. El primer elemento
es el 0. Si la posición donde se busca no existe en el array, la función debe
devolver -1. Se debe entregar tanto el código de la función como el código de
prueba que la usa. La cabecera de la función es la siguiente:
public static int nEsimo(int[][] n, int posicion)
*/

import array.ArrayBi;

public class Eje53 {

    public static int nEsimo(int[][] n, int posicion){
        int num = 0;
        int cont = 0;
        boolean captado = false;

        if(posicion>n[0].length*n.length-1){
            return -1;
        }else{
            for (int i = 0; i < n.length; i++) {
                if(captado==true){
                    break;
                }
                for (int j = 0; j < n[0].length; j++) {
                    if(posicion==cont){
                        num = n[i][j];
                        captado = true;
                        break;
                    }else{
                        cont++;
                    }
                }
            }

            return num;
        }
    }

    public static void main(String[] args) {
        int[][] array = ArrayBi.generaArrayBiInt(4, 6, 0, 99);
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.printf("%2d ",array[i][j]);
            }
            System.out.println();
        }

        int n = nEsimo(array, 5);
        System.out.println(n);
    }
}
