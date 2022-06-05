import java.util.Scanner;

public class FindThePowerOfTwoLessThanEnteredNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please Enter a Number..:");
        int enteredNumber = scanner.nextInt();

        for (int i = 1; i <= enteredNumber; i *=2) {
            System.out.println(i);
        }
    }
}
