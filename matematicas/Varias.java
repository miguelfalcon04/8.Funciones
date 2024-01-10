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

    /**
     *  Da la posición de la primera ocurrencia de un dígito
        dentro de un número entero. Si no se encuentra, devuelve -1.
     * @param n
     * @param digito
     * @return posición digito
     */
    public static int posicionDeDigito(int n, int digito){
        int cont = 0;
        int volteado = voltea(n);
        boolean salir = false;

        do {
            if(volteado%10==digito){
                salir = true;;
            }else{
                cont++;
                volteado/=10;
            }
        } while (volteado>0 && salir == false);

        if(salir == false){
            return -1;
        }else{
            return cont;
        }

    }

    /**
     *  Le quita a un número(n) dígitos por detrás (por la
     *  derecha).
     * @param n
     * @param digitos
     * @return Numero con - digitos cifras
     */
    public static int quitaPorDetras(int n, int digitos){
        for (int i = 0; i < digitos; i++) {
            n/=10;
        }
        return n;
    }

    /**
     *  Le quita a un número(n) dígitos por delante (por la
     *  derecha).
     * @param n
     * @param digitos
     * @return Numero con - digitos cifras
     */
    public static int quitaPorDelante(int n, int digitos){
        int num = voltea(n);
        for (int i = 0; i < digitos; i++) {
            num/=10;
        }
        num = voltea(num);

        return num;
    }

    /**
     *  Añade un dígito a un número por detrás.
     * @param n
     * @param numeroAnidar
     * @return Numero definitivo
     */
    public static int pegaPorDetras(int n, int numeroAnidar){
        int digitos = digitos(numeroAnidar);
        for (int i = 0; i < digitos; i++) {
            n*=10;
        }
        int pegado = n+numeroAnidar;

        return pegado;
    }

    /**
     *  Añade un dígito a un número por delante.
     * @param n
     * @param numeroAnidar
     * @return Numero definitivo
     */
    public static int pegaPorDelante(int n, int numeroAnidar){
        int digitos = digitos(numeroAnidar);
        int volteado = voltea(n);
        for (int i = 0; i < digitos; i++) {
            volteado*=10;
        }
        int pegado = volteado+numeroAnidar;
        pegado = voltea(pegado);
        return pegado;
    }

    /**
     * Toma como parámetros las posiciones inicial y final
     * dentro de un número y devuelve el trozo correspondiente.
     * @param n
     * @param inicio
     * @param fin
     * @return trozo de número compuesto por todos los dígitos que van desde
     *  la posición inicial a la posición final incluyendo ambos
     */
    public static int trozoDeNumero(int n, int inicio, int fin){
        int longitud = digitos(n);
        n = quitaPorDelante(n, inicio);
        n = quitaPorDetras(n, longitud - fin);
        return n;
    }

    /**
     *  Pega dos números para formar uno.
     * @param n1
     * @param n2
     * @return Un solo numero
     */
    public static int juntaNumeros(int n1, int n2){
        int numerosJuntos = pegaPorDetras(n1, n2);

        return numerosJuntos;
    }

    /**
     * Se le pasa un array y devuelve una lista con los primos que contiens
     * @param array
     * @return Lista de primos que se encuentran en un array
     */
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



}
