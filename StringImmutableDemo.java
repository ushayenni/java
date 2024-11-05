import java.io.*;
import java.lang.*;

class StringImmutableDemo {
    public static void main(String[] args) {
        String s1 = "SASI";
        
        s1.concat("site");
        System.out.println("After concatenating s1 and \"site\": " + s1);
        
        String s2 = "USHA";
        s2 = s2.concat("YENNI");
        System.out.println("After concatenating s2 and \"YENNI\" is: " + s2);
    }
}
