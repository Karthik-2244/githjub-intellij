import java.util.Scanner;

public class Profit {
    public static void main(String[] args) {
        System.out.println("enter the cost price:");
        System.out.println("enter the selling price");
        Scanner sc = new Scanner(System.in);
        int cost_price = sc.nextInt();
        int selling_price = sc.nextInt();
        if(selling_price>cost_price)
        {
            int tp = selling_price-cost_price;
            System.out.println("he got profit"+" "+tp);
        }
        else
        {
            int tl=cost_price-selling_price;
            System.out.println("he got loss"+" "+ tl);
        }

    }
}
