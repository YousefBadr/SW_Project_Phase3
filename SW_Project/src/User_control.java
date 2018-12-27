
//package com.company;

public class User_control {

//	+ log_in_check(mail: string ,password : string) : Boolean
//	+Create_Report(Disc: string,User_ID: string,Post_ID: string):void
//	+Report_Completed():void
//	+new_user(name: string,mail: string,password: string,mpbile: string):  string
//	+Delete_User(User_ID: string):void

    User user;
   public User_control(){user= new User();}

  boolean log_in_check(String mail ,String password)
  {
    Security security= new Security();
    User_Model UserModel= new User_Model();


     if (security.check_user_exist(mail, password))
        {
         user=UserModel.get_users_inf(mail);
         return true;
        }
     else return false;
  }

  public User get_user()
  {

      return user;

  }
   void Create_Report(String Disc, String User_ID,String Post_ID)
   {
	   Report report=new Report();
	   report.New_Report(Disc, User_ID, Post_ID);

   }
   void Report_Completed()
   {

   }
   String new_user(String name,String mail,String password,String mpbile)
   {
	   String Result="";
	   User_Model aModel=new User_Model();
	   
	   if(aModel.check_email_exist(mail))
	   {
		   return "Failed";
	   }
	   else
	   {
		   User aUser=new User();
		   aUser=aUser.New_User(name, mail, password, mpbile);
		   aModel.Add_user(aUser);
		   
		   
		   return"Done";
	   }
	  
   }

   boolean Delete_User(String User_ID)
   {
     User_Model user_model=new User_Model();
    return user_model.Delete_User(User_ID);

   }
   public static void main(String[]args) {

}

}
