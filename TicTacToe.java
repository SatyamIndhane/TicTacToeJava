package xogame;
import java.util.Scanner;

public class TicTacToe 
{
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to Tic Tac Toe Java\r");
		
		System.out.println("Human choose X or O\r");
		char player = sc.next().charAt(0);
		
		char computer = chooseLetter(player);
		System.out.println("Computer gets \r"+computer);
		
		System.out.println("Let's start the game");
		System.out.println("Current board is :");
		showBoard(boardDesign());
		
		System.out.println("Tossing Coin to check who plays first");
		System.out.println("Choose Heads or Tails :: Human");
		
		char toss = sc.next().charAt(0);
		whoPlaysFirst(toss);
		
		movePlayer(boardDesign(), player);
		
	}
	
	public static char[] boardDesign()
	{     
		char[] board = new char[10];
		
		for (int i=1; i<10; i++)
		{
			board[i] = ' ';
		}
		
		return board;
		
	}
	
	public static char chooseLetter(char player)
	{
		if (Character.toUpperCase(player) == 'X')
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
	
	public static void movePlayer(char[] board, char player)
	{
		while(emptyBoard(board))
			{	
				System.out.println("Please User input your move :: use numpad[1-9] ");
				int playerMove = sc.nextInt();
		
				if (checkEmpty(board,playerMove))
				{
					player = Character.toUpperCase(player);
					board[playerMove] = player;
				}
				else
				{
					System.out.println("Invalid Move : Play again : Please input only in free space");
				}
	
				showBoard(board);
			}
	}
	
	public static boolean emptyBoard(char[] board)
	{
		boolean flag = true;
		
		for (int i=1; i<10; i++)
		{
			if( board[i] == ' ' )
			{
				flag = true;
				break;
			}
			else
			{
				flag = false;
			}
			
		}
		
		return flag;
	}
	
	public static boolean checkEmpty(char[] board, int playerMove)
	{
		boolean flag;
		
		if (board[playerMove] != ' ')
		{
			flag = false;
		}
		else
		{
			flag = true;
		}
		
		return flag;
	}
	
	public static void whoPlaysFirst(char toss)
	{
		int val = (int)((Math.random()*10)%2);
		toss = Character.toUpperCase(toss);
		char winningToss;
		
		if (val == 0)
		{
			winningToss = 'H';
		}
		else
		{
			winningToss = 'T';
		}
		
		if ( winningToss == toss)
		{
			System.out.println("Human goes first");
		}
		else
		{
			System.out.println("Computer goes first");
		}
	}
}
	

