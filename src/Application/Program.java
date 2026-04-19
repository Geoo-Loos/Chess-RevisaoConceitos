package Application;

import java.util.InputMismatchException;
import java.util.Scanner;

import BoardGame.Chess.ChessException;
import BoardGame.Chess.ChessMatch;
import BoardGame.Chess.ChessPosition;
import BoardGame.Chess.Enum.ChessPiece;

public class Program {
    public static void main(String[] args)  {
      Scanner sc = new Scanner(System.in);
    ChessMatch chessMatch = new ChessMatch();

    while(true){
      try{
      UI.clearScreen();
      UI.printBoard(chessMatch.getPieces());
      System.out.println();
      System.out.print("Source: ");
      ChessPosition sourse=UI.readChessPosition(sc);


      System.out.println();
      System.out.println("Target:");
      ChessPosition target= UI.readChessPosition(sc);

      ChessPiece capturedPiece= chessMatch.performChessMove(sourse, target);
      }
      catch(ChessException e){
        System.out.println(e.getMessage());
        sc.nextLine();
      }
      catch(InputMismatchException e){
        System.out.println(e.getMessage());
        sc.nextLine();
      }


}

}}
