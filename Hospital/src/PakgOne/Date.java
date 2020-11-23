package PakgOne;

import javax.swing.JOptionPane;

public class Date {
	  private String day ,month ,year;
	  public Date()
	   {
		   day="";
		  month="";
		year="";
	   }
	   public Date(String day,String month,String year)
	   {
		   this.day=day;
		  this.month=month;
		  this.year=year;
	   }
	   public int getday()
	   {
	   String day=JOptionPane.showInputDialog("Enter a day:");
		  int day1=Integer.parseInt(day);
		  return day1;
	   }
	   public void setday(String d)
	   {
		   this.day=d;
	   }
	public int getmonth()
	{
		String month=JOptionPane.showInputDialog("Enter a month:");
		  int month1=Integer.parseInt(month);
		return month1;
	}
	public void setmonth (String m)
	{
		this.month=m;
	}
	public int getyear()
	{
		String year=JOptionPane.showInputDialog("Enter a year:");
		  int year1=Integer.parseInt(year);
		return year1;
	}
	public void setyear(String r)
	{
		year=r;
	}
	public Date getDate(Date d)
	{
		this.day=d.day;
		this.month=d.month;
		this.year=d.year;
		return d;
	}
	public String toString()
	{
		return day+" / " +month+" / "+year;
	}
}


