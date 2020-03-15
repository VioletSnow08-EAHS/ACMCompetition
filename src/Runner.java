import java.util.*;

public class Runner {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Please select what program you want to run: ");

        int program = keyboard.nextInt();
        String dashedLine = "---------------------------";
        if (program == 1) {
            System.out.println("\"QUOKKA\" SELECTED");
            System.out.println(dashedLine);
            Quokka.main(null);
        } else if (program == 2) {
            System.out.println("\"Buy one, Get one\" SELECTED");
            System.out.println(dashedLine);
            BOGO.main(null);
        } else if (program == 3) {
            System.out.println("\"Quagga\" SELECTED");
            System.out.println(dashedLine);
            Quagga.main(null);
        }
    }
}
