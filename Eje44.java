/*Ejercicio 44
Realiza un programa que pinte un triángulo hueco tal como se muestra en los
ejemplos. El usuario debe introducir la altura de la figura. Utiliza funciones para
pintar las líneas.
*/

public class Eje44 {

    public static String pintaTrianguloInversoVacio(int altura, char caracter){
        String triangulo = "";
        for (int i = 0; i < altura; i++) {
            for (int j = 0; j < i; j++) {
                triangulo+=" ";
            }
            for (int j = 0; j < altura-i; j++) {
                if(j==0 || j==altura-i-1 || i==0){
                    triangulo+=caracter;
                }else{
                    triangulo+=" ";
                }
            }
            triangulo+="\n";
        }

        return triangulo;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la figura: ");
        int alt = Integer.parseInt(System.console().readLine());
        System.out.println(pintaTrianguloInversoVacio(alt, '*'));
    }
}
