package ss15_exception_debug.bai_tap;

public class Triangle {
    private int sideA;
    private int sideB;
    private int sideC;

    public Triangle(int sideA, int sideB, int sideC) throws IllegalTriangleException {
        if(sideA+sideB<=sideC||sideB+sideC<sideA||sideC+sideA<sideB){
            throw new IllegalTriangleException("Độ dài tổng 2 cạnh phái lớn hơn cạnh còn lại");
        }
        if(sideA<=0||sideB<=0||sideC<=0){
            throw new IllegalTriangleException("Độ dài cạnh phải lớn hơn 0");
        }
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }
}
