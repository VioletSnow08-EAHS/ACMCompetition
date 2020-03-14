import java.util.*;

public class Quokka {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Dice: ");
        String input = keyboard.nextLine();

        List<Integer> numbers = ACM.toIntegerList(input);
        int evenNums = 0;
        int oddNums = 0;
        int evenTotal = 0;
        int oddTotal = 0;

        for(Integer number : numbers) {
            if(number % 2 == 0) {
                evenNums++;
                evenTotal += number;
            } else {
                oddNums++;
                oddTotal += number;
            }
        }

        evenTotal = evenTotal * evenNums;
        oddTotal = oddTotal * oddNums;

        int total = evenTotal + oddTotal;
        System.out.println("Profit: $" + total);
    }
}
