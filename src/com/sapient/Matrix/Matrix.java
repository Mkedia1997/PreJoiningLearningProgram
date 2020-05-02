package com.sapient.Matrix;

public class Matrix {
	int m;
	int n;
	int matrix[][]; 
		
	
	public Matrix(int i, int j) {		// 1. Constructor to specify the Dimensions


		this.m = i;
		this.n = j;
		matrix = new int[m][n];
	}
	
	public Matrix() {		//		2. Default Constructor
		this.m = 3;
		this.n = 3;
		matrix = new int[m][n];
	}
	
	
	
	public Matrix(int[][] Mat) {		// 3. Constructor to adopt a given Matrix

		m = Mat.length;
		n= Mat[0].length;
		this.matrix = new int[m][n];
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				this.matrix[i][j] = Mat[i][j];
			}
		}
	}
	
	Matrix(Matrix Mat){		// 5. Copy Constructor

		this.m = Mat.m;
		this.n = Mat.n;
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				this.matrix[i][j] = Mat.matrix[i][j];
			}
		}
	}
		
	public void readMatrix() {		// 5. Read Matrix
		
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				this.matrix[i][j] = read.br.nextInt();
			}
		}
	}


	
	public void displayMatrix() {		// 6. Print Matrix
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(this.matrix[i][j] + " ");
			}
			System.out.println();
		}	
	}
	
	public Matrix addMatrix(Matrix Mat) {		// 7. Add two Matrices
		
		Matrix added_matrix = new Matrix(m,n);
		for(int i=0; i<m; i++) {
			for(int j=0; j<n; j++) {
				added_matrix.matrix[i][j] = this.matrix[i][j] + Mat.matrix[i][j];
			}
		}
		return added_matrix;
	}

	public Boolean ifScalar() {		// 8. isScalar
		int x = this.matrix[0][0];
		for(int i=0; i<m; i++) {
			
			if(this.matrix[i][i] != x) {
				return false;
			}
			for(int j=0; j<n; j++) {
				if(i!=j && this.matrix[i][j] != 0) {
					return false;	
				}
			}
		}
		return true;
		 
	}
	
	public Matrix multiplyMatrix(Matrix Mat) {		// 9. Multiply Matrix
		
		Matrix result = new Matrix(m,Mat.n);
		for(int i=0; i<m; i++) {
			for(int j=0; j<Mat.n; j++) {
				for(int k=0; k<n; k++) {
					result.matrix[i][j] += this.matrix[i][k] * Mat.matrix[k][j];
				}
			}
		}
		return result;
	}

}
