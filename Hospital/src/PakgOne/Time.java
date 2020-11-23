package PakgOne;

import javax.swing.JOptionPane;

public class Time {
	private String hours, mint, ampm;
	public Time()
	  {
		  hours = "  ";
		  mint = " ";
		  ampm = " ";
	  }
	  Time(String hours,String mint,String ap)
	  {
		  this.hours=hours;
		  this.mint=mint;
		  this.ampm=ap;
	  }
	    public int getHour()
	  {
		  String hours=JOptionPane.showInputDialog("Enter housr:");
		  int hour1=Integer.parseInt(hours);
		  return hour1;
		  
	  }
	    public void setHour(String h)
	    {
	    	hours=h;
	    }
	 public int getMint()
	  {
		  String mint=JOptionPane.showInputDialog("Enter mint:");
		  int mint1=Integer.parseInt(mint);
		  return mint1;
	  }
	  public void setMint(String m)
	    {
	    	mint=m;
	    }
	  
	  public String getTime()
	  {
		  String ampm=JOptionPane.showInputDialog("Enter Am / Pm:");
		  return ampm;
	  }
	  public void setTime(String ti)
	    {
	    	ampm=ti;
	    }
	 public Time getTime(Time t)
		{
			this.hours=t.hours;
			this.mint=t.mint;
			this.ampm=t.ampm;
			return t;
		}
	  public String toString()
	  {
		  return  "Hour"  +getHour()+  "Mint="   +getMint()+ "Time"  +getTime() ;
	  }
	}


