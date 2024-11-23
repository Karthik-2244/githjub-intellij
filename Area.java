import java.util.Scanner;

import static java.lang.Math.PI;

public class Area {
    public static void main(String[] args) {

        System.out.println("enter length of a rectangle:");
        System.out.println("enter breadth of a rectangle:");
        System.out.println("enter radius of a circle:");
        Scanner sc = new Scanner(System.in);
        float length = sc.nextInt();
        float breadth = sc.nextInt();
        float radius= sc.nextInt();
        float area = length*breadth;
        float perimeter = 2*(length+breadth);
        float ca = (float) (PI*radius*radius);
        float circumference = (float) (2*PI*radius);
        System.out.println("length of rectangle:"+length);
        System.out.println("breadth of rectangle:"+breadth);
        System.out.println("radius of circlr:"+radius);
        System.out.println("area of rectangle:"+area);
        System.out.println("perimeter of rectangle:"+perimeter);
        System.out.println("area of circle:"+ca);
        System.out.println("circumference of circle:"+circumference);

    }
}
