//package com.company;
public class Report {
	public String USer_ID;
	public String Post_ID;
	public String report;
	public String Report_ID;

	public boolean  New_Report(String Disc , String User_id , String Post_id)
	{

		USer_ID=User_id;
		Post_ID=Post_id;
		report=Disc;
		Reports_model reports_model=new Reports_model();
		Report_ID= reports_model.Add_Report(this);
		this.Inform_Dev(Report_ID);
		return true;

	}

	public void Inform_Dev(String report_id)
	{



	}
}
