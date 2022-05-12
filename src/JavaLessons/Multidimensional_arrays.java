package JavaLessons;

public class Multidimensional_arrays {
    public static void main(String[] args) {
       int[] number = {1,2,3};
        System.out.println(number[1]);
        System.out.println();
        /**
         * 1,2,3,4,5,0,-1,-2
         *
         * 156
         * 376 - [1][1] поиск по строке и столбцу число данный поиск покажет число 7 внутри 376
         * 268
         */
        // int[][] - 2-х мерный массив
        // int[][][] - 3-х мерный массив
        // int[][][][] - 4-х мерный массив и т.д. по кол-ву [] скобочек
            int[][] matrice = {{1,2,3},
                                {4,5,6},
                                {7,8,9}};
        System.out.println(matrice[2][2]);
        System.out.println(matrice[1][0]);
    }
}