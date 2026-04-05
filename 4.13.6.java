public class ArtRunner
{
    public static void main(String[] args)
    {
        String[][] art1 = {
            {" ", "|", " ", "|", "_", "_", "_", " ", " ", " ", " ", " "},
            {"|", " ", " ", " ", " ", " ", "@", "|", "_", "_", "_", " "},
            {"|", " ", " ", " ", " ", " ", " ", " ", " ", " ", " ", "O"},
            {"|", " ", " ", " ", " ", "|", "_", "_", "_", "_", "|", " "},
            {"|", "_", "_", "_", "_", "|", " ", " ", " ", " ", " ", " "}
        };
        
        // Create new Art object and print original art:
        Art myArt = new Art(art1);
        
        System.out.println("Original Art: ");
        System.out.println(myArt);
        

        // Flip Art horizontally and print the results:
        myArt.flipHorizontally();
        
        System.out.println("Flipped Horizontally:");
        System.out.println(myArt);
        
        
    }
}


//__________________________________________________________________________________
public class Art 
{
    private String[][] artArray;

    public Art(String[][] art)
    {
        // Allocate space for the instance variable
        artArray = new String[art.length][art[0].length];

        // Copy in art's values. This prevents the Art class
        // from making changes to the original art array
        for (int row = 0; row < art.length; row++)
        {
            for (int col = 0; col < art[0].length; col++)
            {
                artArray[row][col] = art[row][col];
            }
        }
    }

    // Create flipHorizontally() method here:
    public void flipHorizontally()
    {
        for(int row = 0; row <artArray.length; row++)
        {
            for (int col = 0; col < artArray[0].length / 2; col++)
            {
                String temp = artArray[row][col];
                artArray[row][col] = artArray[row][artArray[0].length - 1 - col];
                artArray[row][artArray[0].length - 1 - col] = temp;
            }
        }
    }
    
    
    
    
    // Method to return the 2D array as a String
    public String toString()
    {
        String result = "";
        for (String[] row : artArray) 
        {
            for (String symbol : row) 
            {
                result += symbol;
            }
            result += "\n"; // Move to the next line after each row
        }
        return result;
    }
}
