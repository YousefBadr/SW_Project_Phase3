import java.util.Vector;

//import SWE.Post;

public class Posts_model {
	
	public static Vector<Post>Posts_Database=new Vector<Post>();
	
	public String Add_Post_To_Model(Post post)
	{
		Posts_Database.add(post);
		return "Done !";
		
	}
	
	
	public Post Get_Post_By_ID(String Post_ID)
	{
		return null;
		
	}
	public Vector Search_Posts(String Mail)
	{
		return null;
		
	}
	public Boolean Set_PI_Delivery_Value(String Confirm , String Post_ID)
	{
		return null;
		
	}
	public Vector Get_cat_Posts(String Category)
	{
		return null;
		
	}
	public String Delete_POst(String ID)
	{
		return ID;
		
	}
}
