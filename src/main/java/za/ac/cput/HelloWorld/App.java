package za.ac.cput.HelloWorld;

import java.io.IOException;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

            Scanner sc = new Scanner(System.in);
            System.out.println( "Who are you?" );
            String name = sc.nextLine();
            System.out.println( "Welcome " + name + "!");
            System.out.println( "What is 13 x 24?" );
            int answ = sc.nextInt();

            while(answ != (13 * 24))
            {
                System.out.println( "Oops! Try again." );
                answ = sc.nextInt();
            }
            if(answ == (13 * 24))
            {
                System.out.println( "Correct! You win! Have a nice day!" );
            }

    }
}
