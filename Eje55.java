/*Ejercicio 55
Realiza una función que tome como parámetro un array de cadenas de caracteres y que devuelva otro array 
con los mismos valores habiendo eliminado las posibles repeticiones. Se distinguen mayúsculas de minúsculas, 
por tanto “hola” es distinto de “Hola”. Por ejemplo, si el array a contiene los valores
{“casa”, “coche”, “sol”, “mesa”, “mesa”, “coche”, “ordenador”,
“sol”, “CASA”}, la sentencia sinRepetir(a) devolvería el array {“casa”,
“coche”, “sol”, “mesa”, “ordenador”, “CASA”}. Se debe entregar tanto
el código de la función como el código de prueba que la usa. La cabecera de la
función es la siguiente:
public static String[] sinRepetir(String[] s)
*/

public class Eje55 {

    public static String[] sinRepetir(String[] s){
        String[] aux = s.clone();
        int repetidos = 0;

        for (int i = 0; i < s.length; i++) {
            for (int j = 0; j < i; j++) {
                if(s[i].equals(aux[j])){
                    repetidos++;
                    s[i]="";
                }
            }
        }

        String[] noRepite = new String[s.length-repetidos];
        int cont = 0;
        for (int i = 0; i < s.length; i++) {
            if(!s[i].equals("")){
                noRepite[cont] = s[i];
                cont++;
            }
        }

        return noRepite;
    }
    public static void main(String[] args) {
        String[] palabras = {"casa", "coche", "sol", "mesa", "mesa", "albondiga", "coche", "ordenador", "sol", "CASA", "albondiga","pera"};
        palabras = sinRepetir(palabras);
        for (int i = 0; i < palabras.length; i++) {
            System.out.print(palabras[i]+" ");
        }
    }
}
