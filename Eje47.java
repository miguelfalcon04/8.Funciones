/*Ejercicio 47
Define la función convierteArrayEnString con la siguiente cabecera:
public static String convierteArrayEnString(int[] a)
Esta función toma como parámetro un array que contiene números y devuelve
una cadena de caracteres con esos números. Por ejemplo, si a = { }, convierteArrayEnString(a) devuelve “”; si a = { 8 }, 
convierteArrayEnString(a) devuelve “8”; si a = { 6, 2, 5, 0, 1 }, convierteArrayEnString(a) devuelve “62501”.
*/

public class Eje47 {

    public static String convierteArrayEnString(int[] a){
        String num = "";
        for (int i = 0; i < a.length; i++) {
            num+=String.valueOf(a[i]);
        }

        return num;
    }
    public static void main(String[] args) {
        int[] a = {8};
        String num = convierteArrayEnString(a);
        System.out.println(num);

        int[] b = {6,2,5,0,1};
        String numB = convierteArrayEnString(b);
        System.out.println(numB);
    }
}
