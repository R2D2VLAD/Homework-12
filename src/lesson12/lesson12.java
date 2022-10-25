package lesson12;

public class lesson12 {
    public static void YearNumber() {
        int year = 1952;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не является високосным!");
        }
    }

    public static void OperatingSystem() {
        int clientOS = 3;
        int clientDevaceYear = 2023;
        if (clientOS == 0) {
            if (clientDevaceYear > 2022) {
                System.out.println("Установите lite-версию приложения для IOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для IOS по ссылке");
            }
        } else {
            if (clientDevaceYear > 2022) {
                System.out.println("Установите lite-версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        }
    }

    public static void delivery() {
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20) {
            deliveryDays++;
        }
        if (deliveryDistance > 60) {
            deliveryDays++;
        }
        System.out.println("Потребуется дней: " + deliveryDays);
    }
    public static void main(String[] args) {
        //Домашняя работа
        System.out.println("Домашняя работа");
        //Задание 1
        System.out.println("Задание 1");
        YearNumber();

        //Задание 2
        System.out.println("Задание 2");
        OperatingSystem();

        //Задание 3
        System.out.println("Задание 3");
        delivery();
        }
    }
