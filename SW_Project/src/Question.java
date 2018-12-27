//package com.company;
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
	String post_id="";
	public int Answers=0;
	public int Num_Q=0;
	//Vector MCQ=new Vector();
	Vector<String> Q = new Vector<String>(0);
	Vector<String> MCQs = new Vector<String>(0);
	Vector Correct_Ans = new Vector<Integer>(0);
	Vector <Integer> Number_Answers = new Vector<Integer>(0);
	Question New_Question (String Q,Vector mc,Post post )
	{
		return null;

	}
	public void Set_Q()
	{

	}
	public String print_Ques_inf()
	{
		return Disc;
	}

	public Boolean Check_MCQ11(String choose)
	{



		if(choose.charAt(0)=='*')
		{
			return true;

		}
		else
		{
			return false;
		}



	}

	public void Add_MCQ(Post post)
	{
		//Post_Control p = new Post_Control();

	//	int num_Q=0;
		post_id=post.ID;
		Scanner sscanner=new Scanner(System.in);
		Scanner aa=new Scanner(System.in);
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

			if(Check_MCQ11(choices))
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




}
