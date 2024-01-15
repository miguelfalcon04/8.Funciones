/*Ejercicio 45
Realiza un programa que pinte un valle tal como se muestra en los ejemplos. El
usuario debe introducir la altura de la figura. Podemos suponer que el usuario
introduce una altura mayor o igual a 3.
*/

public class Eje45 {

    public static String pintaValle(int alt){
        String txt = "";
        for (int i = 0; i <= alt; i++) {
            for (int j = 0; j < i; j++) {
                txt+="*";
            }
            for (int j = 0; j < (alt-i)*2; j++) {
                txt+=" ";
            }
            for (int j = 0; j < i; j++) {
                txt+="*";
            }
            txt+="\n";
        }

        return txt;
    }
    public static void main(String[] args) {
        System.out.print("Introduzca la altura de la figura: ");
        int alt = Integer.parseInt(System.console().readLine());
        System.out.print(pintaValle(alt));
    }
}
