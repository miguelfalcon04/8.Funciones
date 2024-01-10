import matematicas.Varias;

/*Ejercicio 17
Escribe un programa que pase de binario a decimal.
*/

public class Eje17 {
    public static void main(String[] args) {

        System.out.print("Introduzca un numero binario (0 y 1): ");
        int n = Integer.parseInt(System.console().readLine());
        int guarda = n;

        int longitudN = Varias.digitos(n);
        int decimal = 0;
        for (int i = 0; i < longitudN; i++) {
            if(n%10==1){
                decimal+= Varias.potencia(2, i);
            }
            n/=10;
        }

        System.out.printf("El %d en decimal es: %d", guarda,decimal);
    }
}
