package fr.iut;

import java.text.NumberFormat;
import java.util.Locale;

public class StringUtil {

    public static String prettyCurrencyPrint
            (final double amount, final Locale locale) {
        String res;
        if(locale !=null){
            res = String.valueOf(NumberFormat.getCurrencyInstance(locale).format(amount));
        }else{
            res = null;
        }
        return res;
    }
}

