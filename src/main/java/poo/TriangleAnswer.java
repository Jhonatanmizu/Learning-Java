package poo;

public class TriangleAnswer {


    public static void main(String[] args) {
        Triangle triangleA = new Triangle(10, 20, 30);
        Triangle triangleB = new Triangle(30, 90, 10);
        double triangleAArea = triangleA.calculateTriangleArea();
        double triangleBArea = triangleB.calculateTriangleArea();
        if (triangleAArea > triangleBArea) {
            System.out.println(triangleAArea);
            System.out.println("TriangleA is the large one");
            return;
        }
        System.out.println(triangleBArea);
        System.out.println("TriangleB is the large one");

    }
}
