package org.example;

import fundamentals.LogicalExpressions;
import fundamentals.LoopExpressions;
import fundamentals.StringMethods;

public class Main {
    public static void main(String[] args) {
    canDrive();
    loopExpressionFunction();
    stringMethodsFunction();
    }

    public static void loopExpressionFunction(){
        LoopExpressions loopExpressions = new LoopExpressions();
        loopExpressions.whileLoop();

    }

    public static void canDrive(){
        LogicalExpressions logicalExpressions = new LogicalExpressions();
        logicalExpressions.main();
    }

    public static void stringMethodsFunction(){
        StringMethods.main();
    }
}