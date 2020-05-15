package InnerClasses.ButtonAndListener;

import java.util.Scanner;

public class Main {
    private static Scanner  scanner= new Scanner(System.in);
    private static  Button btnPrint = new Button("Print");
    public static void main(String[] args) {
        /**
         * Create your button class and attach a listener to it
         * Demonstrate Local classes....
         */

        class ClickOnListener implements Button.OnClickListener{
            @Override
            public void onClick(String title) {
                System.out.println(title + "was clicked");
            }
        }
    }
}
