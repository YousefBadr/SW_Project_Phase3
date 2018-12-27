
//package com.company;

import java.util.Scanner;
import java.util.Vector;

public class Main {
public static void main(String[] args) {

	
	User curr_user= new User();
	boolean flag=false;
	 
	while (true) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1-log in");
		System.out.println("2-Sign up");
		System.out.println("3-Add Pi");
    System.out.println("4-Delete account");
		System.out.println("5-Search posts by catagory");

    System.out.println("6-Report");
		System.out.println("7-Confirm Pi deivery");
    System.out.println("8-logout");
		System.out.print("Enter Command num:");
		String select=scanner.nextLine();
		

		if(select.equals("1")&&flag==false)

		{

			System.out.print("Set mail");
			String mail=scanner.nextLine();


			System.out.print("Set password");
			String password=scanner.nextLine();
			User_control uControl= new User_control();

			if(uControl.log_in_check(mail, password))
			    {
			    	System.out.println("Success login");
			    	flag=true;
			    	curr_user=uControl.get_user();

			    }
			else

				System.out.println("Failed login");

		}

		if(select.equals("3")&&flag==true)

		{
			Post_Control aControl = new Post_Control();
			Scanner sscanner=new Scanner(System.in);
            String des,cat,img;
			System.out.print("Set description:");
			des=sscanner.nextLine();
			System.out.print("Set Catagory:");
			cat=sscanner.nextLine();
			System.out.print("Set image path:");
			img=sscanner.nextLine();

			System.out.print("if you need to put MCQ type 1 else type any symbol: ");
			String check=sscanner.nextLine();
			aControl.Check_MCQ(check);
			aControl.Add_PI(cat, des,img,curr_user.ID);

			}

		if(select.equals("4")&&flag==true)

		{

			User_control uControl= new User_control();
			uControl.Delete_User(curr_user.ID);
			Post_Control post_control=new Post_Control();
			post_control.Delete_Posts(curr_user.ID);
			flag=false;

		}

		else if (select.equals("2")&&flag==false){

		 User_control aControl=new User_control();
		 Scanner scanner2=new Scanner(System.in);
		 String Name="";
		 String Mail="";
		 String Password="";
		 String Mobile_Number="";
		 
		 System.out.print("Enter name: ");
		 Name=scanner2.nextLine();
		 System.out.print("Enter E_Mail: ");
		 Mail=scanner2.nextLine();
		 System.out.print("Enter Password: ");
		 Password=scanner2.nextLine();
		 System.out.print("Enter Mobile number: ");
		 Mobile_Number=scanner2.nextLine();
		 if(aControl.new_user(Name,Mail,Password,Mobile_Number).equals("Failed"))
		 System.out.println("Failed to Sign up User !");
		 else

		 {
		 	System.out.println("User Signed up Successfully");
		 }

		}
		else if (select.equals("5") &&flag==true){

			Post_Control aControl=new Post_Control(); 
			String id="";
			Scanner scanner2=new Scanner(System.in);
			String Catagory="";
			System.out.print("Enter catagory:");
			Catagory=scanner2.nextLine();
			Vector<Post>posts=aControl.Search_by_Category(Catagory);
			for (int i = 0; i < posts.size(); i++) {
				System.out.println("Post ID: "+posts.get(i).ID);
				System.out.println("Post Category: "+posts.get(i).Category);

				System.out.println("Post image path: "+posts.get(i).image);
				
				System.out.println();
			}
			if(posts.size()!=0)
			{
				System.out.print("Enter Post ID: ");
				id = scanner2.nextLine();
				Post tofind = aControl.Select_Post(id);

				System.out.println("Post ID: " + tofind.ID);
				System.out.println("Post Category: " + tofind.Category);
				System.out.println("Post Description: " + tofind.Description);
				System.out.println("Post image path: " + tofind.image);
				System.out.println("Post User_ID: " + tofind.User_ID);
			}
			else System.out.println("there is no posts of this category");

			
            
			
			}

		else if(select.equals("7")&&flag==true)

		{
			Vector<Post>posts=new Vector<Post>();
			Post_Control aControl=new Post_Control();
			posts=aControl.Get_Posts(curr_user.Email);
			if (posts.size()==0) {
				System.out.println("You have no posts !");
			}
			else
			{
				Scanner gScanner=new Scanner(System.in);
				for (int i = 0; i < posts.size(); i++) {
					System.out.println("Post ID: "+posts.get(i).ID);
					System.out.println("Post Category: "+posts.get(i).Category);
					System.out.println("Post Description: "+posts.get(i).Description);
					System.out.println("Post image path: "+posts.get(i).image);
					System.out.println("Post User_ID: "+posts.get(i).User_ID );

					
					System.out.println();
				}
				System.out.print("Enter Post ID: ");
				String id=gScanner.nextLine();
				for (int i = 0; i < posts.size(); i++) {
					if (posts.get(i).ID.equals(id)) {
						System.out.println("Post ID: "+posts.get(i).ID);
						System.out.println("Post Category: "+posts.get(i).Category);
						System.out.println("Post Description: "+posts.get(i).Description);
						System.out.println("Post image path: "+posts.get(i).image);
						System.out.println("Post User_ID: "+posts.get(i).User_ID );



					}
				}
				String back=aControl.Confirm_PI_delivery(id);

				
			}
			System.out.println();
		}
		



		if(select.equals("6")&&flag==true)

		{
			System.out.println("Set Report description:");
			String rep_des=scanner.nextLine();
			System.out.println("Set Post_ID (optional to best service)");
			String post_id=scanner.nextLine();

			post_id+="";
			User_control uControl= new User_control();
			uControl.Create_Report(rep_des,curr_user.ID,post_id);
			System.out.println("Thank You");
		}

		if(select.equals("8")&&flag==true)

		{
			flag=false;
		}


	}



}
}
