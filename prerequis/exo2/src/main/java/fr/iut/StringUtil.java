package fr.iut;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtil {

    public static String prettyCurrencyPrint
            (final double amount, final Locale locale) {
        return String.valueOf(NumberFormat.getCurrencyInstance(locale).format(amount));
    }
}

