import matematicas.Varias;

/*Utiliza esta función en un programa para comprobar que funcionan bien. Para
que el ejercicio resulte más fácil, las repeticiones de primos se conservan; es
decir, si en el array x el número 13 se repite 3 veces, en el array devuelto
también estará repetido 3 veces. Si no existe ningún número primo en x, se
devuelve un array con el número -1 como único elemento.
*/

public class Eje36 {

    public static int[] filtraPrimos(int[] array){
        int contPrimos = 0;
        for (int i = 0; i < array.length; i++) {
            if(Varias.esPrimo(array[i])){
                contPrimos++;
            }
        }
        
        int[] primos = new int[contPrimos];
        int cont = 0;
        for (int i = 0; i < array.length; i++) {
            if(Varias.esPrimo(array[i])){
                primos[cont] = array[i];
                cont++;
            }
        }

        return primos;
    }
    public static void main(String[] args) {
        int array[] = new int[15];
        for (int i = 0; i < array.length; i++) {
            array[i]= (int)(Math.random()*100);
            if(Varias.esPrimo(array[i])){
                System.out.print("**"+array[i]+"** ");
            }else{
                System.out.print(array[i]+" ");
            }
        }

        System.out.println();

        int[] primos = filtraPrimos(array);
        System.out.println("Los primos del array son: ");
        for (int i = 0; i < primos.length; i++) {
            System.out.print(primos[i]+" ");
        }

    }
}
