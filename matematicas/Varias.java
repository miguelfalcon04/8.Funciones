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

    

}
