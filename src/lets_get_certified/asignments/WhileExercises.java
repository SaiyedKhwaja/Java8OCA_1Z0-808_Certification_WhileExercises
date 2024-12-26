package lets_get_certified.asignments;

import java.util.Scanner;

public class WhileExercises {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        thirdOrderPolynomial();

        whileAverage();

        whileGrades();

        whileHistogram();

        whileLargestSmallest();
    }

    private static void whileLargestSmallest() {
        System.out.print("Error: n must be greater than 0: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number. please try again.");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        int i = 0;
        while (i < n) {
            System.out.print("Enter a number:");
            int num = sc.nextInt();

            if (num > largest) {
                largest = num;
            }
            if (num < smallest) {
                smallest = num;
            }
            i++;
        }


        System.out.println("The largest number is: " + largest);
        System.out.println("The smallest number is: " + smallest);
    }

    private static void whileHistogram() {
        System.out.print("Enter number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = sc.nextInt();

        if (rows <= 0 || cols <= 0) {
            System.out.println("Error: The number of rows and columns must be greater than 0.");
            return;
        }

        int i = 0;
        while (i < rows) {
            int j = 0;
            while (j < cols) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }


    private static void whileGrades() {
        // Initialize counters for each grade
        int aCount = 0;
        int bCount = 0;
        int cCount = 0;
        int dCount = 0;
        int eCount = 0;
        int fCount = 0;

        String grade = "";

        while (true) {
            System.out.print("Enter a grade (a-f), or 'x' to exit: ");
            grade = sc.nextLine().toLowerCase();  // Convert input to lowercase

            if (grade.equals("x")) {
                break;
            }

            switch (grade) {
                case "a":
                    aCount++;
                    break;
                case "b":
                    bCount++;
                    break;
                case "c":
                    cCount++;
                    break;
                case "d":
                    dCount++;
                    break;
                case "e":
                    eCount++;
                    break;
                case "f":
                    fCount++;
                    break;
                default:
                    System.out.println("Invalid input. Please enter a grade between a and f, or 'x' to exit.");
                    break;
            }
        }

        System.out.println("\nGrade counts:");
        System.out.println("A's: " + aCount);
        System.out.println("B's: " + bCount);
        System.out.println("C's: " + cCount);
        System.out.println("D's: " + dCount);
        System.out.println("E's: " + eCount);
        System.out.println("F's: " + fCount);
    }

    private static void whileAverage() {
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Invalid number. please try again.");
            return;
        }

        double total = 0;

        int counter = 0;
        while (counter < n) {
            System.out.print("Enter a number: ");
            double num = sc.nextDouble();
            total += num;
            counter++;
        }

        double average = total / n;

        System.out.printf("The average is: %.2f\n", average);
    }

    private static void thirdOrderPolynomial() {

        System.out.print("Enter the coefficient a (for x^3): ");
        double a = sc.nextDouble();

        System.out.print("Enter the coefficient b (for x^2): ");
        double b = sc.nextDouble();

        System.out.print("Enter the coefficient c (for x): ");
        double c = sc.nextDouble();

        System.out.print("Enter the coefficient d (constant term): ");
        double d = sc.nextDouble();

        String cont = "yes";

        while (cont.equalsIgnoreCase("yes")) {
            System.out.print("Enter the value of x: ");
            double x = sc.nextDouble();

            //fx = ax3 + bx2 + cx + d
            double fx = a * Math.pow(x, 3) + b * Math.pow(x, 2) + c * x + d;

            System.out.printf("f(%.2f) = %.2f\n", x, fx);

            System.out.print("Do you wish to continue? (yes/no): ");
            cont = sc.next();

        }

    }
}
