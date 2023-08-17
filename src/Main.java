public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");

        int month = 0;
        int payment = 15000;
        int total = 0;

        while (total < 2_459_000) {
            total = total + total / 100;
            total = total + payment;
            month++;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");

        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }

        System.out.println();

        int a = 10;
        while (a >= 1) {
            System.out.print(a + " ");
            a = a - 1;
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");

        int population = 12_000_000;
        int birthrate = 17;
        int deathRate = 8;
        int growth = birthrate - deathRate;
        int year = 0;

        while (year <= 10) {
            population = population + population * growth / 1000;
            System.out.println("Год " + year + ", численность населения составляет " + population);
            year++;
        }
    }

    public static void task4() {
        System.out.println("Задача 4");

        int month = 1;
        int total = 15000;

        do {
            total = total + total * 7 / 100;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            month++;
        }
        while (total <= 12_000_000);
    }

    public static void task5() {
        System.out.println("Задача 5");

        int month = 1;
        int total = 15000;

        do {
            total = total + total * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
        while (total <= 12_000_000);
    }

    public static void task6() {
        System.out.println("Задача 6");

        int month = 1;
        int total = 15000;

        while (month <= 9 * 12) {
            total = total + total * 7 / 100;
            month++;
            if (month % 6 == 0) {
                System.out.println("Месяц " + month + ", сумма накоплений равна " + total + " рублей");
            }
        }
    }

    public static void task7() {
        System.out.println("Задача 7");
        int dayNumber = 31;
        for (int frydayNumber = 7; frydayNumber <= dayNumber; frydayNumber = frydayNumber + 7) {
            System.out.println("Сегодня пятница, " + frydayNumber + " число. Необходимо подготовить отчет");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");

        int yaer = 2023;
        int yearBefore = yaer - 200;
        int yearAfter = yaer + 100;

        for (int cometYear = 0; cometYear <= yaer + 100; cometYear = cometYear + 79) {
            if (cometYear >= yearBefore && cometYear <= yearAfter) {
                System.out.println(cometYear);
            }
        }
    }
}