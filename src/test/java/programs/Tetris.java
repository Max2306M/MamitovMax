package programs;

import java.util.Random;
import java.util.Scanner;

public class Tetris {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                Random random = new Random();
                int number = random.nextInt(100) + 1;
                int guess = 0;
                int numGuesses = 0;

                System.out.println("Вгадай число від 1 до 100");

                while (guess != number) {
                    System.out.print("Введіть свій варіант: ");
                    guess = scanner.nextInt();
                    numGuesses++;

                    if (guess < number) {
                        System.out.println("Більше");
                    } else if (guess > number) {
                        System.out.println("Менше");
                    }
                }

                System.out.println("Вітаємо! Ви вгадали число за " + numGuesses + " спроб!");
            }
        }