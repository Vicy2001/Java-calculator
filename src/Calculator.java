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
            System.out.println("3: exit"); //move to the end when other operations are added
			System.out.println("4: sin"); //move

			System.out.println("5: cos"); //adjacent side/hypothenuse; still missing, format needs to be fixed
			System.out.println("6: tan"); //opposite side/adjacent side; still missing, format needs to be fixed
            //thinking about more to put here

            int choice = scanner.nextInt();

            if (choice == 1) {

                System.out.println("What operation would you like to perform? ");
                System.out.println("+, -, /, * ");
                operation = scanner.next();

                System.out.println("Please enter your first number: ");
                first = scanner.nextDouble();

                System.out.println("Please enter your second number: ");
                second = scanner.nextDouble();

                //for the operations in basic operation
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

                //calculate area of a circle
            } else if (choice == 2) {
                System.out.println("Please enter the radius: ");
                double radius = scanner.nextDouble();
                double area = Math.PI * radius * radius;
                System.out.println("The area of a circle with a radius of " + radius + " is " + area);

		    } else if (choice == 4) {
                System.out.println("for calculating sinus please enter the hypothenuse: ");
		            double hypothenuse =  scanner.nextDouble;
		        System.out.println("now please enter the opposite side: ");
  		            double oppositeSide = scanner.nextDouble();
  		            System.out.println("The sinus is " + oppositeSide/hypothenuse);
                break;

                // if the input is not valid
            }
                //close
            } else if (choice == 3) {
                System.out.println("Ok then, calculate in your head!");
                break;

                // if the input is not valid
            } else {
                System.out.println("You have to use one of the numbers I just told you...");
            }
        }
        scanner.close();
    }
}
