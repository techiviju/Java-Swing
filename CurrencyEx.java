import java.text.NumberFormat;
import java.util.*;
public class CurrencyEx{
    public static void main (String[] args) {
        double dbl=2030.212;
        NumberFormat formatter=NumberFormat.getCurrencyInstance();
        String money=formatter.format(dbl);
        System.out.println(money);
        
    }
}