//package com.company;
public class Security {

//	+Check_Security_MCQ_Disc(User_ID:string,Post_ID:string,Answers:Question):string
//	+check_ans(Q:Question,Answers:Question):boolean
//	+send_to_post_owner(user:User,post:Post):void
//	+check_user's_trustiness(User):Boolean
//	+check_user_exist(mail: string,password: string): Boolean


	public String Check_Security_MCQ_Disc(String User_ID,String Post_ID ,Question A)
	{
		// Dh ele mfrod y7sl p2a ps
		
		int count =0;
		int Num_Q=A.Num_Q;
	    int X =Num_Q-3;
	    
	    if(X>A.Answers)
	    {
	    	System.out.println("Alert you are in Denger zone!!");
	    	return"Bad_Boy";
	    }
	    else
	    {
	    	return "Good_Boy";
	    }
		
		

	}
	boolean check_ans(Question Q,Question Answers)
	{
		return true;
	}

	void send_to_post_owner(User user,Post post)
	{

	}
	boolean check_users_trustiness(User user)
	{
		return false;

	}
	boolean check_user_exist(String mail,String password)

	{
		for(int i=0; i<User_Model.User_Database.size();i++)
		{
			if(mail.equals(User_Model.User_Database.get(i).Email)&&password.equals(User_Model.User_Database.get(i).Password)) return true;

		}
		return false;
	}



}
