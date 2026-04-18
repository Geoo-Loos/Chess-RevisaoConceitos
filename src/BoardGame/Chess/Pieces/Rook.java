package BoardGame.Chess.Pieces;

import BoardGame.Board;
import BoardGame.Chess.Enum.ChessPiece;
import BoardGame.Chess.Enum.Color;

public class Rook extends ChessPiece{

    public Rook(Board board, Color color) {
        super(board, color);

    }

    @Override
    public String toString() {
        return "R";
    }
    
}
