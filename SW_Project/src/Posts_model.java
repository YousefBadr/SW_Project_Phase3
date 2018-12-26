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
		for (int i = 0; i < Posts_Database.size(); i++) {
			if(Posts_Database.get(i).ID.equals(Post_ID))
			{
				return Posts_Database.get(i);
			}
		}
		return null;
		
	}
	public Vector Search_Posts(String Mail)
	{
		Vector<Post>posts=new Vector<Post>();
		String ID="";
		for (int i = 0; i < User_Model.User_Database.size(); i++) {
			if(User_Model.User_Database.get(i).Email.equals(Mail))
				ID=User_Model.User_Database.get(i).ID;	
		}
		for (int i = 0; i < Posts_Database.size(); i++) {
			if(Posts_Database.get(i).User_ID.equals(ID))
			{
				posts.add(Posts_Database.get(i));
			}
		}
		return posts;
		
	}
	public Boolean Set_PI_Delivery_Value(String Confirm , String Post_ID)
	{
		Post_Control aControl=new Post_Control();
		for (int i = 0; i < Posts_Database.size(); i++) {
			if(Posts_Database.get(i).ID.equals(Post_ID))
			{
				Posts_Database.get(i).Confirm=Confirm;
				break;
			}
		}
		
		aControl.Confirm_Action();
		return true;
		
	}
	public Vector Get_cat_Posts(String Category)
	{
		Vector<Post>posts=new Vector<Post>();
		for (int i = 0; i < Posts_Database.size(); i++) {
			if(Posts_Database.get(i).Category.equals(Category))
			{
				posts.add(Posts_Database.get(i));
			}
		}
		return posts;
		
	}
	public String Delete_POst(String ID)
	{
		return ID;
		
	}
}
