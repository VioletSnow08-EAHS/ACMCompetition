import java.util.*;


public class BOGO {

    public static void main(String[] args) {

        int smallPrice = 2;
        int mediumPrice = 3;
        int largePrice = 5;

        int smallTotal = 0;
        int mediumTotal = 0;
        int largeTotal = 0;


        Scanner keyboard = new Scanner(System.in);

        System.out.print("Enter purchase: ");
        String input = keyboard.nextLine();

        List<Character> items = ACM.toCharacterList(input);

        for(Character Char : items) {
            String c = Char.toString().toUpperCase();

            switch (c) {
                case "S":
                    smallTotal++;
                    break;
                case "M":
                    mediumTotal++;
                    break;
                case "L":
                    largeTotal++;
                    break;
            }
        }
        int total = 0;

        if(smallTotal != 2) {
            total += smallTotal * smallPrice;
        } else {
            total += smallPrice;
        }
        if(mediumTotal != 2) {
            total += mediumTotal * mediumPrice;
        } else {
            total += mediumPrice;
        }
        if(largeTotal != 2) {
            total += largeTotal * largePrice;
        } else {
            total += largePrice;
        }
        System.out.println("Price: $" + total);
    }
}
