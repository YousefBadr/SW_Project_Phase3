import java.util.Scanner;

public class Main {
public static void main(String[] args) 
{
	while (true) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("1-Add Pi");
		System.out.print("Enter Command num:");
		int select=scanner.nextInt();
		
		if(select==1)
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
		//	aControl.Add_PI(cat, des,img);
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
	}

	
}
}
