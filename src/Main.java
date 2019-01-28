import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Could you please write the String");
        String firstString = getOperationUserInput();
        substring( firstString);
    }
    public static String getOperationUserInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static void substring(String String) {
        int Length = String.length();
        int i=0;

        String character = "";
        do {
            character = String.substring(i,i+1);
            System.out.println("Index: " + i + ", " + " Character : " + character );
            i++;
        } while (i < Length);
    }
}