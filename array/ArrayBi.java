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

    

}
