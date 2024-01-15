/*Ejercicio 43
Realiza un programa que pinte un triángulo relleno tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas.
*/

public class Eje43 {

    public static String pintaTrianguloInversoRelleno(int altura, char caracter){
        String triangulo = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                triangulo+=" ";
            }
            for (int j = 0; j < altura-i; j++) {
                triangulo+=caracter;
            }
            triangulo+="\n";
        }

        return triangulo;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la figura: ");
        int alt = Integer.parseInt(System.console().readLine());
        System.out.println(pintaTrianguloInversoRelleno(alt, '*'));
    }
}
