import java.util.Scanner;

public class MadnessWithMethods {

    public static void main(String[] args) {

        int num1 = getAnIntFromTheUser();
        int num2 = getAnIntFromTheUser();


        compareTwoInts(num1, num2);


        sumTwoInts(num1, num2);
    }


    public static int getAnIntFromTheUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        return number;
    }


    public static void compareTwoInts(int a, int b) {
        if (a > b) {
            System.out.println(a + " is bigger than " + b);
        } else if (b > a) {
            System.out.println(b + " is bigger than " + a);
        } else {
            System.out.println("Both numbers are equal");
        }
    }


    public static void sumTwoInts(int a, int b) {
        int sum = a + b;
        System.out.println("The sum of " + a + " and " + b + " is " + sum);
    }
}
