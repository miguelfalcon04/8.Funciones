import matematicas.Varias;

/*Ejercicio 18
Escribe un programa que pase de decimal a binario
*/

public class Eje18 {
    public static void main(String[] args) {

        System.out.print("Introduzca su número: ");
        int n = Integer.parseInt(System.console().readLine());
        int guarda = n;

        int binario = 0;
        do {
            binario = Varias.pegaPorDetras(binario, n%2);
            n/=2;
        } while (n>0);

        binario =  Varias.voltea(binario);
        System.out.printf("El %d en binario es: %d", guarda,binario);
    }
}
