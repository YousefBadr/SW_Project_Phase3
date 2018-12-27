
//package com.company;

//+ ID : String
//+Category: String
//+User_ID: String
//+image: ImageBuffer
//+Questions: Question
//--
//+ New_Post ( c:string,des:string,img:ImageBuffer) : Post
//+get_Question_inf(Post):Question
//+wrong_ans(User):void


public class Post {
	public String ID ;
	public String Category ;
	public String Description ;
	public String image ;
	public Question Questions;
	public String User_ID ;

	public String Confirm="Not confirmed";

	public Post()
	{

	}

	public Post New_Post (String c,String des,String img , String UID)

	{
		Post aPost=new Post();
		Question aQuestion=new Question();
		aPost.Category=c;
		aPost.Description=des;
		aPost.image=img;


		aPost.User_ID=UID;

		//System.out.println(aPost.Description+" "+aPost.Category+" "+aPost.image+" "+aPost.Questions.Disc+" "+aPost.User_ID);
		return aPost;

	}




	Question get_Question_inf(Post post)
	{
		return this.Questions;

	}

	void wrong_ans(User user)
	{

	}


//	public void Show_Details()
//	{
//		System.out.print(ID+" "+Category+" "+image+" "+Questions+" "+User_ID);
//	}

}


