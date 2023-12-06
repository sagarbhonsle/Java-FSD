package sample;

public class Matrix {

	    public static void main(String[] args) {
	    	
	        // Define two matrices
	    	
	        int[][] matrix1 = {{1, 2},
	                           {4, 5}};
	        int[][] matrix2 = {{7, 8},
	                           {9, 10}};
	                          

	        // Check if the matrices are compatible for multiplication
	        
	        int rows1 = matrix1.length;
	        int cols1 = matrix1[0].length;
	        int rows2 = matrix2.length;
	        int cols2 = matrix2[0].length;

	        if (cols1 != rows2) {
	            System.out.println("Matrices are not compatible for multiplication.");
	            return;
	        }

	        // Create a new matrix to store the result
	        
	        int[][] result = new int[rows1][cols2];

	        // Perform matrix multiplication
	        
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                result[i][j] = 0;
	                for (int k = 0; k < cols1; k++) {
	                    result[i][j] += matrix1[i][k] * matrix2[k][j];
	                }
	            }
	        }

	        // Print the result matrix
	        
	        System.out.println("Resultant matrix:");
	        for (int i = 0; i < rows1; i++) {
	            for (int j = 0; j < cols2; j++) {
	                System.out.print(result[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	}

