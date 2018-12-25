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
	public String Delete_Posts(String ID)
	{
		Vector<Integer> indexes= new Vector<Integer>();

		for(int i=0; i<Posts_Database.size(); i++)
			if(Posts_Database.get(i).User_ID.equals(ID)) indexes.addElement(i);

		for(int j=0; j<indexes.size();j++)
			Posts_Database.remove(indexes.get(j));
		return "success";

	}
}
