import java.util.Scanner;

public class NumberPuzzleSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a two-digit integer: ");
        int number = scanner.nextInt();

        NumberPuzzle puzzle = new NumberPuzzle();
        puzzle.solvePuzzle(number);
    }
}

class NumberPuzzle {
    public void solvePuzzle(int number) {
        if (number < 10 || number > 99) {
            System.out.println("Invalid number");
        } else {
            if (number > 50) {
                int digit1 = number / 10;
                int digit2 = number % 10;
                int difference = Math.abs(digit1 - digit2);
                System.out.println("Difference between digits: " + difference);
            } else {
                int reversedNumber = (number % 10) * 10 + (number / 10);
                int digit1 = reversedNumber / 10;
                int digit2 = reversedNumber % 10;
                int difference = Math.abs(digit1 - digit2);
                System.out.println("Reversed number: " + reversedNumber);
                System.out.println("Difference between digits: " + difference);
            }
        }
    }
}

