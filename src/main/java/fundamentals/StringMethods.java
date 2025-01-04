package fundamentals;

public class StringMethods {

    public static void main(){
        String originalString = "Something is happening";

        String originalToLowerCase = originalString.toLowerCase();
        String originalToUpperCase = originalString.toUpperCase();
        System.out.println("TO LOWER CASE : " + originalToLowerCase);
        System.out.println("TO UPPER CASE : " + originalToUpperCase);
        System.out.println("ORIGINAL :" + originalString);
    }
}
