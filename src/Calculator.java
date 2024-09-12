import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        double first, second, result;
        String operation;

        Scanner scanner = new Scanner(System.in);

        while (true) {

            System.out.println("What would you like to do? Choose one: ");
            System.out.println("1: basic operations");
            System.out.println("2: calculate area (circle)");
            System.out.println("3: exit"); //needs to be moved to the end
            System.out.println("4: sin");
            System.out.println("5: cos");
            System.out.println("6: tan");
            // more asap

            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println("What operation would you like to perform? ");
                System.out.println("+, -, /, * ");
                operation = scanner.next();

                System.out.println("Please enter your first number: ");
                first = scanner.nextDouble();

                System.out.println("Please enter your second number: ");
                second = scanner.nextDouble();

                switch (operation) {
                    case "+":
                        result = first + second;
                        System.out.println("Result: " + result);
                        break;

                    case "-":
                        result = first - second;
                        System.out.println("Result: " + result);
                        break;

                    case "*":
                        result = first * second;
                        System.out.println("Result: " + result);
                        break;

                    case "/":
                        if (second != 0) {
                            result = first / second;
                            System.out.println("Result: " + result);
                        } else {
                            System.out.println("Error: can't divide by zero");
                        }
                        break;

                    default:
                        System.out.println("Invalid operation.");
                }

            } else if (choice == 2) {
                System.out.println("Please enter the radius: ");
                double radius = scanner.nextDouble();
                double area = Math.PI * radius * radius;
                System.out.println("The area of a circle with a radius of " + radius + " is " + area);

            } else if (choice == 4) {
                System.out.println("For calculating sinus please enter the hypotenuse: ");
                double hypotenuse = scanner.nextDouble(); // hier den Methodenaufruf korrigiert
                System.out.println("Now please enter the opposite side: ");
                double oppositeSide = scanner.nextDouble();
                System.out.println("The sinus is: " + (oppositeSide / hypotenuse));

            } else if (choice == 3) {
                System.out.println("Ok then, calculate in your head!");
                break;

            } else {
                System.out.println("You have to use one of the numbers I just told you...");
            }
        }
        scanner.close();
    }
}