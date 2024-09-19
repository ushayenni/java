import java.io.*;
import java.util.*;
class CircleArea3{
    double r;
    double area(){
        return (22/7.0)*r*r;
         }
        void setCircle(double r){
           this.r=r;
        }
}
class Main3{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        CircleArea3 ob1=new CircleArea3();
        CircleArea3 ob2=new CircleArea3();
        System.out.println("Enter radius of two circles:");
        double radius1=sc.nextDouble();
        double radius2=sc.nextDouble();
        ob1.setCircle(radius1);
        ob2.setCircle(radius2);
        System.out.println("Area of 1st circle is "+ob1.area());
        System.out.println("Area of 2nd circle is "+ob2.area());
    }
}
