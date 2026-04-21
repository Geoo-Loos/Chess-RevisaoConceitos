package BoardGame.Chess.Pieces;

import BoardGame.Board;
import BoardGame.Position;
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

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Board board = getBoard();

        // above
        Position p = new Position(0,0);
        p.setValues(position.getRow() -1, position.getColumn());
        while(board.positionExists(p) && !board.thereIsAPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
            p.setRow(p.getRow() -1);
        }
        if(board.positionExists(p) && isThereOpponentPiece(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // below
         p.setValues(position.getRow() +1, position.getColumn());
         while(board.positionExists(p) && !board.thereIsAPiece(p)){
             mat[p.getRow()][p.getColumn()] = true;
             p.setRow(p.getRow() +1);
         }
         if(board.positionExists(p) && isThereOpponentPiece(p)){
             mat[p.getRow()][p.getColumn()] = true;
         }

         // left
         p.setValues(position.getRow(), position.getColumn() -1);
         while(board.positionExists(p) && !board.thereIsAPiece(p)){
             mat[p.getRow()][p.getColumn()] = true;
             p.setColumn(p.getColumn() -1);
         }
         if(board.positionExists(p) && isThereOpponentPiece(p)){
             mat[p.getRow()][p.getColumn()] = true;
         }

          // right
          p.setValues(position.getRow(), position.getColumn() +1);
          while(board.positionExists(p) && !board.thereIsAPiece(p)){
              mat[p.getRow()][p.getColumn()] = true;
              p.setColumn(p.getColumn() +1);
          }
          if(board.positionExists(p) && isThereOpponentPiece(p)){
              mat[p.getRow()][p.getColumn()] = true;
          }

        return mat;
    }
    
}
