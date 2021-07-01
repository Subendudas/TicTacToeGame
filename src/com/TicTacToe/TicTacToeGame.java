package com.TicTacToe;

import java.util.Scanner;

public class TicTacToeGame 
{
	public static void main(String[] args) 
	{
		
		Scanner UserInput = new Scanner(System.in);
		char UserLetter = chooseUserLetter(UserInput);
		char computerLetter = (UserLetter == 'X')? 'O':'X';
	}
		
		private static char chooseUserLetter(Scanner UserInput) 
		{
			System.out.println("Choose X or O");
			return UserInput.next().toUpperCase().charAt(0);
		}

}
