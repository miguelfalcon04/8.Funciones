import matematicas.Varias;

/*Ejercicio 37
Crea una función con la siguiente cabecera:
public String convierteEnMorse(int n)
Esta función convierte el número n al sistema Morse y lo devuelve en una
cadena de caracteres. Por ejemplo, el 213 es el . . _ _ _ . _ _ _ _ . . . _ _ en
Morse. Utiliza esta función en un programa para comprobar que funciona bien.
Desde la función no se debe mostrar nada por pantalla, solo se debe usar print
desde el programa principal.
*/

public class Eje37 {

    public static String convierteMorse(int n){
        String morse = "";
        int volteado = Varias.voltea(n);
        int digitos = Varias.digitos(n);

        for (int i = 0; i < digitos; i++) {
            switch (volteado%10) {
                case 0:
                    morse+="_ _ _ _ _ ";
                    break;

                case 1:
                    morse+=". _ _ _ _ ";
                    break;

                case 2:
                    morse+=" . . _ _ _ ";
                    break;

                case 3:
                    morse+=" . . . _ _ ";
                    break;

                case 4:
                    morse+=" . . . . _ ";
                    break;

                case 5:
                    morse+=" . . . . .  ";
                    break;

                case 6:
                    morse+="_ . . . . ";
                    break;

                case 7:
                    morse+=" _ _ . . . ";
                    break;

                case 8:
                    morse+=" _ _ _ . . ";
                    break;

                case 9:
                    morse+="_ _ _ _ . ";
                    break;
            }
            volteado/=10;
        }
        return morse;
    }

    public static void main(String[] args) {
        System.out.println("El 213 en codigo morse es: "+ convierteMorse(213));
    }
}
