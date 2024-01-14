public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию версию для IOS по ссылке");
        } else if (clientOS == 1) {
            System.out.println("Установите версию версию для Android по ссылке");
        } else {
            System.out.println("Некорректная ОС!");
        }
        System.out.println("Задание 2");
        clientOS = 0;
        int yearIssue = 2010;
        if (clientOS == 0 && yearIssue >= 2015) {
            System.out.println("Установите версию  для IOS по ссылке");
        } else if (clientOS == 0 && yearIssue < 2015) {
            System.out.println("Установите версию облегченную для IOS по ссылке");
        } else if (clientOS == 1 && yearIssue >= 2015) {
            System.out.println("Установите версию для Android по ссылке");
        } else {
            System.out.println("Установите облегченную версию для Android по ссылке");

        }
        System.out.println("Задание 3");
        int year = 2024;
        if (year > 1584 && year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("Год" + year + "высокосный");
        } else {
            System.out.println("Год" + year + "невысокосный");
        }
        System.out.println("Задание 4");
        int deliveryDistance = 95;
        int days = 1;
        if (deliveryDistance <= 20) {
            days++;
        }
        if (deliveryDistance >= 60) {
            days++;
        }
        if (deliveryDistance >100) {
            days = -1;
        }
        if (days == -1){
            System.out.println("Доставки нет");
        }else  {
            System.out.println("Потребуется дней" + days);
        }
        System.out.println("Задание 4");
        int montfNomber = 12;
        switch (montfNomber ){
            case 1,2,12:
                System.out.println("Принадлежит времени году зима");
                break;
            case 3,4,5:
                System.out.println("Принадлежит времени году весна");
                break;
            case 6,7,8:
                System.out.println("Принадлежит времени году лето");
                break;
            case 9,10,11:
                System.out.println("Принадлежит времени году осень");
                break;
            default:
                System.out.println("Такой месяц не существует");
        }

    }
}