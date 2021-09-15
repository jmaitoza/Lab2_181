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

    static boolean hasMinLength(String pwd)
    {

        if(pwd.length() >= 6)
        {
            return false;
        }

        else
        {
            System.out.println("Password must have a minimum of 6 characters!");
            return true;
        }
    }

    /**
     * uses Regular Expressions to check whether String pwd contains either a digit (0-9)
     * or any other printable special characters
     * if pwd does match then the method returns false as it has special characters and no error is found
     */
    public static boolean hasOnlyLetters(String pwd)
    {
        if (pwd.matches(".*[^a-zA-Z].*"))
        {
            return false;
        }

        else
        {
            System.out.println("Password must contain at least one character that is not a letter!");
            return true;
        }
    }

    public static boolean doPasswordsMatch(String pwd, String pwd2)
    {
        if (pwd.equals(pwd2))
        {
            return false; // foundError = false
        }

        else
        {
            System.out.println("Passwords must match!");
            return true;
        }
    }

//    public static boolean checkForErrors(String pwd, String pwd2)
//    {
//        boolean error1,error2,error3;
//       error1 = hasMinLength(pwd);
//       error2 = hasOnlyLetters(pwd);
//       error3 = doPasswordsMatch(pwd, pwd2);
//       return error1;

//    }

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

            // In the following section, please fill out code to meet requirements of the lab description
//            checkForErrors(pwd,pwd2);
            boolean error1, error2, error3;
            error1 = hasMinLength(pwd);
            error2 = hasOnlyLetters(pwd);
            error3 = doPasswordsMatch(pwd, pwd2);

            if ((error1 || error2 || error3))
                foundError = true;

            else
                foundError = false;


            // If we make it this far, we have passed all of the tests.
            //foundError = false;
        } while (foundError);


    }

}
