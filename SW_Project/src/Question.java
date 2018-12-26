
import java.util.Scanner;
import java.util.Vector;

//-
//+Disc : String
//+post: Post
//+MCQ: Vector
//--
//+ New_Question ( Q:String,mc:Vector,post:Post ) :  Question

public class Question {


	public String Disc;
	Post post;
	public int Answers=0;
	public int Num_Q=0;
	Vector MCQ=new Vector();

	Question New_Question (String Q,Vector mc,Post post )
	{
		return null;

	}
	public String Set_Q()
	{
		Scanner sscanner=new Scanner(System.in);
		//String xString="";
		System.out.println("Enter Question Description: ");
		Disc=sscanner.nextLine();
		return Disc;
	}
	public String Get_Dis()
	{
		return Disc;
	}
	
	public void MCQ_TEMP()
	{
		Post_Control p = new Post_Control();

	//	int num_Q=0;
		Scanner sscanner=new Scanner(System.in);
		Scanner aa=new Scanner(System.in);
		Vector<String> Q = new Vector<String>(0);
		Vector<String> MCQs = new Vector<String>(0);
		Vector Correct_Ans = new Vector<Integer>(0);
		Vector <Integer> Number_Answers = new Vector<Integer>(0);
		System.out.print("Mark Correc answer '*' in the first of answer\nEnter Number of Question:");
		Num_Q=sscanner.nextInt();
		String temp1="";
		String choices="";
		
		
for (int i = 0; i < Num_Q; i++) 
{
	System.out.print("Enter Question number "+(i+1)+":  ");
	temp1=aa.nextLine();
	Q.add(temp1);
		for(int j=0 ; j<3 ; j++)
		{
			System.out.print("Enter answer number "+(j+1)+" :  ");
			
			choices=aa.nextLine();
			
			
			//////////////////////////////
			if(p.Check_MCQ11(choices))
			{
				Answers++;
				Correct_Ans.add(j);
			}
			
			
			//////////////////////////
//				
//			if(choices.charAt(0)=='*')
//			{
//				Correct_Ans.add(j);
//				
//			}
			choices="";
			
		}
		
		
}

System.out.println("The IDXs of Correct Answers is: "+Correct_Ans);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
