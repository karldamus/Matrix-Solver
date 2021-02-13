/**
 * RowReduce.java
 * Author: Karl Damus
 * Copyright 2021, All Rights Reserved
 */

public class RowReduce {
    public static int[] defaultReturnArray = new int[0]; // this is a default value --> will be removed in production
    public static void main(String[] args) {

        // todo: add user input for vectors

        int[] vector1 = {1,2,3};
        int[] vector2 = {4,5,6};
        int[] vector3 = {2,1,0};
        
        int[] reducedMatrix = rowReduceMatrix(vector1, vector2, vector3);

        System.out.println(reducedMatrix);
    }

    public static int[]  rowReduceMatrix(int[] vector1, int[] vector2, int[] vector3) {
        System.out.print("Vector 1 => ");
        for (int i : vector1) {
            System.out.print(i);
        }
        System.out.println();

        return defaultReturnArray;
    }

    public static int[] subtractOneVectorFromAnother(int[] array1, int[] array2) {

        // todo: create a function that subtracts @param array2 from @param array1

        return defaultReturnArray;
    }

    public static int[] scaleOneVector(int[] vector1, double scalar) {

        // todo: create a function that returns a vector multiplied by a @param scalar value

        return defaultReturnArray;
    }
    
    private void printArray(int[] array) {
        
        // todo: create a method to print an array in a human readable format
        // ? change function to incorporate byte[] format??

    }
}
