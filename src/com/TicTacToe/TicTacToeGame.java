package com.TicTacToe;

public class TicTacToeGame 
{
	public static void main(String[] args)
	{
		showBoard(board);
	}
	
		private static void showBoard(char[] board) 
		{
			System.out.println("\n " + board[1] + " | " + board[2] + " | " + board[3]);
			System.out.println("------------");
			System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
			System.out.println("------------");
			System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
	    }
}
