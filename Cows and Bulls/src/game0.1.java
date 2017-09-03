import java.util.Scanner;
public class game
{
	public static void main(String[] args) 
	{
		
int cows = 0,bulls = 0,numUser,numRandom;

int[] numRandomTab = new int[4];
int[] numUserTab = new int[4];

				
				//1 number
				numRandomTab[0] = (int)(Math.random()*8+1);
				//2 number
				numRandomTab[1] = (int)(Math.random()*8+1);
				while(numRandomTab[1]==numRandomTab[0])
				{
					numRandomTab[1] = (int)(Math.random()*8+1);
				}
				//3 number
				numRandomTab[2] = (int)(Math.random()*8+1);
				while(numRandomTab[2]==numRandomTab[1]||numRandomTab[2]== numRandomTab[0])
				{
					numRandomTab[2] = (int)(Math.random()*8+1);
				}
				//4 number
				numRandomTab[3] = (int)(Math.random()*8+1);
				while(numRandomTab[3]==numRandomTab[2]||numRandomTab[3]== numRandomTab[1]||numRandomTab[3]== numRandomTab[0])
				{
					numRandomTab[3] = (int)(Math.random()*8+1);
				}	
				
			
				Scanner sc = new Scanner(System.in);
				System.out.println("Your number: ");
				
				
//System.out.println(numRandomTab[0]+""+numRandomTab[1]+""+numRandomTab[2]+""+numRandomTab[3]);
			
	while(bulls!= 4)
	{	bulls = 0;
		cows = 0;
		int numUserInput = sc.nextInt();
	
		while(numUserInput>0)
		{
		 for(int i=3; i>=0;i--)
		 {
			numUserTab[i]=numUserInput%10; 
			numUserInput/=10;
			System.out.println(numUserTab[i]);
		 } 		 
		}
	for(int i=0;i<4;i++)
	{
		if(numUserTab[i]==numRandomTab[i])
		{
			bulls+=1;			
		}		
	}
	//cows with 1num
	for(int i=1;i<4;i++)
	{
		if(numUserTab[0]==numRandomTab[i])
		{
			cows+=1;
		}
	}
	//cows with 2num
	
		if(		numUserTab[1]==numRandomTab[0]||
				numUserTab[1]==numRandomTab[2]||
				numUserTab[1]==numRandomTab[3])
		{
			cows+=1;
		}
	
	//cows with 3num
	
		if(		numUserTab[2]==numRandomTab[0]||
				numUserTab[2]==numRandomTab[1]||
				numUserTab[2]==numRandomTab[3])
		{
			cows+=1;
		}
	
	//cows with 4num
	for(int i=0;i<3;i++)
	{
		if(numUserTab[3]==numRandomTab[i])
		{
			cows+=1;
		}
	}
	
	
	System.out.println("Cows: "+cows+" Bulls: "+bulls);	
	
			}	
	System.out.println("You done THIS!!!");
		}
	}

