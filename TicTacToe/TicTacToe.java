import java.util.Scanner;

public class TicTacToe {
    public static void takeInput(BoardController b, Piece P) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        if (b.inputIsValid(i, j)) {
            b.fillSlot(i, j, P);
            return;
        }
        
        System.out.println("Invalid input, try again: ");
        takeInput(b, P);
    }
    public static void main(String[] args) {
        Board b = new Board(3);
        BoardController board = new BoardController(b);
        int curr = 0;

        while (!b.isFull()) {
            if (curr==0) {
                System.out.println("Game Rules: ");
                System.out.println("1. Player 1 moves first, and is assigned  as 'X', Player two is assigned as 'O'");
                System.out.println("2. To play a move, just enter the co-ordinates of your move");
                System.out.println("3. Player to complete a constellation either horizontally, vertically or diagonally first wins!!");
                System.out.println("4. Player must enter their move as space separated integers.");
                b.printBoard();
                System.out.println("Game starts, Player 1: ");
                takeInput(board, Piece.X);
                b.printBoard();
                curr++;
            }
            else {
                if (curr%2==0) {
                    System.out.println("Player 1: ");
                    takeInput(board, Piece.X);
                } else {
                    System.out.println("Player 2: ");
                    takeInput(board, Piece.O);
                }
                Piece temp = board.checkWinner();
                b.printBoard();
                if (temp == Piece.X) {
                    System.out.println("Player 1 wins!! Game over!");
                    break;
                }
                else if (temp == Piece.O) {
                    System.out.println("Player 2 wins!! Game over!");
                    break;
                } else {
                    curr++;
                    if (b.isFull()) {
                        System.out.println("Match Drawn!! Game over!");
                        break;
                    }
                    continue;
                }
            }
        }
    }
}
