import java.util.Scanner;

public class TheaterKiosk {
    void main() {
        Scanner in = new Scanner(System.in);

        double age = 0;

        IO.print("enter your age here ");

        if (in.hasNextDouble()) {
            age = in.nextDouble();
            in.nextLine();

        if (age >= 21) {
            IO.println("you get a wrist band!");
        }

        }
    }
}
