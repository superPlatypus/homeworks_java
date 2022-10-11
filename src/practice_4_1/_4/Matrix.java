package practice_4_1._4;

import java.util.Random;

public class Matrix {
    public int col;
    public int row;
    public int[][] value;

    public Matrix(int col, int row) {
        this.col = col;
        this.row = row;
        value = new int[row][col];
    }

    public void sum(Matrix matrix){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.value[i][j] += matrix.value[i][j];
            }
        }
    }

    public void multByNumber(int n){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                this.value[i][j] *= n;
            }
        }
    }

    public void print(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(value[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void fillRandom(){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                value[i][j] = new Random().nextInt() % 20;
            }

        }
    }



}
