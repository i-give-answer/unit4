import java.util.Scanner;

public class TicTacToeRunner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        TicTacToe game = new TicTacToe();

        System.out.println("Welcome to Tic-Tac-Toe!\n");

        while(game.checkTurn() && !game.checkWin())
        {
            game.printBoard();

            System.out.print("Enter Your Row Pick: ");
            int row = input.nextInt();

            System.out.print("Enter Your Col Pick: ");
            int col = input.nextInt();

            if(game.pickLocation(row, col))
            {
                game.takeTurn(row, col);
            }
            else
            {
                System.out.println("That space is taken, or you entered an invalid row/col\n");
            }
        }

        game.printBoard();

        if(game.checkWin())
        {
            if(game.getTurn() % 2 == 1)
                System.out.println("X wins!");
            else
                System.out.println("O wins!");
        }
        else
        {
            System.out.println("The game ended in a tie.");
        }

        input.close();
    }
}


//__________________________________________________________________
public class TicTacToe
{
    private String[][] board;
    private int turn;

    public TicTacToe()
    {
        turn = 0;
        board = new String[3][3];

        for(int r = 0; r < 3; r++)
        {
            for(int c = 0; c < 3; c++)
            {
                board[r][c] = "-";
            }
        }
    }

    public boolean pickLocation(int row, int col)
    {
        if(row >= 0 && row < 3 && col >= 0 && col < 3)
        {
            return board[row][col].equals("-");
        }
        return false;
    }

    public void takeTurn(int row, int col)
    {
        if(turn % 2 == 0)
            board[row][col] = "X";
        else
            board[row][col] = "O";

        turn++;
    }

    public int getTurn()
    {
        return turn;
    }

    public boolean checkRow()
    {
        for(int r = 0; r < 3; r++)
        {
            if(!board[r][0].equals("-") &&
               board[r][0].equals(board[r][1]) &&
               board[r][1].equals(board[r][2]))
            {
                return true;
            }
        }
        return false;
    }

    public boolean checkCol()
    {
        for(int c = 0; c < 3; c++)
        {
            if(!board[0][c].equals("-") &&
               board[0][c].equals(board[1][c]) &&
               board[1][c].equals(board[2][c]))
            {
                return true;
            }
        }
        return false;
    }

    public boolean checkDiag()
    {
        if(!board[0][0].equals("-") &&
           board[0][0].equals(board[1][1]) &&
           board[1][1].equals(board[2][2]))
            return true;

        if(!board[0][2].equals("-") &&
           board[0][2].equals(board[1][1]) &&
           board[1][1].equals(board[2][0]))
            return true;

        return false;
    }

    public boolean checkTurn()
    {
        return turn < 9;
    }

    public boolean checkWin()
    {
        return checkRow() || checkCol() || checkDiag();
    }

    public void printBoard()
    {
        System.out.println("  0 1 2");

        for(int r = 0; r < 3; r++)
        {
            System.out.print(r + " ");

            for(int c = 0; c < 3; c++)
            {
                System.out.print(board[r][c] + " ");
            }

            System.out.println();
        }

        System.out.println();
    }
}
