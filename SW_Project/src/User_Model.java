//package com.company;
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
	public static String user_id_count="447";
	public static Vector<User>User_Database=new Vector<User>();

	User get_user_by_id(String users_id)
	{
		return null;

	}
	void update_inf(User user)
	{

	}
	boolean Delete_user(User user)
	{

		return false;
	}
	User get_users_inf(String mail)
	{
		int index=0;
		for (int i=0; i<User_Database.size();i++)
			if(mail.equals(User_Database.get(i).Email)){index=i; break;}

		User user= new User();
		user=User_Database.elementAt(index); return user;
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

		user.ID=user_id_count;
		int temp= Integer.parseInt(user_id_count);
		temp++;
		user_id_count=temp+"";
		User_Database.addElement(user);
		return "Done";
		

	}
	boolean Delete_User(String User_ID)
	{
		int index=-1;
		for(int i=0; i<User_Database.size(); i++)
			if(User_Database.get(i).ID.equals(User_ID)) {index=i; break;}
		if(index!=-1)
			{
				User_Database.remove(index);
				return true;
			}
		return false;
	}



}
