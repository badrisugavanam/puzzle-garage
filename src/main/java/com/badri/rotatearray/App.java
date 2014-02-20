package com.badri.rotatearray;

/**
 * A Warmup for the puzzle ,function to rotate an 2dArray
 * Date : 20/2/2014
 */
public class App {

    public static void main(String[] args) {
        String[][] array2d = new String[3][3];
        array2d[0][0] = "1";
        array2d[0][1] = "2";
        array2d[0][2] = "3";
        array2d[1][0] = "4";
        array2d[1][1] = "5";
        array2d[1][2] = "6";
        array2d[2][0] = "7";
        array2d[2][1] = "8";
        array2d[2][2] = "9";
        String[][] newArray = new String[3][3];
        newArray = rotateArray90(array2d);
        System.out.println(newArray);
    }

    public static String[][] rotateArray90(String[][] arraytorotate) {
        String[][] newArray = new String[3][3];
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; i <= 2; j++) {
                if (j > 2) {
                    break;
                }
                newArray[i][j] = arraytorotate[3 - j - 1][i];
            }
        }
        return newArray;
    }
}
