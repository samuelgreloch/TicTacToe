package rocks.zipcodewilmington.tictactoe;

/**
 * @author leon on 6/22/18.
 */
public class Board {
    public Board(Character[][] matrix) {
        int n = 3;
        char[][] board = new char [n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n; j++) {
                board[i][j] ='-';
            }
        }

    }

    boolean player1 = true;
    boolean gameEnded = false;
    


    public Boolean isInFavorOfX() {



        return null;
    }

    public Boolean isInFavorOfO() {
        return null;
    }

    public Boolean isTie() {
        return null;
    }

    public String getWinner() {
        return null;
    }

}
