
//package com.company;
public class User {
	public String ID;
	public String Email;
	public String Password;
	public String Name;
	public String Mobile;



	public User New_User(String name , String mail , String Pass , String mobile)
	{

		User aUser=new User();
		aUser.Name=name;
		aUser.Email=mail;
		aUser.Password=Pass;
		aUser.Mobile=mobile;
		return aUser;

	}


}
