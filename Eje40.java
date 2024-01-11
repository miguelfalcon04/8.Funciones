import matematicas.Varias;

/*Ejercicio 40
Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de números que contienen
7 se conservan; es decir, si en el array x el número 875 se repite 3 veces, en
el array devuelto también estará repetido 3 veces. Si no existe ningún número
que contiene 7 en el array x, se devuelve un array con el número -1 como único
elemento.
*/

public class Eje40 {

    public static int[] filtraCon7(int[] array){
        int contSietes = 0;
        for (int i = 0; i < array.length; i++) {
            if(Varias.buscaCifraEnNumero(array[i], 7)==true){
                contSietes++;
            }
        }

        int[] sietes = new int[contSietes];
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(Varias.buscaCifraEnNumero(array[i], 7)==true){
                sietes[cont] = array[i];
                cont++;
            }
        }

        return sietes;
    }
    public static void main(String[] args) {
        int[] array = {1,2, 77, 7 , 705, 007, 12, 70, 12, 1907 };
        int[] sietes = filtraCon7(array);
        System.out.println("Los numeros que contienen un 7 son: ");
        for (int i = 0; i < sietes.length; i++) {
            System.out.print(sietes[i]+" ");
        }
    }
}
