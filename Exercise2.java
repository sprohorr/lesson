package homework1;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите имя водителя: ");
        String name = scan.nextLine();

        System.out.println("Введите наличие прав: 0-yes/1-no");
        byte in = scan.nextByte();
        String license = (in == 0) ? "yes" : "no";

        System.out.println("Введите категорию прав: ");
        char category = scan.next().charAt(0);

        System.out.println("Введите номер автомобиля: ");
        int numberAuto = scan.nextInt();

        System.out.println("Введите марку автомобиля: ");
        String brandAuto = scan.next();

        System.out.println("Введите стоимость за оказание водительских услуг: ");
        double price = scan.nextDouble();



        System.out.println("Имя: " + name);
        System.out.println("Наличие прав: " + license);
        System.out.println("Категория прав: " + category);
        System.out.println("Номер автомобиля: " + numberAuto);
        System.out.println("Марка автомобиля: " + brandAuto);
        System.out.println("Цена за оказание водительских услуг: " + price + " руб. за 1 км.");
    }
}
