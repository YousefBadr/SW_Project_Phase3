
import java.util.Scanner;
import java.util.Vector;



public class Post_Control {


	//public Post created=null;
	public void Add_PI(String c , String des,String img , Question question , String id)
	{
		//System.out.println("-------------------- "+question.Disc);
		Post Created=new Post();
		Created=Created.New_Post(c, des, img, question, id);
		Posts_model data=new Posts_model();
		data.Add_Post_To_Model(Created);

	}

	public Boolean Check_MCQ(int choose)
	{
		if(choose==1)
		{
			return true;
		}
		else {
			return false;
		}


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
	public Vector Get_Posts(String Mail)
	{
		return null;

	}

	public void Answer(String User_ID , String Post_ID , Vector<String> Answers)
	{

	}
	public String Confirm_PI_delivery(String Post_ID)
	{
		return Post_ID;

	}
	public void Confirm_Action()
	{

	}
	public Vector Search_by_Category(String Category)
	{
		return null;

	}
	public Post Select_Post(String ID)
	{
		return null;

	}
	public String Delete_Posts(String User_ID)
	{
		Posts_model posts_model= new Posts_model();
		return posts_model.Delete_Posts(User_ID);


	}
	

	



}
