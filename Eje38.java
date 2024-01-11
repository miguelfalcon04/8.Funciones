import matematicas.Varias;

/*Ejercicio 38
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números capicúa se
conservan; es decir, si en el array x el número 505 se repite 3 veces, en el
array devuelto también estará repetido 3 veces. Si no existe ningún número
capicúa en x, se devuelve un array con el número -1 como único elemento.
*/

public class Eje38 {

    public static int[] filtraCapicuas(int[] array){
        int cuentaCapicuas = 0;
        for (int i = 0; i < array.length; i++) {
            if(Varias.esCapicua(array[i])==true){
                cuentaCapicuas++;
            }
        }

        int[] capicuas = new int[cuentaCapicuas];
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(Varias.esCapicua(array[i])==true){
                capicuas[cont] = array[i];
                cont++;
            }
        }

        return capicuas;
    }
    public static void main(String[] args) {
        int[] array = {1,2,121,90,565,120,121,777};
        System.out.println("Los numeros capicuas son: ");
        int[] capicuas = filtraCapicuas(array);
        for (int i = 0; i < capicuas.length; i++) {
            System.out.print(capicuas[i]+" ");
        }
    }
}
