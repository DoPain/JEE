package fr.iut;

import java.util.Locale;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String res = StringUtil.prettyCurrencyPrint(21500.390, Locale.FRANCE);
        System.out.println(res);
    }
}
