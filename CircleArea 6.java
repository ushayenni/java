import java.io.*;
import java.util.*;
class CircleArea6{
    double r;
    CircleArea6(){
        r=0;
    }
    CircleArea6(double r){
        this.r=r;
    }
    CircleArea6(int r){
        this.r=r;
    }
    double area(){
        return (22/7.0)*r*r;
         }
         double area(double x){
             return (22/7.0)*x*x;
         }
        void setCircle(double r){
           this.r=r;
        }
}
class Main6{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        CircleArea6 c1=new CircleArea6();
        CircleArea6 c2=new CircleArea6(3.6);
        CircleArea6 c3=new CircleArea6(5);
        System.out.println("Area of 1st circle is "+c1.area());
        System.out.println("Area of 1st circle updated is "+c1.area(8));
        System.out.println("Enter radius of circle to find the area:");
        double radius=sc.nextDouble();
        CircleArea6 c4=new CircleArea6();
        c4.setCircle(radius);
        System.out.println("Area of circle is "+c4.area());
        System.out.println("Area of second circle is "+c2.area());
        System.out.println("Area of third circle is "+c3.area());
    }
}
