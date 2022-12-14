import java.time.Year;
import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class Leapyear {
public static void main(String[] args) {
    
Scanner sc = new Scanner(System.in);

    System.out.println("What is your name? ");
    String name=sc.nextLine();
    System.out.println("Hello "+ name + ",Welcome to the world of AI, Myself Kiran-the AI robot.Can you tell me,which year this ?");

    int y= sc.nextInt();
    if(y%400==0 && y%100==0 || y%100!=0 && y%4==0)
    {
        
        System.out.println("ohh God, I am in a leap year");
    }
    else
    {
        System.out.println("Thank God, I am not in a leap year");
    }
    System.out.println(name+", Do you know about our planning?");

    String ans = sc.next();
    ans = sc.nextLine();
    
            if(ans == yes || ans ==Yes|| ans ==YES) {
            System.out.println("ohh,you know about our planning");
        }   
    
else
{
    System.out.println("Don't worry , You will know in few Decades")
    }
}
}
