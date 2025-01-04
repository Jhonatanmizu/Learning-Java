package poo;

public class Triangle {

    private double sideA = 0;
    private double sideB = 0;
    private double sideC = 0;


    public Triangle(double sideAValue, double sideBValue, double sideCValue) {
        sideA = sideAValue;
        sideB = sideBValue;
        sideC = sideCValue;
    }

    public double getSideA() {
        return sideA;
    }

    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideC(double sideC) {
        this.sideC = sideC;
    }

    public double calculateTriangleArea() {
        double result = (sideA + sideB + sideC) / 2;
        double resultSideA = result - sideA;
        double resultSideB = result - sideB;
        double resultSideC = result - sideC;
        double finalValue = Math.sqrt(result * resultSideA * resultSideB * resultSideC);
        return finalValue > 0 ? Math.floor(finalValue) : 0;
    }
}
