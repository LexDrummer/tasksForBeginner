package JavaLessons;

public class Multidimensional_arrays {
    public static void main(String[] args) {
       int[] number = {1,2,3};
        System.out.println(number[1]);
        System.out.println("======================================="); // new exemple
//--------------------------------------------------------------------------------//
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
            int[][] matrice = {{1,2,3,4,5}, // {{1,2,3},
                                {4},        // {4,5,6},
                                {7,8,}};    // {7,8,9}};
        //System.out.println(matrice[2][2]);
        //System.out.println(matrice[1][0]);
        System.out.println(matrice[0][4]);
        System.out.println("======================================="); //new exemple
//--------------------------------------------------------------------------------//
        int [] number1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "Привет";
        System.out.println(strings[0][1]);
        System.out.println("======================================="); // new exemple
// --------------------------------------------------------------------------------//

        int[][] matrice1 = { {1,2,3},        // {{1,2,3},
                            {4,5,6},        // {4,5,6},
                            {7,8,9}};       // {7,8,9}};

        for(int i = 0;i<matrice1.length;i++){
            for(int j = 0;j<matrice1[i].length;j++){
                System.out.print(matrice1[i][j]+" ");
            }
            System.out.println();
        }
    }
}