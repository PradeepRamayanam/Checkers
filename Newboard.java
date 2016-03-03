
public class Newboard 
{
	private char[][] Newboard;
	public Newboard()
	{
		this.Newboard = new char[6][7];
		this.BoardConstruction();
		
	}
	private void BoardConstruction()
	{
		for(int i =0;i < this.Newboard.length;i++)
		{
			
			for(int j=0;j<this.Newboard[i].length;j++)
			{
				this.Newboard[i][j]= '_';
				
			}
		}
	}
	public boolean winner()
	{
		boolean row1WinnerA = this.Newboard[0][0] == 'X' && 
				this.Newboard[0][1] == 'X' && 
				this.Newboard[0][2] == 'X';
		boolean row1WinnerB = this.Newboard[0][0] == 'O' && 
				this.Newboard[0][1] == 'O' && 
				this.Newboard[0][2] == 'O';

		boolean row2WinnerA = this.Newboard[1][0] == 'X' && 
				this.Newboard[1][1] == 'X' && 
				this.Newboard[1][2] == 'X';
		boolean row2WinnerB = this.Newboard[1][0] == 'O' && 
				this.Newboard[1][1] == 'O' && 
				this.Newboard[1][2] == 'O';

		boolean row3WinnerA = this.Newboard[2][0] == 'X' && 
				this.Newboard[2][1] == 'X' && 
				this.Newboard[2][2] == 'X';
		boolean row3WinnerB = this.Newboard[0][0] == 'O' && 
				this.Newboard[2][1] == 'O' && 
				this.Newboard[2][2] == 'O';
		
		return row1WinnerA || row1WinnerB || 
				row2WinnerA || row2WinnerB ||
				row3WinnerA || row3WinnerB ;
	}
	public boolean charMove(char move,int row,int col)
	{
		if(this.Newboard[row][col]=='_')
		{
			this.Newboard[row][col]= move;
			return true;
		}
		return false;
	}
		public void display()
		{
			System.out.println("*******************************");
			for(int i =0;i < this.Newboard.length;i++)
			{
				
				for(int j=0;j<this.Newboard[i].length;j++)
				{
					
					System.out.print(this.Newboard[i][j] + "\t");
					
				}
				System.out.println();
			}
		}
}
