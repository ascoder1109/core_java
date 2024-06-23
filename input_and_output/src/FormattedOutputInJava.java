import java.text.DecimalFormat;
import java.util.Date;

import static java.lang.StringTemplate.STR;

public class FormattedOutputInJava {
    public static void main(String[] args) {
        int x = 18;
        System.out.printf("You entered %d\n",x);
        DecimalFormat df = new DecimalFormat("###.##");
        double y = 34.22;
        System.out.println(df.format(y));
        System.out.println(STR."You have entered \{y}");
    }
}
