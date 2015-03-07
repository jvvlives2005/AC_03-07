/**Fortune Teller- Pick a Number Fortune
 * with Anthony F
 * Created by c4q-joshelynvivas on 3/7/15.
 */
import java.util.Scanner;

public class fortuneTeller {
    public static void main(String[] args){
        String[] fortune = new String [10];
        fortune[0] = "You're gonna have a great day!";
        fortune[1] = "Be Careful! You will get hurt.";
        fortune [2] = "You're screwed dude!";
        fortune [3] = "You will meet an amazing person today.";
        fortune [4] = "Be weary of the next person you meet today";
        fortune [5] = "You will not find love anytime soon";
        fortune [6] = "Get a good night's rest! You're gonna need it.";
        fortune [7] = "OMG!! You're gonna be rich!!";
        fortune [8] = "Ohh....someone is gonna get broke today!";
        fortune [9] = "You will be meet an unexpected guest.";

        Scanner input = new Scanner(System.in);

        System.out.println("Pick a number from 1 to 10");
        int number = input.nextInt();

        if(number > 10 || number < 1){
            System.out.println("Sorry, this number is not withing the range. Please use the number from 1 to 10 (Telemarketing Voice)");
        }
        else{
            System.out.println( fortune [number-1]);
        }
    }


}
