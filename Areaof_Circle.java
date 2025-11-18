//area=PI*r*r
import java.util.Scanner;
public class Areaof_Circle {    
    public static void main(String[] args) {
        double PI=3.14,Area;
        int r;
        System.out.print("Enter radius:");
        Scanner x=new Scanner(System.in);
        r=x.nextInt();
        Area=PI*r*r;
        System.out.print("Area of Circle is: "+Area);
    }
}