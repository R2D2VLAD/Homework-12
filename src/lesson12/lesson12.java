package lesson12;

import java.time.LocalDate;

public class lesson12 {
    public static void printYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }

    public static void printOperatingSystem(int currentYear, int clientOS, int clientDevaceYear) {
        if (clientOS == 0) {
            if (clientDevaceYear >= currentYear) {
                System.out.println("Установите lite-версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else {
            if (clientDevaceYear >= currentYear && clientOS == 1) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void calculateDeliveryDays(int deliveryDistance, int deliveryDays) {
        if (deliveryDistance >= 20) {
            deliveryDays++;
        }
        if (deliveryDistance >= 60 && deliveryDistance <= 100) {
            deliveryDays++;
        } else if (deliveryDistance > 100) {
            System.out.println("Невозможно расчитать срок доставки!");
        }
        System.out.println("Потребуется дней: " + deliveryDays);
}

    public static void main(String[] args) {
        //Домашняя работа
        System.out.println("Домашняя работа");
        //Задание 1
        System.out.println("Задание 1");
        printYear(1955);

        //Задание 2
        System.out.println("Задание 2");
        int currentYear = LocalDate.now().getYear();
        int clientOS = 1;
        int clientDevaceYear = 1950;
        printOperatingSystem(currentYear, clientOS, clientDevaceYear);

        //Задание 3
        System.out.println("Задание 3");
        int deliveryDays = 1;
        int deliveryDistance = 10;
        calculateDeliveryDays(deliveryDistance, deliveryDays);

    }
    }
