public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1 ");
        var clientOS = 1;
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        }
        else if (clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }


        System.out.println("Задача 2 ");
        var clientOSS = 1;
        var  yearOS = 2018;
        if (clientOSS == 0) {

                if (yearOS >= 2015) {
                    System.out.println("Установите версию приложения для iOS по ссылке");
                } else if (yearOS <= 2015) {
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                }
        }
        else if (clientOS == 1) {
            if (yearOS >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке");
            } else if (yearOS <= 2015) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            }

        }


        System.out.println("Задача 3 ");
         var year = 2001;
         if (year % 4 ==0 && year % 100 != 0 || year % 400 == 0 ) {
                System.out.println( year + " год является високосным");
         } else {
             System.out.println( year + " год не является високосным");
         }


        System.out.println("Задача 4 ");
         var deliveryDistance = 1800;
         int deliveryDay =1;
         if (deliveryDistance >20 ){
             deliveryDay++;
         }
         if (deliveryDistance >60 ){
             deliveryDay++;
         }
        System.out.println("Потребуется дней: "+deliveryDay);


        System.out.println("Задача 4 ");
        int monthNumber = 1;
        switch (monthNumber)  {
            case 1:
                System.out.println("Januaru");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("Murch");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("july");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("There is no such month");

        }
    }
}