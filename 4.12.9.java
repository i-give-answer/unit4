public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        // Create new board and print
        TicTacToe game = new TicTacToe();
        System.out.println("Initial Game Board:");
        game.printBoard();
        
        // Plays three turns, each placing a mark on the first row
        for (int col = 0; col < 3; col++)
        {   
            // If location is available
            if (game.pickLocation(0, col))
            {
                // Put mark on first row spot
                game.takeTurn(0, col);
            }
        }
        System.out.println("After three turns:");
        game.printBoard();
    }
}

//__________________________________________________________________
public class TicTacToe
{
    // Declare instance variables
    private String[][] board;
    private int turn;
    
    // Constructor that initializes the empty game board
    public TicTacToe()
    {
        // Initialize turn and board variables
        turn = 0;
        board = new String[3][3];
        
        for(int row = 0; row < board.length; row++)
        {
            for(int col = 0; col < board[row].length; col++)
            {
                board[row][col] = "-";
            }
        }



    }
    
    // Returns true if row and col is a valid, empty space
    public boolean pickLocation(int row, int col)
    {
        // Complete this method
        if(row >= 0 && row < 3 && col >= 0 && col < 3)
        {
            if(board[row][col].equals("-"))
            {
                return true;
            }
        }
        return false;




    }

    // Places an X or O at location (row, col) based on the turn value
    public void takeTurn(int row, int col)
    {
        // Complete this method
        if(turn % 2 == 0)
        {
            board[row][col] = "X";
        }
        else
        {
            board[row][col] = "O";
        }

        turn++;

        
    }
    
    // Returns the current turn
    public int getTurn()
    {
        // Complete this method
        return turn;


    }

    // Returns true if a single row has three X or O's
    public boolean checkRow()
    {
        // Complete this method
        for(int row = 0; row < 3; row++)
        {
            if(!board[row][0].equals("-") && board[row][0].equals(board[row][1]) && board[row][1].equals(board[row][2]))
            {
                return true;
            }
        }
        return false;


        
    }
    
    // Returns true if a single column has three X or O's
    public boolean checkCol()
    {
        // Complete this method
        for(int col = 0; col < 3; col++)
        {
            if(!board[0][col].equals("-") &&
               board[0][col].equals(board[1][col]) &&
               board[1][col].equals(board[2][col]))
            {
                return true;
            }
        }
        return false;
        
    }

    // Returns true if a diagonal has three X or O's
    public boolean checkDiag()
    {
        // Complete this method
        if(!board[0][0].equals("-") &&
           board[0][0].equals(board[1][1]) &&
           board[1][1].equals(board[2][2]))
        {
            return true;
        }

        if(!board[0][2].equals("-") &&
           board[0][2].equals(board[1][1]) &&
           board[1][1].equals(board[2][0]))
        {
            return true;
        }
        return false;



        
    }

    // Returns true if the turn count is less than the max (9)
    public boolean checkTurn()
    {
        // Complete this method
        return turn < 9;

    }
    
    // Returns true if someone has won the game
    public boolean checkWin()
    {
        // Complete this method
        return checkRow() || checkCol() || checkDiag();


    }

    // Prints out the board array on to the console
    public void printBoard()
    {
        // Complete this method
        System.out.println("  0 1 2");

        for(int row = 0; row < board.length; row++)
        {
            System.out.print(row + " ");

            for(int col = 0; col < board[row].length; col++)
            {
                System.out.print(board[row][col] + " ");
            }

            System.out.println();
        }

        System.out.println();



        
    }
}
