package fr.iut;

import org.junit.Test;

import java.util.Locale;

import static org.junit.Assert.*;

public class StringUtilTest {

    @Test
    public void prettyCurrencyPrint() {
        String solut = StringUtil.prettyCurrencyPrint(21500.390, Locale.FRANCE);
        String res = "21\u00A0500,39 €";
        assertEquals(res,solut);

        assertEquals(StringUtil.prettyCurrencyPrint(0, null),null);
    }
}