/*Ejercicio 50
Define la función mezcla con la siguiente cabecera:
public static int[] mezcla(int[] a, int[] b)
Esta función toma dos arrays como parámetros y devuelve un array que es
el resultado de mezclar los números de ambos de forma alterna, se coge un
número de a, luego de b, luego de a, etc. Los arrays a y b pueden tener
longitudes diferentes; por tanto, si se terminan los números de un array se
terminan de coger todos los que quedan del otro.
*/

public class Eje50 {

    public static int[] mezcla (int[] a, int[] b){
        int[] mezclados = new int[a.length+b.length];

        int contA = 0;
        int contB = 0;
        for (int i = 0; i < mezclados.length; i++) {
            if(i%2==0 && contA<a.length){
                mezclados[i] = a[contA];
                contA++;
            }else{
                if(contB>=b.length){
                    mezclados[i] = a[contA];
                    contA++;
                }else{
                    mezclados[i] = b[contB];
                    contB++;
                }
            }
        }

        return mezclados;
    }
    public static void main(String[] args) {
        int[] a = {8,9,0}; int[] b = {1,2,3};
        int[] mezclaAB = mezcla(a, b);
        for (int i = 0; i < mezclaAB.length; i++) {
            System.out.print(mezclaAB[i]+" ");
        }

        System.out.println();

        int[] c = {4,3}; int[] d = {7,8,9,10};
        int[] mezclaCD = mezcla(c, d);
        for (int i = 0; i < mezclaCD.length; i++) {
            System.out.print(mezclaCD[i]+" ");
        }

        System.out.println();

        int[] e = {8,9,0,3}; int[] f = {1};
        int[] mezclaEF = mezcla(e, f);
        for (int i = 0; i < mezclaEF.length; i++) {
            System.out.print(mezclaEF[i]+" ");
        }

        System.out.println();

        int[] g = {}; int[] h = {1,2,3};
        int[] mezclaGH = mezcla(g, h);
        for (int i = 0; i < mezclaGH.length; i++) {
            System.out.print(mezclaGH[i]+" ");
        }

        System.out.println();
    }
}
