import java.io.*;
import java.util.*;
class CircleArea2{
    double x,y,r;
    double area(){
        return (22/7.0)*r*r;
         }
        void setCircle(double a,double b,double c){
            x=a;
            y=b;
            r=c;
        }
}
class Main2{
    public static void main(String args[]){
        CircleArea2 ob1=new CircleArea2();
        CircleArea1 ob2=new CircleArea2();
        ob1.setCircle(3.0,4.0,100.0);
        ob2.setCircle(2.0,5.0,150.0);
        System.out.println("Area of 1st circle is "+ob1.area());
        System.out.println("Area of 2nd circle is "+ob2.area());
    }
}
