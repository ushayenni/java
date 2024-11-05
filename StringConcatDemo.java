import java.io.*;
import java.lang.*;
class StringConcatDemo{
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "World";
        String s3 = s1.concat(s2);
        System.out.println("The result of s1 concat s3 is :"+s3);
        String s4="SASISITE WELCOMEHELLO";
        String s5=s4.join ("WEL",s2);
        System.out.println("After joining s1 joining is s2"+s5);
        System.out.println("Result of s1 + s2"+(s1+s2));
    }
}
