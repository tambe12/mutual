package muth;

import java.util.Scanner;

public class muth {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of processes: ");
        int n = scanner.nextInt();

        int token = 0;

        while (true) {

            System.out.println("\n--------------------------------");
            System.out.println("Token is with Process " + token);
            System.out.print("Does Process " + token + " want to enter Critical Section? (1 = Yes, 0 = No): ");

            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println("Process " + token + " ENTERED Critical Section");

                // Critical section execution simulation
                System.out.println("Process " + token + " EXITED Critical Section");

            } else {

                System.out.println("Process " + token + " skipped Critical Section");
            }

            // Pass token to next process
            token = (token + 1) % n;

            System.out.print("\nContinue simulation? (1 = Yes, 0 = No): ");
            int cont = scanner.nextInt();

            if (cont == 0) {
                break;
            }
        }

        scanner.close();
    }
}
