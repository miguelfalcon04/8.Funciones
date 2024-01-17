package array;

public class ArrayBi {

    public static int[][] generaArrayBiInt(int filas, int columnas, int intervaloMin, int intervaloMax){
        int [][] array = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                array[i][j] = (int)(Math.random()*(intervaloMax-intervaloMin+1)+intervaloMin);
            }
        }

        return array;
    }

    public static int[] filaDeArrayBiInt(int[][] array, int fila){
        int[] f = new int[array[0].length];

        for (int j = 0; j < f.length; j++) {
            f[j] = array[fila][j];
        }

        return f;
    }

    public static int[] columnaDeArrayBiInt(int[][] array, int columna){
        int[] c = new int[array.length];

        for (int i = 0; i < c.length; i++) {
            c[i] = array[i][columna];
        }

        return c;
    }

    public static int[] coordenadasEnArrayBiInt(int[][] array, int n){
        int[] pos = {-1,-1};
        boolean fin = false;

        for (int i = 0; i < array.length; i++) {
            if(fin==true){
                break;
            }
            for (int j = 0; j < array.length; j++) {
                if(array[i][j]==n){
                    pos[0] = i;
                    pos[1] = j;
                    fin = true;
                }
            }
        }

        return pos;
    }

    public static boolean esPuntoDeSilla(int x[][], int i, int j) {
    
        int[] fila = filaDeArrayBiInt(x, i);
        int[] columna = columnaDeArrayBiInt(x, j);
        
        return ((Array.minimoArrayInt(fila) == x[i][j])
            && (Array.maximoArrayInt(columna) == x[i][j]));
    }

    public static int[] diagonal(int x[][], int fila, int columna, String direccion) {
    
        int elementos = 0, i, j;
        int[] diagonalAux = new int [1000];
        
        for (i = 0; i < x.length; i++) {
            for (j = 0; j < x[0].length; j++) {
                if ( (((columna - j) == (fila - i)) && (direccion.equals("nose")))
                    || (((columna - j) == (i - fila)) && (direccion.equals("neso"))) ) {
                    diagonalAux[elementos++] = x[i][j];
                }
            }
        }
    
        int[] diagonal = new int[elementos];
        for (j = 0; j < elementos; j++) {
            diagonal[j] = diagonalAux[j];
        }
    
        return diagonal;
    }

    public static int nEsimo(int[][] n, int posicion){
        int num = 0;
        int cont = 0;
        boolean captado = false;

        if(posicion>n[0].length*n.length-1){
            return -1;
        }else{
            for (int i = 0; i < n.length; i++) {
                if(captado==true){
                    break;
                }
                for (int j = 0; j < n[0].length; j++) {
                    if(posicion==cont){
                        num = n[i][j];
                        captado = true;
                        break;
                    }else{
                        cont++;
                    }
                }
            }

            return num;
        }
    }

}
