import java.util.Scanner;

public class Greater {
    public static void main(String[] args) {
        int length = 5;
        int breadth = 6;
        float area = length*breadth;
        float perimeter = 2*(length+breadth);
        if(area>perimeter)
        {
            System.out.println("area is greater tha perimeter");
        }
        else {
            System.out.println("perimeter is greater than area");
        }

        System.out.println("area of rectangle:"+ area);
        System.out.println("perimeter of rectangle:"+ perimeter);
    }
}
