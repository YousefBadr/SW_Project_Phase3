
import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	 User curr_user= new User();
	 boolean flag=false;
	while (true) {
		Scanner scanner=new Scanner(System.in);

		System.out.println("1-log in");
		System.out.println("3-Add Pi");
		System.out.println("4-Delete account");
		System.out.println("7-Report");
		System.out.println("10-logout");



		System.out.print("Enter Command num:");
		int select=scanner.nextInt();

		if(select==1&&flag==false)
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
				System.out.println("failed login");

		}
		if(select==3&&flag==true)
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
			//aControl.Add_PI(cat, des,img,"00");
			System.out.print("if you need to put MCQ type 1 else type 0: ");
			int ssss=sscanner.nextInt();

			if (aControl.Check_MCQ(ssss)) {
				String qdes="";
				Question question=new Question();
				qdes=question.Set_Q();
				question.Disc=qdes;
				//System.out.println("Enter Question Description: ");
			//	qdes=sscanner.nextLine();


				aControl.Add_PI(cat, des, img, question, ""+User_Model.User_Database.size());

				//Post xPost=new Post();
			//	xPost.Show_Details();


			}
			else
			{
				Question question=null;
				aControl.Add_PI(cat, des, img, question, "0");

			}


		}
		if(select==4&&flag==true)
		{

			User_control uControl= new User_control();
			uControl.Delete_User(curr_user.ID);
			Post_Control post_control=new Post_Control();
			post_control.Delete_Posts(curr_user.ID);
			flag=false;


		}

		if(select==7&&flag==true)
		{
			System.out.println("Set Report description:");
			String rep_des=scanner.nextLine();
			System.out.println("Set Post_ID (optional to best service)");
			String post_id=scanner.nextLine();
			User_control uControl= new User_control();
			uControl.Create_Report(rep_des,curr_user.ID,post_id);



		}

		if(select==10&&flag==true)
		{
			flag=false;
		}

	}



}
}
