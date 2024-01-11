import matematicas.Varias;

/*Ejercicio 35
Crea una función con la siguiente cabecera:
public static String convierteEnPalotes(int n)
Esta función convierte el número n al sistema de palotes y lo devuelve en una
cadena de caracteres. Por ejemplo, el 470213 en decimal es el | | | | - | | | | | |
| - - | | - | - | | | en el sistema de palotes. Utiliza esta función en un programa
para comprobar que funciona bien. Desde la función no se debe mostrar nada
por pantalla, solo se debe usar print desde el programa principal.
*/

public class Eje35 {

    public static String convierteEnPalotes(int n){
        String palotes = "";
        int volteado = Varias.voltea(n);
        int digitos = Varias.digitos(n);

        for (int i = 0; i < digitos; i++) {
            int cifra = volteado%10;
            while (cifra>0) {
                palotes+="|";
                cifra--;
            }
            if(i!=digitos-1){
                palotes+="-";
            }
            volteado/=10;
        }

        return palotes;
    }
    public static void main(String[] args) {
        System.out.print("Introduce el número a convertir al sistema de palotes: ");
        int n = Integer.parseInt(System.console().readLine());
        System.out.println(convierteEnPalotes(n));
    }
}
