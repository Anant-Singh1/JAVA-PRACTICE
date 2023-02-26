import java.util.Locale;
import java.util.ResourceBundle;

public class MessageResourceBundleReader {
    private Locale locale;
    private ResourceBundle rb;

    MessageResourceBundleReader(int choice) {
        if (choice == 1) {
            locale = new Locale("hi", "IN");
        } else if (choice == 2) {
            locale = new Locale("en", "US");

        } else {
            System.out.println("Sorry but it seems to be a wrong choice..");
            System.exit(0);
        }
        rb = ResourceBundle.getBundle("message", locale);

    }

    public String getValue(String key) {
        return rb.getString(key);
    }
}
