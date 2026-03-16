import java.util.ArrayList;
import java.util.List;

public class Board {
    int dim;
    List<List<Piece>> board;
    int filledSlots;
    Board (int dim) {
        this.dim = dim;
        board = new ArrayList<>();
        for (int i = 0; i < dim; i++) {
            List<Piece> temp = new ArrayList<>(); 
            for (int j = 0; j < dim; j++) {
                temp.add(null);
            }
            board.add(temp);
        }
        filledSlots = 0;
    }
    boolean isFull() {
        return filledSlots == dim*dim;
    }
    
    void printBoard() {
        for (int i = 0; i < dim; i++) {
            StringBuilder res = new StringBuilder();
            for (int j = 0; j < dim; j++) {
                if (board.get(i).get(j) == Piece.X) {
                    res.append("X");
                } else if (board.get(i).get(j)== Piece.O) {
                    res.append("O");
                } else {
                    res.append(" ");
                }
                if (j != dim-1) {
                    res.append("|");
                }
            }
            System.out.println(res);
            if (i< dim-1) {
                for (int j = 0; j < res.length(); j++) {
                    System.out.print("-");
                }
                System.out.println();
            }
        }
    }
}
