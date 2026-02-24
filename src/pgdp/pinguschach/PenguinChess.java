package pgdp.pinguschach;

import java.util.*;

class PenguinChess {

    char[][] board;

    public PenguinChess(char[][] board) {
        this.board = board;
    }

    public Position[] findPenguins() {
        Position[] result = new Position[2];
        for( int i = 0; i < board.length; i++){
            for(int j = 0; j < board[0].length; j++){
                if(board[i][j] == 'A'){
                    result[0] = new Position(i,j);
                }
                if(board[i][j] == 'B'){
                    result[1] = new Position(i,j);
                }
            }
        }
        return result;
    }

    public Set<Position> findPossibleMoves(Position position) {
        return helpFindMove(position, new HashSet<>());
    }
    public Boolean checkMove1(Position position){
        if( position.getColumn()>0 && position.getRow()>0 && board[position.getRow()-1][position.getColumn()-1] != 'X')
           return true;
        return false;
    }
    public Boolean checkMove2( Position position){
        if( position.getColumn()< (board[0].length-1) && position.getRow()< (board.length-2) && board[position.getRow()+2][position.getColumn()+1] != 'X')
            return true;
        return false;
    }
    public Set<Position> helpFindMove(Position position, Set<Position> move){
        if(checkMove1(position)) {
            move.add(new Position(position.getRow()-1, position.getColumn()-1 ));
            helpFindMove(new Position(position.getRow()-1, position.getColumn()-1 ), move);
        }
        if(checkMove2(position)) {
            move.add(new Position(position.getRow()+2, position.getColumn()+1));
            helpFindMove(new Position(position.getRow()+2, position.getColumn()+2 ), move);

        }
        return move;
    }

    protected void processActiveElement(Queue<Position> active, Set<Position> accessibleFields) {
        return;
    }

    public Set<Position> findAccessibleFields(Position position) {
        return null;
    }

    public int numberOfAccessibleFields() {
        return 0;
    }

    public boolean canMeet() {
        return false;
    }

}
