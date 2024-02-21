import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //variable declarations
        int lastNumber, total = 0, numbersDivisibleByTwelve = 0;

        //scanner initialization and asking the user for input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        lastNumber = scanner.nextInt();

        // below 11, there are no numbers divisible by both 3 and 4
        if ( lastNumber <= 11 ) {
            System.out.print("Between 0 and " + lastNumber + ", there are no numbers divisible by both 3 and 4.");
        } else {
            for (int i = 0; i <= lastNumber; i++) {
                if (i % 3 == 0 && i % 4 == 0){
                    total += i;
                    numbersDivisibleByTwelve++;
                }
            }
            System.out.print("The average of numbers divisible by both 3 and 4 between 0 and " + lastNumber + " is " + total/numbersDivisibleByTwelve);
        }
    }
}