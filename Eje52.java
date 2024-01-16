/*Ejercicio 52
Implementa la función aleatorioDeArray con la cabecera que se muestra a
continuación:
public static int aleatorioDeArray(int[] a)
Esta función debe devolver un número del array escogido al azar entre todos
los disponibles. Por ejemplo, si a = {111, 222, 333, 444}, aleatorioDeArray(a)
podría devolver el 111, el 222, el 333 o el 444. Si b = {52, 37}, aleatorioDeArray(b) podría devolver el 52 o el 37. Utiliza la función en un programa de
prueba.
*/

import array.Array;
public class Eje52 {

    public static int aleatorioDeArray(int[] a){
        int aleatorio = 0;
        int pos = (int)(Math.random()*a.length);

        for (int i = 0; i < a.length; i++) {
            if(pos==i){
                aleatorio = a[i];
                break;
            }
        }

        return aleatorio;
    }
    public static void main(String[] args) {
        int[] array = Array.generaArrayInt(10, 0, 100);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }
        System.out.println();

        int aleatorio = aleatorioDeArray(array);
        System.out.println(aleatorio);
    }
}
