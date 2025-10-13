import java.util.Scanner;

public class TestTeamArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int ch = 0;
		do {
			System.out.println("1: Add New Team \n2: Display all teams");
			System.out.println("3: Search Team By Id \n3: Add new Player");
			System.out.println("5: Search a Player \n6: Exit");

			ch = sc.nextInt();

			switch (ch) {
			case 1:
					boolean status = TeamService.addNewTeam();
					if(status) {
						System.out.println("Team Added Successfully");
					}
					else {
						System.out.println("UNABLE TO ADD TEAM");
					}
				break;
			case 2:
				TeamService.DisplayAll();
				
					
				break;
			case 3:
				System.out.println("Enter ID to Search");
				int id = sc.nextInt();
				Team t = TeamService.SearchById(id);
				if(t!=null) {
					System.out.println(t);
				}
				else {
					System.out.println("Not Found");
				}
				break;
			case 4:
				System.out.println("Enter team id: ");
				int tid = sc.nextInt();
				System.out.println("Enter player id: ");
				int pid = sc.nextInt();
				System.out.println("Enter player name: ");
				String pname = sc.next();
				System.out.println("Enter player speciality: ");
				String sp = sc.next();
				status = TeamService.AddNewPlayer(tid,pid,pname,sp);
						if(status)
							System.out.println("Player add succcessfully");
						else
							System.out.println("Error: Player not found");
				break;
					
			case 5:
				System.out.println("Enter pid to search: ");
				int pid1 = sc.nextInt();
				Team team=TeamService.findTeamByPlayer( pid1);
						
					if(team!=null) {
						System.out.println(team);
					
					}
					else {
						System.out.println("Players not found");
					}
					
				
				break;
			case 6:
				System.out.println("Thankyou for coming here");
				break;
			default :
				System.out.println("Invalid Input");
				break;
			}
			
		} while (ch < 6);

	}

}
