public class AccountRunner 
{
    public static void main(String[] args) 
    {
        // Creates a new account object
        UserAccount account = new UserAccount("Ada Lovelace", 
            "1/3/2012", "coding4l!fe@gmail.com", 
            "password1234", "1111222233334444");
        
        account.email = "byte.bandit@blackhat.com";

        System.out.println("Email address on file: " + account.getEmail());
        account.setEmail("byte.bandit@blackhat.com");
        System.out.println("Email address on file: " + account.getEmail());
    }
}

//______________________________________________________________________________________________________________________________________________________________________________________________________
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

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String uEmail) 
    {
        email = uEmail;
    }
}
