import java.io.*;
import java.util.*;
class CircleArea7{
    double r;
    CircleArea7(){
        r=0;
    }
    CircleArea7(double r){
        this.r=r;
    }
    CircleArea7(CircleArea7 c){
        this.r=c.r;
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
class Main7{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        CircleArea7 c1=new CircleArea7();
        System.out.println("Initially the area of 1st circle "+c1.area());
        CircleArea7 c2=new CircleArea7(7.0);
        System.out.println("Area of circle with radius 7.0 is "+c2.area());
        System.out.println("Area of circle with radius 5.5 is "+c2.area(5.5));
        CircleArea7 c3=new CircleArea7(c2);
        System.out.println("After copy constructor area of 3rd circle is "+c3.area());
        c1.setCircle(8.8);
        System.out.println("After set circle area of 1st circle is "+c1.area());
    }
}
