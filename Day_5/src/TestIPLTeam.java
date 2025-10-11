
public class TestIPLTeam {
public static void main(String args[]) {
	Player[] plst= {
			new Player(11,"Jasprit Bumrah","Bowler"),
			new Player(12,"Mohd Siraj","Bowler"),
			new Player(13,"Rohit Sharma","Batsman")
	};
	Player c = new Player(11,"Rohit Sharma","Batsman");
	Team t1 = new Team(100,"RCB",c,plst,3);
	System.out.println(t1);
}

}
