import java.util.Scanner;

public class Steel {
    public static void main(String[] args) {
        int con1=0,con2=0,con3=0;
        int grade = 0;
        //int hardness,tensile_strength;
        //float carbon_content;
        System.out.println("enter hrdness of steel:");
        System.out.println("enter carbon_content:");
        System.out.println("enter tensile_strength:");

        Scanner sc = new Scanner(System.in);
        int hardness= sc .nextInt();
        float carbon = sc.nextFloat();
        int tensile = sc.nextInt();

        //three conditions
        if(hardness>50){
            con1=1;
        }
        if(carbon<0.7){
            con2=1;
        }
        if(tensile>5600){
            con3=1;
        }
        //grade
        if(con1==0&&con2==0&&con3==0){
            grade=5;
        }
       else if(con1==1&&con2==0&&con3==0){
            grade=6;
        }
       else if(con1==1&&con3==1){
            grade=7;
        }
       else if(con2==1&&con3==1){
            grade=8;
        }
       else if(con2==1&&con3==1){
            grade=9;
        }
        else if(con1==1&&con2==1&&con3==1){
           grade=10;
        }
        System.out.println("grade is:"+grade);

    }
}
