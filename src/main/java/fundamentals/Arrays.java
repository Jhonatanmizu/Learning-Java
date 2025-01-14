package fundamentals;

import java.util.ArrayList;

public class Arrays {


    public static void main(String[] args) {
        double[] vect = new double[10];
        ArrayList<Double> clothingList = new ArrayList<Double>();
        clothingList.add(10.0);
        System.out.println("LIST:");
        for (Double aDouble : clothingList) {
            System.out.println(aDouble);
        }
    }
}
