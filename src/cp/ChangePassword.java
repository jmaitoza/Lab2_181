package cp;
import java.io.Console;
//import java.util.Arrays;
import java.io.PrintWriter;


public class ChangePassword
{
    static boolean validateLogin(String username, String password)
    {
        return true;
    }

    static boolean resetPassword(String username, String password)
    {
        return true;
    }

    public static void main(String[] args)
    {
        Console cons = System.console();

        if (cons == null)
        {
            System.err.println("No console available.");
            System.exit(1);
        }

        PrintWriter consOutput = cons.writer();
        //String username = cons.readLine("Username:  ");
        consOutput.println("Update your password:");

        boolean foundError = false;
        do {

            String pwd = new String(cons.readPassword("       Password:  "));
            String pwd2 = new String(cons.readPassword("Verify password:  "));

            foundError = false;

            // In the following section, please fill out code to meet requirements of the lab description







            // If we make it this far, we have passed all of the tests.
            foundError = false;
        } while (foundError);


    }

}
