/*
*Ad-Soyad: SEMANUR BUHAN
*Öğrenci Numarası: 250541007
*/


import java.util.Scanner;
public class Exercise4_1 {

    public static void printAmerican(String day, int date, String month, int year) {
       

        System.out.println("American format: " + day + ", " + month + " " + date + ", " + year);

        
    }

    public static void printEuropean(String day, int date, String month, int year) {

        System.out.println("European format: " + date + ", " + month + " " + year + ", " + day);
    }

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);

        System.out.println("Give day:");
        String day = in.nextLine();

        System.out.println("Give date:");
        int date = in.nextInt();

        System.out.println("Give month:");
        String month = in.next();

        System.out.println("Give year:");
        int year = in.nextInt();

       printAmerican(day , date , month , year);
       printEuropean(day , date , month , year);

       in.close();      
    }
}
