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

    

}
