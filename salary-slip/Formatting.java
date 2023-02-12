
import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Locale;

public class Formatting {
    private NumberFormat nf;
    private Locale locale;
    private DateFormat dateFormat;

    public Formatting(String country, String language) {

        locale = new Locale(language, country);
        nf = NumberFormat.getCurrencyInstance(locale);
        dateFormat = DateFormat.getDateInstance(DateFormat.LONG, locale);
    }

    private String initCap(String value) {
        char firstCharacter = value.charAt(0);
        String firstcharUpper = String.valueOf(firstCharacter).toUpperCase();
        String remainingsmall = value.substring(1).toLowerCase();
        return firstcharUpper + remainingsmall;

    }

    public String getTitleCase(String name) {
        String fullname = "";
        String names[] = name.split(" ");
        for (String value : names) {
            fullname += initCap(value) + " ";
        }
        return fullname;
    }

    public String formatDate(java.util.Date date) {
        return dateFormat.format(date);
    }

    public String format(double value) {
        return nf.format(value);
    }
}
