/*Ejercicio 41
Realiza un programa que pinte un triángulo relleno tal como se muestra en
los ejemplos. El usuario debe introducir la altura de la figura. Este ejercicio
ya se realizó en el tema de bucles, ahora se trata de usar una función para
que la implementación sea más sencilla. Por ejemplo, se puede crear una
función linea(char caracter, int repeticiones) que pinte una línea con el carácter
especificado.
*/

public class Eje41 {

    public static String pintaTrianguloInversoRelleno(int altura, char caracter){
        String triangulo = "";
        for (int i = 0; i < altura; i++) {
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
