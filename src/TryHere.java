import com.sun.javafx.image.BytePixelSetter;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

import java.util.Scanner;

/**
 * Created by vaid.ankur on 5/18/2017.
 */
public class TryHere
{
    protected static void oddEven(int userInput)
    {
            if(userInput % 2 == 0)
            {
                System.out.println("The number that you entered is Even...!!");
            }
            else
            {
                System.out.println("The number that you entered is Odd...!!");
            }
    }

    protected static void primeNumber(int userInput)
    {
        if(userInput > 0)
        {
            int flag = 0;
            for(int i = 2; i <= userInput/2; i++)
            {
                if(userInput % i == 0)
                {
                    flag = 1;
                    break;
                }
                else
                {
                    continue;
                }
            }
            if(flag == 0)
            {
                System.out.println("The number that you entered is Prime...!!");
            }
            else
            {
                System.out.println("The number you entered is not Prime...!!");
            }
        }
        else
        {
            System.out.println("Please enter a positive integer as an input...!!");

        }
    }

    protected static void factorial(int number)
    {
        int factorial = 1;
        for(int i = 2; i <= number; i++)
        {
            factorial = factorial*i;
        }
        System.out.println("Factorial of " + number + " is " + factorial);
    }

    protected static void palindromeString(String string)
    {
        StringBuffer strbuffer = new StringBuffer(string);
        String reverse = strbuffer.reverse().toString();

        if(string.equals(reverse))
        {
            System.out.println("The String that you entered is a Palindrome");
        }
        else
        {
            System.out.println("The String that you entered is not a Palindrome");
        }

    }

    public void test()
    {
        
    }


    public static void main(String args[])
    {
        palindromeString("abba");

    }
}
