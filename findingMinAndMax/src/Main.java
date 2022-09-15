import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int max = 0, min = 0;
        System.out.println("How many numbers will you enter? ");
        int pieceOfNumbers = scanner.nextInt();
        if (pieceOfNumbers == 1){
            System.out.println("The numbers should be at least 2, pls try again.");
        }else {
            for (int i = 1; i <= pieceOfNumbers; i++) {
                System.out.println("Enter number " + i + ": ");
                int number = scanner.nextInt();
                if (i == 1) {
                    max = number;
                    min = number;
                }
                if (number > max){
                    max = number;
                }
                if (number < min){
                    min = number;
                }


            }
            System.out.println("Max number is: " + max);
            System.out.println("Min number is: " + min);
        }
    }
}
