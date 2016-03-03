
public class Players
{
	private String name;
	private char move;
	
	public void Player(String name, char move){
		this.name=name;
		this.move=move;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getMove() {
		return move;
	}

	public void setMove(char move) {
		this.move = move;
	}
	
}
