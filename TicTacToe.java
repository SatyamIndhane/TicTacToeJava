package xogame;

public class TicTacToe 
{
	public static void main(String[] args) 
	{
		System.out.println("Welcome to Tic Tac Toe Java");
		
		char[] board = boardDesign();
		System.out.println(board);
		
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
}
	

