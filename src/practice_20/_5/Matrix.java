package practice_20._5;

public class Matrix<N extends Integer> {
    private N[][] matrix;
    private int row;
    private int col;

    public Matrix(N[][] matr, int r, int c) {
        this.matrix = matr;
        this.row = r;
        this.col = c;
    }

    public void outputMatrix() {
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void matrixSum(Matrix mt) {
        if (this.col == mt.col && this.row == mt.row) {
            for (int i = 0; i < this.col; i++) {
                for (int j = 0; j < this.row; j++) {
//
//                    this.matrix[i][j] = this.matrix[i][j] + mt.matrix[i][j];
                }
            }
        }
        else {
            System.out.println("Размерности матриц не равны, поэлементное сложение невозможно\n");
        }
    }

    public void elementsSum() {
        float sum = 0;
        for (int i = 0; i < this.col; i++) {
            for (int j = 0; j < this.row; j++) {
                sum += this.matrix[i][j].floatValue();
            }
        }
        System.out.println(sum);
    }
}
