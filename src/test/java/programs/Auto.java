package programs;
import java.util.Scanner;


    public class Auto {

        public static void main(String[] args) {

            // Створення масиву для зберігання характеристик автомобілів
            String[][] cars = new String[5][6];
            cars[0] = new String[]{"BMW", "M3", "V8", "Синій", "Задній", "1"};
            cars[1] = new String[]{"Mercedes-Benz", "C-Class", "V6", "Чорний", "Передній", "2"};
            cars[2] = new String[]{"Audi", "RS7", "V8", "Червоний", "Повний", "3"};
            cars[3] = new String[]{"Porsche", "911", "Flat-6", "Білий", "Задній", "4"};
            cars[4] = new String[]{"Lamborghini", "Aventador", "V12", "Жовтий", "Повний", "5"};

            // Створення об'єкту Scanner для зчитування введених даних
            Scanner input = new Scanner(System.in);

            // Запит вибору користувача для виведення характеристик певного авто
            for (int i = 0; i < 1; i = i + 0) {
                System.out.println();
                System.out.print("Введіть номер автомобіля, для якого ви бажаєте отримати детальнішу інформацію: ");
                int carNum = input.nextInt();

                // Перевірка на правильність введеного номеру автомобіля
                if (carNum > 0 && carNum <= 5) {
                    // Виведення детальної інформації про обраний автомобіль
                    System.out.println("\nДетальні дані про автомобіль #" + carNum + ":");
                    System.out.println("Марка: " + cars[carNum - 1][0]);
                    System.out.println("Модель: " + cars[carNum - 1][1]);
                    System.out.println("Двигун: " + cars[carNum - 1][2]);
                    System.out.println("Колір: " + cars[carNum - 1][3]);
                    System.out.println("Привід: " + cars[carNum - 1][4]);
                    System.out.println("Номер автомобіля: " + cars[carNum - 1][5]);
                } else {
                    System.out.println("Ви ввели неправильний номер автомобіля.");
                }
            }
        }
    }




