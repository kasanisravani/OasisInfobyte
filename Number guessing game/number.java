import java.util.Scanner;
import java.util.Random;
public class Guess
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("\n\n#___________ NUMBER GUESSING GAME ___________#\n");
		System.out.println("\nBasic details about the game: \n");
		System.out.println("->The System will generate a random number between 1 to 100.");
		System.out.println("->You have to guess that random number with in the given trails.");
		System.out.println("-> Maximun 10 trails for a round. ");
		System.out.println("-> score reduces by 5 for every wrong guess. ");
		System.out.println();
		String play="yes";
		int i=1;
		while(play.equals("yes"))
		{
		    System.out.println("\nround #"+i+" :");
		    i+=1;
		    int trails=0;
	        int score=100;
	        Random rand=new Random();
	        int r=rand.nextInt(100);
	        int f=1;
	        while(trails!=10)
	        {
	            System.out.print("Enter the guess Number : ");
	            int num=sc.nextInt();
	            if(num==r)
	            {
	                trails+=1;
	                System.out.println("\nCONGRATULATIONS ! YOU HAVE GUESSED THE RANDOM NUMBER ");
	                System.out.println("\nTotal No of trails :"+trails);
	                System.out.println("Scoreboard :"+score);
	                f=0;
	                break;
	            }
	            else if(r>num)
	            {
    		        System.out.println("The random number is greater than :"+num);
    		        System.out.println("\n");
	                score-=5;
	                trails+=1;
	            }
	            else
	            {
	                System.out.println("The random number is lesser than :"+num);
	                System.out.println("\n");
	                score-=5;
	                trails+=1;
	            }
	        }
	        if(f==1)
	        {
	            System.out.println("\nYou have exhausted the 10 trails");
	            System.out.println("The number was : "+r);
	            System.out.println("Score : "+score);
	            System.out.println("Better luck  in the next round ! \n");
	        }
		    System.out.println("\nWould you like play an another round !");
		    System.out.println("Enter YES or NO");
    	    play=sc.next().toLowerCase();
    	}
	}
		
}
