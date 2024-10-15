import java.io.*;
import java.util.*;
class Arraylistdemo{
    public static void main(String arggs[]){
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer>al=new ArrayList<Integer>();
        int sum=0;
        float avg=0;
        System.out.println("Enter the elements into the array list:");
        while(sc.hasNextInt()){
            al.add(sc.nextInt());
        }
        for(int i=0;i<al.size();i++){
            sum=sum+al.get(i); 
        }
        avg=(float)sum/al.size();
        System.out.println("sum of elements is"+sum);
        System.out.println("Average of elemets is"+avg);   
    }
}

