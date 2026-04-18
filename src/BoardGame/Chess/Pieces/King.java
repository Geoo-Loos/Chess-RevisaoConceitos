package BoardGame.Chess.Pieces;

import BoardGame.Board;
import BoardGame.Chess.Enum.ChessPiece;
import BoardGame.Chess.Enum.Color;

public class King extends ChessPiece {

    public King(Board board, Color color) {
        super(board, color);
        //TODO Auto-generated constructor stub
    }

    @Override
    public String toString() {
        return "K";
    }
    
    
}
