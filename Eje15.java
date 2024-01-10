import matematicas.Varias;

/*Ejercicio 15
Muestra los números primos que hay entre 1 y 1000.
*/

public class Eje15 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1000; i++) {
            if(Varias.esPrimo(i)==true){
                System.out.print(i+" ");
            }
        }
    }
}
