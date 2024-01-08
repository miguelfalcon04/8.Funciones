package array;

public class Array {

    /**
     *  Genera un array de tamaño n con números aleatorios
        cuyo intervalo (mínimo y máximo) se indica como parámetro
     * @param tamaño
     * @param intervaloMin
     * @param intervaloMax
     * @return Array con los valores especificados
     */
    public static int[] generaArrayInt(int tamaño, int intervaloMin, int intervaloMax){
        int[] array = new int[tamaño];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random()*(intervaloMax-intervaloMin)+intervaloMin);
        }

        return array;
    }

    /**
     * Busca el valor minimo dentro de un array
     * @param array
     * @return el valor minimo
     */
    public static int minimoArrayInt(int[] array){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]<min){
                min = array[i];
            }
        }

        return min;
    }

    /**
     * Busca el valor maximo dentro de un array
     * @param array
     * @return el valor maximo
     */
    public static int maximoArrayInt(int[] array){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < array.length; i++) {
            if(array[i]>max){
                max = array[i];
            }
        }

        return max;
    }

    /**
     * Hace la media de los numeros que hay en el array
     * @param array
     * @return La media de todos los numeros
     */
    public static int mediaArrayInt(int[] array){
        int suma = 0;
        for (int i = 0; i < array.length; i++) {
            suma+=array[i];
        }
        int media = suma/array.length;

        return media;
    }

    /**
     *  Dice si un número está o no dentro de un array.
     * @param array
     * @param n
     * @return false si no esta / true si esta
     */
    public static boolean estaEnArrayInt(int[] array, int n){
        boolean esta = false;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==n){
                esta = true;
            }
        }

        return esta;
    }

    /**
     *  Busca un número en un array y devuelve la posición
        (el índice) en la que se encuentra.
     * @param array
     * @param n
     * @return indice en el que se encuentra dicho numero
     */
    public static int posicionEnArray(int[] array, int n){
        if(estaEnArrayInt(array, n)==false){
            return -1;
        }else{
            int pos = -1;
            for (int i = 0; i < array.length; i++) {
                if(array[i]==n){
                    pos = i;
                }
            }

            return pos;
        }
    }

    /**
     * Le da la vuelta a un array
     * @param array
     * @return array volteado
     */
    public static int[] volteaArrayInt(int[] array){
        int[] volteado = new int[array.length];

        for (int i = 0; i < volteado.length; i++) {
            volteado[i] = array[array.length-i-1];
        }

        return volteado;
    }

    /**
     *  Rota n posiciones a la derecha los números de
        un array.
     * @param array
     * @param veces
     * @return
     */
    public static int[] rotaDerechaArrayInt(int[] array, int veces){
        int longitud = array.length;
        int[] arrayRotado = new int[longitud];

        for (int i = 0; i < veces; i++) {
            if (i!=0) {
                for (int j = 0; j < arrayRotado.length; j++) {
                    array[j] = arrayRotado[j];
                }
            }
            for (int k = 0; k < longitud; k++) {
                if(k==longitud-1){
                    arrayRotado[0] = array[longitud-1];
                }else{
                    arrayRotado[k+1] = array[k];
                }
            }
        }

        return arrayRotado;
    }

    /**
     *  Rota n posiciones a la izquierda los números de
        un array.
     * @param array
     * @param veces
     * @return
     */
    public static int[] rotaIzquierdaArrayInt(int[] array, int veces){
        int longitud = array.length;
        int[] arrayRotado = new int[longitud];

        for (int i = 0; i < veces; i++) {
            if (i!=0) {
                for (int j = 0; j < arrayRotado.length; j++) {
                    array[j] = arrayRotado[j];
                }
            }
            for (int k = 0; k < longitud; k++) {
                if(k==0){
                    arrayRotado[longitud-1] = array[0];
                }
                if(k!=longitud-1){
                    arrayRotado[k] = array[k+1];
                }
            }
        }

        return arrayRotado;
    }

    /**
     * Escoge un numero aleatorio de un array
     * @param a
     * @return numero aleatorio del array
     */
    public static int aleatorioDeArray(int[] a){
        int aleatorio = 0;
        int pos = (int)(Math.random()*a.length);

        for (int i = 0; i < a.length; i++) {
            if(pos==i){
                aleatorio = a[i];
                break;
            }
        }

        return aleatorio;
    }

    /**
     *  Da un array de enteros
     * @param a
     * @return El valor del array en forma de String
     */
    public static String convierteArrayEnString(int[] a){
        String num = "";
        for (int i = 0; i < a.length; i++) {
            num+=String.valueOf(a[i]+" ");
        }

        return num;
    }

    /**
     *  Da un String de numeros
     * @param s
     * @return Un array de numeros 
     */
    public static int[] convierteStringEnArray(String s){
        int cantNum = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)==' '){
                cantNum++;
            }
        }

        int[] array = new int[cantNum];
        String numero = "";
        int cont = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i)!=' '){
                numero+=s.charAt(i);
            }
            if(s.charAt(i)==' '){
                array[cont] = Integer.valueOf(numero);
                cont++;
                numero="";
            }
        }

        return array;
    }
}
