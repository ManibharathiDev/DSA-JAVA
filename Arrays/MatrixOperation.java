package Arrays;

import java.util.Scanner;

public class MatrixOperation {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        Matrix A = new Matrix(5,4);
        A.input(s);
        A.print();
        // Matrix B = new Matrix(5, 4);
        // B.input(s);
        // B.print();1

        // Matrix c1 = A.add(B);
        // System.out.println("Addition");
        // c1.print();
        // Matrix c2 = A.subtract(B);
        // System.out.println("Subtract");
        // c2.print();
        Matrix c3 = A.transpose();
        System.out.println("Transpose");
        c3.print();

    }
}

class Matrix{
    int rows;
    int cols;
    int[][] arr;
	// Define constructor here
    Matrix(int rows, int cols)
    {
        this.rows = rows;
        this.cols = cols;
        this.arr = new int[rows][cols];
    }
	
	
	void input(Scanner sc){
	    // Use the Scanner object passed as argument for taking input and not a new Scanner object
		// Complete the function
        //Scanner sc = new Scanner(System.in);
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
		
	}
	
	Matrix add(Matrix x){
		// Complete the function
        Matrix add = new Matrix(rows,cols);
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                add.arr[i][j] = this.arr[i][j]+x.arr[i][j];
            }
        }
        return add;
	}
	
	Matrix subtract(Matrix x){
		// Complete the function
		Matrix sub = new Matrix(rows,cols);
        for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                sub.arr[i][j] = this.arr[i][j]-x.arr[i][j];
            }
        }
        return sub;
	}
		
	Matrix transpose(){
		// Complete the function
        Matrix trans = new Matrix(cols,rows);
        for(int i = 0; i < trans.arr.length; i++)
        {
            for(int j = 0; j < trans.arr[i].length; j++)
            {
                trans.arr[i][j] = this.arr[j][i];
            }
        }
        return trans;
		
	}
	
	void print(){
		// Complete the function
		for(int i = 0; i < rows; i++)
        {
            for(int j = 0; j < cols; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println("");
        }
	}
}
