package org.example;
import java.util.Scanner;

    public class Lessond {

        class Auto {
            public static void main(String[] args) {
                // Створення масиву для зберігання характеристик автомобілів
                String[][] cars = new String[5][4];
                // Створення об'єкту Scanner для зчитування введених даних
                Scanner input = new Scanner(System.in);

                // Цикл для заповнення масиву даними про автомобілі
                for (int i = 0; i < 5; i++) {
                    System.out.println("Введіть дані про автомобіль #" + (i + 1));
                    System.out.print("Марка: ");
                    cars[i][0] = input.nextLine();
                    System.out.print("Модель: ");
                    cars[i][1] = input.nextLine();
                    System.out.print("Рік випуску: ");
                    cars[i][2] = input.nextLine();
                    System.out.print("Тип двигуна: ");
                    cars[i][3] = input.nextLine();
                }

                // Виведення даних про всі автомобілі
                for (int i = 0; i < 5; i++) {
                    System.out.println("\nДані про автомобіль #" + (i + 1) + ":");
                    System.out.println("Марка: " + cars[i][0]);
                    System.out.println("Модель: " + cars[i][1]);
                    System.out.println("Рік випуску: " + cars[i][2]);
                    System.out.println("Тип двигуна: " + cars[i][3]);
                }

                // Запит вибору користувача для виведення характеристик певного авто
                System.out.print("\nВведіть номер автомобіля, для якого ви бажаєте отримати детальнішу інформацію: ");
                int carNum = input.nextInt();

                // Перевірка на правильність введеного номеру автомобіля
                if (carNum > 0 && carNum <= 5) {
                    // Виведення детальної інформації про обраний автомобіль
                    System.out.println("\nДетальні дані про автомобіль #" + carNum + ":");
                    System.out.println("Марка: " + cars[carNum - 1][0]);
                    System.out.println("Модель: " + cars[carNum - 1][1]);
                    System.out.println("Рік випуску: " + cars[carNum - 1][2]);
                    System.out.println("Тип двигуна: " + cars[carNum - 1][3]);
                } else {


                }
            }
        }
    }





