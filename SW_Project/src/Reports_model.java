//package com.company;
import java.util.Vector;

public class Reports_model
{
	public static String id="112";
	public static Vector<Report> Rep_Database= new Vector<Report>();
	public String Add_Report(Report report)
	{
		report.Report_ID=id;
		int temp= Integer.parseInt(id);
		temp++;
		id=temp+"";
		return report.Report_ID;

	}

}
