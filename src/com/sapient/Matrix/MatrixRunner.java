package com.sapient.Matrix;

public class MatrixRunner {
	public static void main(String[] args) {
		System.out.println("Matrix of given Size");
		Matrix m1 = new Matrix(4,3);		// Matrix of given Size
		m1.readMatrix();
		m1.displayMatrix();
		

		System.out.println("Matrix of Default Size");
		Matrix m2 = new Matrix();		// Matrix of Default Size
		m2.readMatrix();
		m2.displayMatrix();
		
		Matrix m3 = new Matrix();		// Matrix of Default Size
		m3.readMatrix();
		m3.displayMatrix();
		
					 
		Matrix m4 = m2.addMatrix(m3);
		m4.displayMatrix();
			 
		Matrix m5 = m1.multiplyMatrix(m2);
		m5.displayMatrix();		
		
		int matrix[][] = new int[3][3];

		 for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
				matrix[i][j] = i+j;
			}
		 }

		 Matrix m6 = new Matrix(matrix);		//Passing the matrix
		 m6.displayMatrix();
		
	}
}
	

