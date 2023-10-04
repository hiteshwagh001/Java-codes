public class TikcTacToe {
    public static void main(String[] args) {
        char board[][] = { { 'X', 'X', 'O' }, { 'O', 'O', 'X' }, { 'X', 'O', 'X' } };
        if (isValid(board)) {
            System.out.println(" game is valid");
        } else {
            System.out.println("game is not valid");
        }

    }

    static boolean isValid(char[][] board) {
        int xcount = 0;
        int ocount = 0;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] == 'X') {
                    xcount++;
                } else if (board[i][j] == 'O') {
                    ocount++;
                }
            }
        }
        if (!(xcount == ocount || xcount == ocount + 1)) {
            return false;
        }

        boolean xWins = checkWins(board, 'X');
        boolean oWins = checkWins(board, 'O');

        if ((xWins && oWins) || (xWins && xcount <= ocount)) {
            return false;
        }

        if (oWins && xcount > ocount) {
            return false;
        }
        return !((xWins || oWins) && xcount + ocount == 9);
    }

    public static boolean checkWins(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) {
                return true;
            }
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) {
                return true;
            }
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) {
            return true;
        }
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) {
            return true;
        }
        return false;
    }
}