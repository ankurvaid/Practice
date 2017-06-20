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

    



    public static void main(String args[])
    {
        primeNumber(-56);

    }
}
