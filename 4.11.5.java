public class ChessBoard
{
    public static void main(String[] args)
    {
        // Create an 8x8 2D String array named chess:
        String [][] chess = {
            {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"},
            {"Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn"},
            {"-","-","-","-","-","-","-","-"},
            {"-","-","-","-","-","-","-","-"},
            {"-","-","-","-","-","-","-","-"},
            {"-","-","-","-","-","-","-","-"},
            {"Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn","Pawn"},
            {"Rook","Knight","Bishop","Queen","King","Bishop","Knight","Rook"}
            
        };
        
        
        
        
        // Use this method to print the chess board onto the console
        print(chess);
    }
    
    // Do not make alterations to this method! Method prints a 2D array.
    public static void print(String[][] array)
    {
        for(String[] row: array)
        {
            for(String thing: row)
            {
                System.out.print(thing + "\t");
            }
            System.out.println();
        }
    }
}
