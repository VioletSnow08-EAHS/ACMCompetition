import java.util.*;


public class Quagga {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter dice numbers: ");
        String input = keyboard.nextLine();
        int[] numbers = ACM.toIntegerArray(input);
        boolean isWinner;

        if
        (
                ((numbers[0] * 10 + numbers[1]) % numbers[2] == 0) || ((numbers[0] * 10 + numbers[2]) % numbers[1] == 0)
                || ((numbers[1] * 10 + numbers[0]) % numbers[2] == 0) || ((numbers[1] * 10 + numbers[2]) % numbers[0] == 0)
                || ((numbers[2] * 10 + numbers[0]) % numbers[1] == 0) || ((numbers[2] * 10 + numbers[1]) % numbers[0] == 0)

        ) {
            isWinner = true;
        } else {
            isWinner = false;
        }

        for (int number : numbers) {
            if (number == 1) {
                isWinner = false;
                break;
            }
        }
        if(isWinner) {
            System.out.println("That's a QUAGGA!");
        } else {
            System.out.println("Sorry, no QUAGGA.");
        }
    }
}
