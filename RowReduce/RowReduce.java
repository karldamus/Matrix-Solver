package RowReduce;

/**
 * RowReduce.java 
 * Usage: App.java
 * Author: Karl Damus 
 * ©2021, All Rights Reserved
 */

public class RowReduce {
	/**
	 * DEFAULT DEV VALUES
	 */
    public static int[] defaultReturnArray = new int[0];
    public static byte[][] defaultReturnByte = new byte[0][0];
	public static boolean defaultReturnBoolean = true; 

	/**
	 * Private Finals
	 */
	private final byte[][] sampleEchelonForm = {
		{ 1,2,1,3,0 },
		{ 0,0,3,1,3 },
		{ 0,0,0,0,5 }
	};
	private final byte[][] sampleReducedEchelonForm = {
		{ 1,0,1,3 },
		{ 0,1,1,2 },
		{ 0,0,0,0 }
	};

	// main() should not be used in production
    public static void main(String[] args) {

        // todo: add user input for vectors

        byte[][] vector1 = {
			{1,2,3},
			{4,5,6},
			{2,1,0}
		};
        
        byte[][] reducedMatrix = rowEchelon(vector1);

        System.out.println(reducedMatrix);
    }

	/**
	 * @param vector1
	 * @param vector2
	 * @param vector3
	 * @return Echelon Form of Matrix
	 */
    public static byte[][] rowEchelon(byte[][] matrix) {
		System.out.println("rowEchelon() Ran");

        return defaultReturnByte;
    }

	public static byte[][] reducedRowEchelon(byte[][] matrix) {

		return defaultReturnByte;
	}

    public static int[] subtractVector(int[] vector1, int[] vector2, int scalar) {
		// usage: newVector1 = vector1 - (scalar * vector2)

        // todo: create a function that subtracts @param array2 from @param array1

        return defaultReturnArray;
    }

    public static int[] scaleVector(int[] vector, double scalar) {

        // todo: create a function that returns a vector multiplied by a @param scalar value

        return defaultReturnArray;
    }

	public static boolean isZero(int[] vector) {

		// todo: 

		return defaultReturnBoolean;
	}


    
    private void printArray(int[] array) {
        
        // todo: create a method to print an array in a human readable format
        // ? change function to incorporate byte[] format??

    }
}