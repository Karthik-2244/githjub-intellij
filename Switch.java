import java.util.Scanner;

public class Switch {
    public static void main(String args[]) {
        int a, b, operator;
        System.out.println("1 - add \n, 2 - sustraction \n, 3 - multiplication \n, 4- division");
        System.out.println("choose operator :");
        Scanner sc = new Scanner(System.in);
        operator = sc.nextInt();
        System.out.println("enter first number :");
        a = sc.nextInt();
        System.out.println("enter second number :");
        b = sc.nextInt();
        int result = 0;
        switch (operator)
        {
                case 1:
                result = a + b;
                break;
                case 2:
                result = a - b;
                break;
                case 3:
                result = a * b;
                break;
                case 4:
                result = a / b;
                break;
                default:
                    System.out.println("invalid");
                    break;
            }
            System.out.println(result);
        }
    }