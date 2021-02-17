package xogame;
import java.util.Scanner;

public class TicTacToe 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to Tic Tac Toe Java\r");
		
		System.out.println("Player choose X or O\r");
		char player = sc.next().charAt(0);
		
		char computer = chooseLetter(player);
		System.out.println("Computer gets \r"+computer);
		
		System.out.println("Let's start the game");
		System.out.println("Current board is :");
		showBoard(boardDesign());
		
		System.out.println("Please User input your move :: use numpad[1-9] ");
		int playerMove = sc.nextInt();
		
		movePlayer(boardDesign(), playerMove, player);
		
	}
	
	public static char[] boardDesign()
	{     
		char[] board = new char[10];
		
		for(int i=1; i<9; i++)
		{
			board[i] = ' ';
		}
		
		return board;
		
	}
	
	public static char chooseLetter(char player)
	{
		if ( Character.toUpperCase(player) == 'X')
		{
			char computer = 'O';
			return computer;
		}
		
		else
		{
			char computer = 'X';
			return computer;
		}
	}
	
	public static void showBoard(char[] board)
	{
		
		System.out.println("         |                    |           ");
		System.out.println(board[7]+"        |          "+board[8]+"         |          "+board[9]);
		System.out.println("---------|--------------------|-----------");
	    	System.out.println("         |                    |           ");
	    	System.out.println(board[4]+"        |          "+board[5]+"         |          "+board[6]);
	    	System.out.println("---------|--------------------|-----------");
	    	System.out.println("         |                    |           ");
	    	System.out.println(board[1]+"        |          "+board[2]+"         |          "+board[3]);
	     
	}
	
	public static void movePlayer(char[] board, int playerMove, char player)
	{
		if( board[playerMove] == ' ')
		{
			player = Character.toUpperCase(player);
			board[playerMove] = player;
		}
		else
		{
			System.out.println("Please input a free space");
		}
		
		showBoard(board);
	}
	
}
	

