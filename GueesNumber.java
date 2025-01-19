import java.util.Random;
import java.util.Scanner;
class game{
    int c=1;
    int a,b;

    public void ComputerInput(){
        Random ra = new Random();
         a =ra.nextInt(0, 100);
    }

    public void UserInput(){
        do { 
            Scanner sc = new Scanner(System.in);
            System.out.print("Guess A Number Between 0 And 100 :- ");
            b=sc.nextInt(); 
            if (a==b) {
                System.out.println("Congratulation You Won The Game");
                System.out.println("Your Score :- "+c);
            }
            else if (b>a) {
                System.out.println("Guess Number Smaller Than "+b);
            }
            else if(b<a){
                System.out.println("Guess Number Greater Than "+b);
            }
            c++;
        } while (a!=b); 
    }

    public void yourScore(){
        if(c<=3){
            System.out.println("You Are Pro !!");
        }
        else if (c<=7) {
            System.out.println("You Are Intermediate !!");
        }
        else{
            System.out.println("You Are Begineer !!");
        }
    }


}
public class GueesNumber {

    public static void main(String[] args) {
        game adi = new game();
        adi.ComputerInput();
        adi.UserInput();
        adi.yourScore();
    }
}