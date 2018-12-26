import java.util.Vector;

import jdk.nashorn.internal.ir.Flags;

//+ get_user_by_id(user's id:string):User
//+ update_inf(user:User):void
//+Delete_user(user:User):void
//+get_user's_inf(mail: string):User
//+check_email_exist(mail: string):Boolean
//+Add_user(user: string): string
//+Delete_User(User_ID): void

public class User_Model {
	public static Vector<User>User_Database=new Vector<>();
	User get_user_by_id(String users_id)
	{
		return null;
		
	}
	void update_inf(User user)
	{
		
	}
	void Delete_user(User user)
	{
		
	}
	User get_users_inf(String mail)
	{
		return null;
		
	}
	boolean check_email_exist(String mail)
	{
	    boolean flag=false;
	    for (int i = 0; i < User_Database.size(); i++) {
			if(User_Database.get(i).Email.equals(mail))
			{
				flag=true;
				break;
			}
				
		}
		return flag;
	}
	String Add_user(User user)   //kant string
	{
		User_Database.add(user);
		return "Done";
		
	}
	void Delete_User(String User_ID)
	{
		
	}
	
	

}
