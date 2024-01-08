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

    
    /**
     * Dada una base y un exponente devuelve la potencia.
     * @param base
     * @param exponente
     * @return Potencia
     */
    public static int potencia(int base, int exponente){
        int potencia = 1;
        for (int i = 0; i < exponente; i++) {
            potencia*=base;
        }
        return potencia;
    }

    /**
     * Cuenta el número de dígitos de un número entero.
     * @param n
     * @return Cantidad de dígitos en un número
     */
    public static int digitos(int n){
        int cant = 0;
        do {
            n/=10;
            cant++;
        } while (n>0);

        return cant;
    }

    /**
     * Le da la vuelta a un número.
     * @param n
     * @return numero volteado
     */
    public static int voltea(int n){
        int volteado = 0;
        do {
            volteado = volteado*10 + n%10;
            n/=10;
        } while (n>0);

        return volteado;
    }

    /**
     *  Devuelve el dígito que está en la posición n de un número entero.
        Se empieza contando por el 0 y de izquierda a derecha
     * @param n
     * @param posicion
     * @return
     */
    public static int digitoN (int n, int posicion){
        int volteado = voltea(n);
        int digito = 0;

        for (int i = 0; i <=posicion ; i++) {
            if(i == posicion){
                digito = volteado%10;
            }else{
                volteado/=10;
            }
        }

        return digito;
    }

}
