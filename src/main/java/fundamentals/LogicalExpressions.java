package fundamentals;

import java.util.Scanner;

public class LogicalExpressions {

    public void main(){
        Scanner valueXScanner = new Scanner(System.in);
        Scanner valueYScanner = new Scanner(System.in);
        int valueX = 0;
        int valueY = 0;

        System.out.println("Vamos começar digite o valor inicial");
        valueX = valueXScanner.nextInt();
        System.out.println("Digite o valor secundário");
        valueY = valueYScanner.nextInt();

       boolean isValueXGreatherThanValueY = valueX >= valueY;
        System.out.println("CHECK IF IS GREATHER THAN VALUE Y");

        System.out.println("VALUE X");
        System.out.println(valueX);

        System.out.println("VALUE Y");
        System.out.println(valueY);

        System.out.println(isValueXGreatherThanValueY);

    }

}
