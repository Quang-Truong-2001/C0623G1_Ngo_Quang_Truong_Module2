package ss03_mang.bai_tap;

public class Ex7SumDiagonal {
    public static void main(String[] args) {
        int[][] arr2D = {
                {1, 2, 3},
                {1, 5, 3},
                {1, 2, 6}
        };
        int sum = 0;
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (i == j) {
                    sum = sum + arr2D[i][j];
                }
            }
        }
        for (int i = 0; i < arr2D.length; i++) {
            for (int j = 0; j < arr2D[i].length; j++) {
                if (i + j == arr2D.length - 1) {
                    sum = sum + arr2D[i][j];
                }
            }
        }
        if (arr2D.length % 2 != 0) {
            sum = sum - arr2D[arr2D.length / 2][arr2D.length / 2];
        }
        System.out.println("Tổng các số ở đường chéo chính: " + sum);
    }
}
