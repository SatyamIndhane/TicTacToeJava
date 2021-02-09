package xogame;
import java.util.Scanner;

public class TicTacToe 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Tic Tac Toe Java");
		
		System.out.println("Player choose X or O");
		char player = sc.next().charAt(0);
		
		char computer = chooseLetter(player);
		System.out.println("Computer gets "+computer);
	}
	
	public static char[] boardDesign()
	{
		char[] board = new char[10];
		board[0] = '#';                  // ignored to make it user friendly
		
		for(int i=1; i<10; i++)
		{
			board[i] = ' ';
		}
		
		return board;
	}
	
	public static char chooseLetter(char player)
	{
		if ( Character.toLowerCase(player) == 'x')
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
}
	

