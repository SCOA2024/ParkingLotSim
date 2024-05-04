import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean cont = true;
        Parking parking = new Parking();
        for (; cont; ) {
            System.out.println(
                    "\n--------------------------------------------------\n" +
                    "1. - Print Available cars\n" +
                    "2. - Park Car\n" +
                    "3. - Remove Car\n" +
                    "0. - Exit App\n"
            );

            Scanner input = new Scanner(System.in);
            char option = input.next().charAt(0);

            switch (option) {
                case '1' : {
                    parking.printAvLots();
                    break;
                }
                case '2': {
                    ///hjbdsnmc
                    break;
                }
                case '0': {
                    cont = false;
                    break;
                }
                default: {
                    System.out.println("Invalid input;");
                }
            }
        }
    }
}