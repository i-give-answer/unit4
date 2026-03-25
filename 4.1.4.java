import java.util.Scanner;

public class AccountRunner 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        // Creates a new account object
        UserAccount account = new UserAccount("Ada Lovelace", 
            "1/3/2012", "coding4l!fe@gmail.com", 
            "password1234", "1111222233334444");

        // Uncommenting lines 15-17 should cause an error because the setEmail method is private
        // System.out.println("Email address on file: " + account.getEmail());
        // account.setEmail("byte.bandit@blackhat.com");
        // System.out.println("Email address on file: " + account.getEmail());
        
        // Ask the user for their password
        System.out.println("Password: ");
        String enteredPassword = scanner.nextLine();

        // Ask the user for the new email
        System.out.println("New email: ");
        String newEmail = scanner.nextLine();

        // Call the changeEmail method
        account.changeEmail(enteredPassword, newEmail);
        scanner.close();
        

    }
}


//__________________________________________________________________________________________________________________

public class UserAccount 
{
    private String name;
    private String birthday;
    private String email;
    private String password;
    private String creditCard;

    public UserAccount(String uName, String uBirthday, String uEmail, String uPassword, String uCreditCard) 
    {
        name = uName;
        birthday = uBirthday;
        email = uEmail;
        password = uPassword;
        creditCard = uCreditCard;
    }

    private String getEmail() 
    {
        return email;
    }

    private void setEmail(String uEmail) 
    {
        email = uEmail;
    }
    
    // Create the changeEmail method here
    public void changeEmail (String attemptedPassword, String newEmail)
    {
        if (password.equals(attemptedPassword))
        {
            setEmail(newEmail);
            System.out.println("Email has been succesfully updated to " + email);
        }
        else
        {
            System.out.println("Invalid password. Not authorized to change the email.");
        }
    }
    
}
