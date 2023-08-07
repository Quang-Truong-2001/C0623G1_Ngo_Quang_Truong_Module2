package ss04_oop.bai_tap;

import ss03_mang.bai_tap.Ex1DeleteAnElement;

import java.util.Scanner;

public class Ex1QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số A:");
        int numberA = scanner.nextInt();
        System.out.println("Nhập số B:");
        int numberB = scanner.nextInt();
        System.out.println("Nhập số C:");
        int numberC = scanner.nextInt();
        if (numberA != 0) {
            Ex1QuadraticEquation one = new Ex1QuadraticEquation(numberA, numberB, numberC);
            float denta = one.getDiscriminant(numberA, numberB, numberC);
            if (denta > 0) {
                double r1 = one.getRoot1(denta);
                double r2 = one.getRoot2(denta);
                System.out.println("Phương trình có 2 nghiệm phân biệt");
                System.out.println("r1 = " + r1);
                System.out.println("r2 = " + r2);
            } else if (denta == 0) {
                System.out.println("Phương trình có một nghiệm");
                float r = -numberB / 2 * numberA;
                System.out.println("r1 = r2 = " + r);
            } else {
                System.out.println("The equation has no roots");
            }
        }
    }

    private int numberA;
    private int numberB;
    private int numberC;

    public Ex1QuadraticEquation(int numberA, int numberB, int numberC) {
        this.numberA = numberA;
        this.numberB = numberB;
        this.numberC = numberC;
    }

    public int getNumberA() {
        return numberA;
    }

    public void setNumberA(int numberA) {
        this.numberA = numberA;
    }

    public int getNumberB() {
        return numberB;
    }

    public void setNumberB(int numberB) {
        this.numberB = numberB;
    }

    public int getNumberC() {
        return numberC;
    }

    public void setNumberC(int numberC) {
        this.numberC = numberC;
    }

    public float getDiscriminant(int numberA, int numberB, int numberC) {
        float denta = numberB * numberB - 4 * numberA * numberC;
        return denta;
    }

    public double getRoot1(float denta) {
        double r1 = (-numberB + Math.sqrt(denta)) / 2 * numberA;
        return r1;
    }

    public double getRoot2(float denta) {
        double r2 = (-numberB - Math.sqrt(denta)) / 2 * numberA;
        return r2;
    }
}
