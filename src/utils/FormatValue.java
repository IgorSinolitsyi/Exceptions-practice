package utils;

import java.text.NumberFormat;
import java.util.Locale;

public class FormatValue {
    public static String FormatMoneyValue(double value) {
        NumberFormat numberFormat = NumberFormat.getCurrencyInstance(Locale.US);
        return numberFormat.format(value);
    }
}
