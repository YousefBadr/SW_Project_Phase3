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
		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
