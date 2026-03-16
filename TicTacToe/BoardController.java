public class BoardController {
    Board b;
    BoardController(Board b) {
        this.b = b;
    }
    boolean fillSlot(int i, int j, Piece p) {
        b.board.get(i-1).set(j-1, p);
        b.filledSlots++;
        if (b.isFull()) {
            return false;
        }
        return true;
    }
    boolean inputIsValid(int i, int j) {
        if (i <= 0 || j <= 0 || i > b.dim || j > b.dim) return false;
        if (b.board.get(i-1).get(j-1) == null) return true;
        return false;
    }
    Piece checkWinner() {
        // horizontal check     
        for (int i = 0; i < b.dim; i++) {
            int fl = 0;
            for (int j = 0; j < b.dim-1; j++) {
                if ((b.board.get(i).get(j) == null || b.board.get(i).get(j+1) == null) ||
    (b.board.get(i).get(j) != b.board.get(i).get(j+1))) {
                    fl = 1;
                    break;
                }
            }
            if (fl==1) continue;
            else {
                return b.board.get(i).get(0);
            }
        }

        //vertical check
        for (int i = 0; i < b.dim; i++) {
            int fl = 0;
            for (int j = 0; j < b.dim-1; j++) {
                if ((b.board.get(j).get(i) == null || b.board.get(j+1).get(i)==null) 
                    || 
                (b.board.get(j).get(i) != b.board.get(j+1).get(i))) {
                    fl = 1;
                    break;
                }
            }
            if (fl==1) continue;
            else {
                return b.board.get(0).get(i);
            }
        }

        // diagonal check
        int ch = 0;
        for (int i = 0; i < b.dim-1; i++) {
            if ((b.board.get(i).get(i) == null || b.board.get(i+1).get(i+1)==null) 
                    || 
                (b.board.get(i).get(i) != b.board.get(i+1).get(i+1))) {
                ch = 1;
                break;
            }
        }
        if (ch==0) {
            return b.board.get(0).get(0);
        }

        // reverse-diagonal check 
        int ch2 = 0;
for (int i = 0; i < b.dim-1; i++) {
    if ((b.board.get(i).get(b.dim-1-i) == null ||
         b.board.get(i+1).get(b.dim-2-i) == null) ||
        (b.board.get(i).get(b.dim-1-i) != b.board.get(i+1).get(b.dim-2-i))) {
        ch2 = 1;
        break;
    }
}

if (ch2 == 0) {
    return b.board.get(0).get(b.dim-1);
}
        return null;
    }
}
