package Application;

import BoardGame.Board;
import BoardGame.Position;
import BoardGame.Chess.ChessMatch;

public class Program {
    public static void main(String[] args)  {
      
      Position pos = new Position(3, 4);
      System.out.println(pos);  

      Board board = new Board(8, 8);
      System.out.println("Board rows: " + board.getRows());

      ChessMatch chessMatch= new ChessMatch();
      
}}
