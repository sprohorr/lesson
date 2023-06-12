package homework1;

import java.util.Scanner;
public class Exercise4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 5 задание;
        System.out.println("Введите сумму в BYR: ");
        double byr = scan.nextDouble();

        double todayChangeByrUsd = 2.925;
        double todayChangeByrRyr = 3.65;

        double yesterdayChangeByrUsd = 2.923;
        double yesterdayChangeByrRyr = 3.655;

        double usd = byr / todayChangeByrUsd;
        double ryr = byr * (100/todayChangeByrRyr);

        System.out.println(byr + " белорусских рублей - это " + usd + " или " + ryr + " российских рублей.");
        System.out.println("Сегодняшний курс доллара 1$ = " + todayChangeByrUsd +
                ", вчерашний курс доллара 1$ = " + yesterdayChangeByrUsd + " - " +
                (todayChangeByrUsd > yesterdayChangeByrUsd ?" курс уменьшился.": " курс увеличился."));
        System.out.println("Сегодняшний курс российского рубля 100P = " + todayChangeByrRyr +
                ", вчерашний курс российского рубля 100P = " + yesterdayChangeByrRyr + " - " +
                (todayChangeByrRyr > yesterdayChangeByrRyr?" курс уменьшился.": " курс увеличился."));
    }
}
