import java.util.Scanner;

public class Endgame 
{
	private Newboard theBoard;
	private Players player1;
	private Players player2;
	private Scanner input;
	public Endgame()
	{
		input = new Scanner(System.in);
		this.theBoard=new Newboard();
		this.player1= new Players();
		this.player2 = new Players();
		
	}
	public void play()
	{
		Players currPlayer = this.player1;
		
		do{
		this.theBoard.display();
		this.getMove(currPlayer);
		if(currPlayer == this.player1)
		{
			currPlayer = this.player2;
		}
		else
		{
			currPlayer = this.player1;
		}
		}
		while(this.theBoard.winner() == false);
		if(currPlayer == this.player1)
		{
			System.out.println("The Winner is: " + this.player2.getName());
		}
		else
		{
			System.out.println("The Winner is: " + this.player1.getName());
		}
	}
	public void getMove(Players player)
	{
		int move;
		int row= move/10-1;
		int col = move%10-1;
		do
		{

			System.out.println("Please enter the col:");
			col = this.input.nextInt();
		}
		while

			(this.theBoard.charMove(player.getMove(), col)==false);
	}
}
