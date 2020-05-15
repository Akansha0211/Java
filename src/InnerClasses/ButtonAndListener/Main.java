package InnerClasses.ButtonAndListener;

import java.util.Scanner;
/**
 *
 * Task:
 * Create your button class and attach a listener to it
 * Demonstrate Local classes....
 */
public class Main {
    private static Scanner  scanner= new Scanner(System.in);
    private static  Button btnPrint = new Button("Print");
    public static void main(String[] args) {

        /**
         * Local class created that implement OnClickListener interface
         * And assign an instance of it to the Button class...
         */
        class ClickOnListener implements Button.OnClickListener{
            public ClickOnListener() {
                System.out.println("I've been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        btnPrint.setOnClickListener(new ClickOnListener());
        //Since we have no GUI present now so we be using keyboard to simulate the output...
        listen();
    }

    public static void listen(){
        boolean quit = false;
        while (!quit){
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    btnPrint.onClick();
            }
        }
    }
}
