package Step3;

public class ToeplitzMatrix766 {
	public boolean isToeplitzMatrix(int[][] matrix) {
		int sizeRow = matrix.length;
		int sizeCol = matrix[0].length;
		for (int i = 0; i < sizeRow - 1; i++) {
			int ins = matrix[i][0];
			for (int m = 1; m < sizeCol && m < sizeRow - i ; m++) {
				if (matrix[i + m][m] != ins)
					return false;
			}

		}

		for (int i = 1; i < sizeCol - 1; i++) {
			int ins = matrix[0][i];
			for (int m = 1; m < sizeCol - i && m < sizeRow; m++) {
				if (matrix[m][m+i] != ins)
					return false;
			}

		}
		return true;
	}
}
