package org.example;

import fundamentals.LogicalExpressions;
import fundamentals.LoopExpressions;
import fundamentals.StringMethods;
import fundamentals.Vectors;

public class Main {
    public static void main(String[] args) {
//        loopExpressionFunction();
//        stringMethodsFunction();
        productsVectors();
    }

    public static void loopExpressionFunction() {
        LoopExpressions loopExpressions = new LoopExpressions();
        loopExpressions.whileLoop();

    }

    public static void productsVectors() {
        Vectors newVector = new Vectors();

        int numberOfProducts = newVector.loadNumberOfProducts();
        newVector.loadProducts(numberOfProducts);
    }

    public static void canDrive() {
        LogicalExpressions logicalExpressions = new LogicalExpressions();
        logicalExpressions.main();
    }

    public static void stringMethodsFunction() {
        StringMethods.main();
    }
}