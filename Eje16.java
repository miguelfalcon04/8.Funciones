import matematicas.Varias;

/*Ejercicio 16
Muestra los números capicúa que hay entre 1 y 99999.
*/

public class Eje16 {
    public static void main(String[] args) {
        for (int i = 1; i <= 99999; i++) {
            if(Varias.esCapicua(i)==true){
                System.out.print(i+" ");
            }
        }
    }
}
