import java.util.Scanner;
// program that takes input from the user.the user has to pick an option from the displayed options. for example if a user picks option 1
// + he/she gets information about that option/ that team. The program terminates when the user chooses "exit"
public class Football {
	String Stadium;
	String Coach;
	String Players;
	
	// constructor for creating instances of the class
  public Football(String Stadium, String Coach, String Players) {
	  this.Stadium = Stadium;
	  this.Coach = Coach;
	  this.Players = Players;
  }
           // method to show the instances in terminal/console
            public void show() {
            	System.out.println("the stadium is :  " + Stadium);
            	System.out.println("the coach is : " + Coach);
            	System.out.println("some of the players are : " + Players); 
            	
            }
                 // driver method
                public static void main(String [] args) {
                	
                	Scanner sc=new Scanner(System.in);
                	while (true) {
                        displayTopSixTeams();
                        int option=sc.nextInt();
                        
                	if(option == 1) {
                	Football ManUnited = new Football ("Old Traford" , "Ole Gunner solskjaer", "De gea ,cristiano , fernades, cavani, rashford, greenwood, maguire, wan-bissaka, pogba , varane, Shaw");
                	ManUnited.show();
                	System.out.println();
                	}
                	if(option == 2) {
                	Football ManCity = new Football ("Etihad" , "Pep Gurdiola", "kevin de bryne , jesus, foden, sterling , kyle walker , gundogan, john stones , rodri , nathan ake, benjamin mendy, jack grealish" );
                	ManCity.show();
                	System.out.println();
                	}
                	if(option == 3) {
                	Football Chelsea = new Football ("Stamford Bridge" , "Thomas Tuchel", "Ngolo Kante, timo werner, rudiger, lukaku, kai havertz, chiwell, pulisic, mount, ziyech, eduardo mendy, hudson odoi" );
                	Chelsea.show();
                	System.out.println();
                	}
                	if(option == 4) {
                	Football LiverPool = new Football ("Anfield" , "Eugen Klopp", "Mo Salah , sadio mane, firmino, minamino, trent-arnord, allison becker, keita, thiago alcantara, fabinho, chamberlain, james milner " );
                	LiverPool.show();
                	System.out.println();
                	}
                	
                	if(option == 5) {
                    	Football Arsenal = new Football ("the Emirates" , "mikel arteta", "aubameyang , bukayo saka, lacazette, pepe, martineli, partey, tierney, leno, xhaka, ben white, tomiyasu " );
                    	Arsenal.show();
                    	System.out.println();
                    	}
                	
                	if(option == 6) {
                    	Football Tottenham= new Football ("Tottenham Hotspur Stadium" , "ANtonio Conte", "harry kane , gareth bale, lloris, dele ali, eric dier, son-heung-min, ndombele, serge aurier, harry winks, eric lamela, lucas moura " );
                    	Tottenham.show();
                    	System.out.println();
                    	}
                	
                	
                	
                	if(option == 7) {
                		System.out.println("transfer window is closed for all teams. please check again in later days");
                		 System.out.println();
                	}
                	if(option ==8) {
                		System.out.println("bye");
                		break;
                	}
                	
                }
                }

public static void displayTopSixTeams(){
	 System.out.println("the top six teams are : ");
    System.out.println("1. Manchester United");
    System.out.println("2. Manchester City");
    System.out.println("3. Chelsea");
    System.out.println("4: Liverpool");
    System.out.println("5. Arsenal");
    System.out.println("6. Tottenham");
    System.out.println("7. Transfers");
    System.out.println("8. Exit");
    System.out.println();
    System.out.println("pick an option "); 
}
}



















