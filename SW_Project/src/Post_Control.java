
//package com.company;

import java.util.Vector;



public class Post_Control {




	public boolean flag=false;
	public Post Add_PI(String c , String des,String img, String user_id)
	{
		//System.out.println("-------------------- "+question.Disc);
		Post Created=new Post();
		Created=Created.New_Post(c, des, img, user_id);
		Posts_model data=new Posts_model();
		if(flag==false)
		{
			data.Add_Post_To_Model(Created);
			return Created;
		}

		else
		{
			Add_MCQ_to_post(Created);
			data.Add_Post_To_Model(Created);
			return Created;

		}
	}

	public boolean Check_MCQ(String choose)
	{
		if(choose.equals("1"))
		{
			flag=true;

			return true;
		}
		else {
			return false;
		}


	}

	public Vector Get_Posts(String Mail)
	{

		Vector<Post>posts=new Vector<Post>();
		Posts_model aModel =new Posts_model();
		posts=aModel.Search_Posts(Mail);
		return posts;

	}

	public void Answer(String User_ID , String Post_ID , Vector<String> Answers)
	{

	}
	public String Confirm_PI_delivery(String Post_ID)
	{

		Posts_model aModel=new Posts_model();
		aModel.Set_PI_Delivery_Value("Comfirmed", Post_ID);
		return "Confirmed";
		
	}
	public void Confirm_Action()
	{
		System.out.println("Confirmed !");
	}
	public Vector Search_by_Category(String Category)
	{
		Vector<Post>posts=new Vector<Post>();
		Posts_model aModel=new Posts_model();
		posts=aModel.Get_cat_Posts(Category);
		
		return posts;
		
	}
	public Post Select_Post(String ID)
	{
		Posts_model aModel=new Posts_model();
		
		Post post=new Post();
		post =aModel.Get_Post_By_ID(ID);
		return post;
		

	}
	public String Delete_Posts(String User_ID)
	{
		Posts_model posts_model= new Posts_model();
		return posts_model.Delete_Posts(User_ID);

	}

	public void Add_MCQ_to_post(Post post)
	{
		Question Q=new Question();
		Q.Add_MCQ(post);
		post.Questions=Q;

	}

}
