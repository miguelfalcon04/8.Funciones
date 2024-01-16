/*Ejercicio 51
Realiza un programa que rellene un array con 10 números aleatorios comprendidos entre 2 y 100 (ambos incluidos) y 
que los muestre por pantalla. A continuación, el programa indicará para cada uno de ellos si es un número
primo y/o un capicúa de la forma que muestra el ejemplo.
*/

import matematicas.Varias;
import array.Array;

public class Eje51 {
    public static void main(String[] args) {

        int[] array = Array.generaArrayInt(10, 2, 100);
        System.out.println("Array generado:");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            String txt = "";

            if(Varias.esPrimo(array[i])==true){
                txt+="El "+array[i]+" es primo";
            }else{
                txt+="El "+array[i]+" no es primo";
            }

            if(Varias.esCapicua(array[i])==true){
                txt+=" y es capicúa";
            }else{
                txt+=" y no es capicúa";
            }

            System.out.println(txt);
        }

    }
}
