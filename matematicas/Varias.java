package matematicas;

public class Varias {

    /**
     *  Devuelve verdadero si el número que se pasa como parámetro es capicúa 
     *  y falso en caso contrario.
     * @param n
     * @return esCapicua
     */
    public static boolean esCapicua(int n){
        if(n == voltea(n)){
            return true;
        }else{
            return false;
        }
    }

    /**
     *  Devuelve verdadero si el número que se pasa como parámetro
     *  es primo y falso en caso contrario.
     * @param n
     * @return esPrimo
     */
    public static boolean esPrimo(int n){
        boolean esPrimo = true;
        for (int i = 2; i < n/2+1; i++) {
            if(n%i==0){
                esPrimo = false;
            }
        }

        return esPrimo;
    }

    
    /**
     *  Devuelve el menor primo que es mayor al número que
        se pasa como parámetro
     * @param n
     * @return
     */
    public static int siguientePrimo(int n){
        boolean salir = false;
        do {
            n++;
            if(esPrimo(n)){
                salir = true;
            }
        } while (salir==false);

        return n;
    }

}
