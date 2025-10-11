import java.util.Scanner;
public class TeamService {
	static Team[] tarr;
	static int cnt;
	static {
		tarr=new Team[20];
		Player[] plst= new Player[15];
		plst[0]=new Player(11,"Virat Kohali","Batsman");
		plst[1]=new Player(12,"Rohit Sharma","Batsman");
		plst[2]=new Player(13,"Hardik Pandya","Allrounder");
		Player c=new Player(11,"Rohit Sharma","Batsman");
		tarr[0]=new Team(101,"MI",c,plst,3);
		
		Player[] plst1= new Player[15];
		plst1[0]=new Player(16,"Dravid","Batsman");
		plst1[1]=new Player(17,"Saurabh","Batsman");
		plst1[2]=new Player(18,"Sachin","Allrounder");
		Player c1=new Player(11,"Sachin","Allrounder");
		tarr[1]=new Team(100,"RCB",c1,plst1,3);
		
		cnt=2;
		
	}
	public static boolean addNewTeam() {
		Scanner sc = new Scanner(System.in);
		if(cnt!=20) {
			System.out.println("Enter Tid");
			int tid = sc.nextInt();
			System.out.println("Enter Team Name");
			String tname = sc.next();
			
			System.out.println("Enter Player ID :");
			int pid = sc.nextInt();
			sc.nextLine();
			
			System.out.println("Enter Name of Captian");
			String name = sc.nextLine();
			
			System.out.println("Enter Player Speciality");
			String sp = sc.next();
			
			Player c = new Player(pid,name,sp);
			Player [] plst = new Player[15];
			plst[0] = c;
			int i=1;
			
			String ans = "y";
			do {
				System.out.println("Enter Player Id : ");
				pid = sc.nextInt();
				System.out.println("Enter Player Name : ");
				String nam = sc.next();
				System.out.println("Enter player speciality :");
				String spe =sc.next();
				plst[i]= new Player(pid,nam,spe);
				i++;
				System.out.println("Do you want to add more(y/n) : ");
				ans =sc.next();
			}while(ans.equals("y"));
			tarr[cnt]=new Team(tid,tname,c,plst,i);
			cnt++;	
			return true;
		}
		return false;
	}
	public static void DisplayAll() {
		for(Team t :tarr) {
			if(t!=null) {
				
			System.out.println(t);
			}
			else {
				break;
			}
		}
	}
	public static Team SearchById(int id) {
		// TODO Auto-generated method stub
		for(Team t:tarr) {
			if(t!=null) {
				if(t.getTid()==id) {
					return t;
				}
				else {
					break;
				}
			}
		}
		return null;
	}
	public static boolean AddNewPlayer(int tid, int pid, String pname, String sp) {
		Team t= SearchById(tid);
		if(t!=null) {
			Player p = new Player(pid,pname,sp);
			int s = t.getSize();
			t.getPlist()[s]=p;
			t.getSize();
			t.setSize(s+1);
			return true;
		}
		return false;
		
		// TODO Auto-generated method stub
	
	}
	public static Team findTeamByPlayer(int pid) {
		for(Team t : tarr) {
			if(t!=null) {
				Player[] plst = t.getPlist();
				for(Player P:plst) {
					if(P!=null) {
						if(P.getPid()==pid) {
							return t;
						}
						else {
							break;
						}
						
					}
				}
			}
			
		}
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	
}
