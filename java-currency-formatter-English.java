import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat us=NumberFormat.getCurrencyInstance(Locale.US);
        NumberFormat india=NumberFormat.getCurrencyInstance(new Locale("en","in"));
        NumberFormat china=NumberFormat.getCurrencyInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        

        String us1=us.format(payment);
        String india1=india.format(payment);
        String china1=china.format(payment);
        String france1=france.format(payment);
        
        System.out.println("US: " + us1);
        System.out.println("India: " + india1);
        System.out.println("China: " + china1);
        System.out.println("France: " + france1);
    }
}




Link:--


https://docs.oracle.com/javase/8/docs/api/java/text/NumberFormat.html


/*
for India like this

 float amount = 100000;

  NumberFormat formatter = NumberFormat.getCurrencyInstance(new Locale("en", "IN"));

  String moneyString = formatter.format(amount);

  System.out.println(moneyString);
The output will be , Rs.100,000.00 .

another way

 NumberFormat india  = NumberFormat.getCurrencyInstance(indiaLocale);
 
 

*/
