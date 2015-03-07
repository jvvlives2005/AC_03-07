package nyc.c4q.jvvlives2005;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Quel age avez vous? ");
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();
        int ticketPrice;

	   // aq is at the cinema
	   if (age <= 13) {
           ticketPrice = 8;
           System.out.println("Vous payez: " + ticketPrice + " euros. ");
       }
        if (age <= 64) {
           ticketPrice = 13;
        } else {
           ticketPrice = 10;
        }
        System.out.println("Vous payez: " + ticketPrice + " euros. ");
    }
}
