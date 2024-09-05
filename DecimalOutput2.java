import java.text.DecimalFormat;
public class FormattedOutput2 {
    public static void main(String[] args) {
        double x = 123.456;
        System.out.printf("The number is: %.2f%n", x);
        DecimalFormat df = new DecimalFormat("####");
        System.out.println("Without fractional part the number is: " + df.format(x));
        df = new DecimalFormat("###");
        System.out.println("Formatted number without fractional part: " + df.format(x));
        df = new DecimalFormat("Dollar ###,###.##");
        System.out.println("After formatting the value is: " + df.format(x));
    }
}
