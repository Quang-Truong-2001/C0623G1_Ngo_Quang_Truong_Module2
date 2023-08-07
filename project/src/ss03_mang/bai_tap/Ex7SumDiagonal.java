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
                    sum = sum + arr2D[i][i];
        }
        System.out.println("Tổng các số ở đường chéo chính: " + sum);
    }
}
