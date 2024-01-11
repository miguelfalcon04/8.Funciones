import matematicas.Varias;

/*Ejercicio 39
Esta función convierte los dígitos del número n en las correspondientes palabras y lo devuelve todo en una cadena de caracteres. 
Por ejemplo, el 470213 convertido a palabras sería:
cuatro, siete, cero, dos, uno, tres
*/

public class Eje39 {

    public static String convierteEnPalabras(int n){
        String palabras = "";
        int digitos = Varias.digitos(n);
        int volteado = Varias.voltea(n);
        for (int i = 0; i < digitos; i++) {
            switch (volteado%10) {
                case 0:
                    palabras+="cero";
                    break;

                case 1:
                    palabras+="uno";
                    break;

                case 2:
                    palabras+="dos";
                    break;

                case 3:
                    palabras+="tres";
                    break;

                case 4:
                    palabras+="cuatro";
                    break;

                case 5:
                    palabras+="cinco";
                    break;

                case 6:
                    palabras+="seis";
                    break;

                case 7:
                    palabras+="siete";
                    break;

                case 8:
                    palabras+="ocho";
                    break;

                case 9:
                    palabras+="nueve";
                    break;
            }
            if(i!=digitos-1){
                palabras+=", ";
            }
            volteado/=10;
        }

        return palabras;
    }
    public static void main(String[] args) {
        System.out.println("El 470213 es el: "+convierteEnPalabras(470213));
    }
}
