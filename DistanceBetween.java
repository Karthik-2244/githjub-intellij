import java.util.Scanner;

public class DistanceBetween {
    public static void main(String[] args) {
        System.out.println("enter a distance between two cities in km");
        Scanner sc = new Scanner(System .in);
        int km= sc.nextInt();
        double centimeter = km*100000;
        double meter = km*1000;
        double feet = km*3281;
        double inch = km*39370;
        System.out.println("distance in meter-"+meter);
        System.out.println("distance in centimeter-"+centimeter);
        System.out.println("distance in feet-"+feet);
        System.out.println("distance in inch-"+inch);


    }
}
