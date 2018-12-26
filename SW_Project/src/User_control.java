
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
	return false;
	  
  }
   void Create_Report(String Disc, String User_ID,String Post_ID)
   {
	   
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
   
   void Delete_User(String User_ID)
   {
	   
   }
   public static void main(String[]args) {
	
}
  
}
