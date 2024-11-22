import java.util.Scanner;

public class Matchstick {
    public static void main(String[] args) {
        int c=0,p=0;
       int match_sticks=21;
        while(match_sticks>1) {
            System.out.println("  pick less than 5 matchsticks:");
            Scanner sc = new Scanner(System.in);
            p = sc.nextInt();
            if (p>0)
            match_sticks = match_sticks - p;
            System.out.println("print the number of match_sticks left:" + match_sticks);
            c = 5 - p;
            System.out.println("enter the computer picks:" + c);
            match_sticks = match_sticks - c;
            System.out.println("print the number of match_sticks left:" + match_sticks);
                if (match_sticks==1) {
                    System.out.println("enter the match_sticks left" + match_sticks);
                    System.out.println("you loose the game");
                    break;
                }

        }
    }
}
