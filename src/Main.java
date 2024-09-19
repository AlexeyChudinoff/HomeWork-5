public class Main {

  public static void main(String[] args) {

    System.out.println(" Задача 1");
    int clientOs = 0;
    if (clientOs == 0) {
      System.out.println("Установите версию приложения для iOS по ссылке");
    } else {
      System.out.println("Установите версию приложения для Android по ссылке");
    }
    System.out.println(" Задача 2");
    int clientDeviceYear = 2014;
    switch (clientOs) {
      case 0:
        if (clientDeviceYear >= 2015) {
          System.out.println("Установите версию приложения для IOS по ссылке:");
        } else {
          System.out.println("Установите облегченную версию приложения для iOS по ссылке:");
        }
        break;
      case 1:
        if (clientDeviceYear >= 2015) {
          System.out.println("Установите версию приложения для Android по ссылке:");
        } else {
          System.out.println("Установите облегченную версию приложения для Android по ссылке:");
        }
        break;
      default:
        System.out.println("Такая OS  не поддерживается ");
    }
    System.out.println(" Задача 3");
    int ferstVisokosYear = 1584;
    int year = 2021;
    if (year < ferstVisokosYear) {
      System.out.println("Система исчисления високосности ещё не применялась");
    } else if (year % 4 != 0) {
      System.out.println(" не високосный год не делится на 4");
    } else if (year % 400 == 0) {
      System.out.println(" високосный год (делится на 400)");
    } else if (year % 100 == 0) {
      System.out.println(
          " не високосный год (делится на 100, но не на 400)");
    } else {
      System.out.println(
          " високосный (не делится на 100, но делится на 4)");
    }
    System.out.println(" Задача 4");
    int deliveryDistance = 95;
    int delyveryTimes = 1;
    if (deliveryDistance < 20) {
      System.out.println("Срок доставки : " + delyveryTimes + " день");
    } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
      System.out.println("Срок доставки : " + (delyveryTimes + 1) + " дня");
    } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
      System.out.println("Срок доставки : " + (delyveryTimes + 2) + " дня");
    } else {
      System.out.println("извините, доставка не осуществляется");
    }






  }
}


