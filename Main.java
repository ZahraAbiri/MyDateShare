import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = scanner.nextInt();
        System.out.println("Enter month:");

        int month = scanner.nextInt();
        System.out.println("Enter day:");

        int day = scanner.nextInt();


        MyDate mydate = new MyDate();
        MyDate mydate2 = new MyDate(year,month,day);
        System.out.println("Is date validate?" + mydate.isValidDate(year, month, day));
        System.out.println("Last day of month:" + mydate.getMonthLastDay(month));
        mydate2.toString();
          System.out.println(mydate2.nextDate());
    }
}
