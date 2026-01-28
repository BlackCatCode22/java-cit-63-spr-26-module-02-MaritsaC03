import java.util.Scanner;

public class ReversedStrings {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Hello: ");
        String text = input.nextLine();

        StringBuilder sb = new StringBuilder(text);


        sb.reverse();


        System.out.println("olleH: " + sb.toString());
    }
}





