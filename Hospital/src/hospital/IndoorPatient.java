package hospital;

import PakgOne.Date;
import javax.swing.JOptionPane;

public class IndoorPatient extends Patient
{
    private String wardno ,roomno , bedno ,fee;
    private Doctor d ;
    private Date da ;
    public IndoorPatient()
    {
    	super();
    	wardno = "" ;
    	roomno = " ";
    	bedno = " ";
    	fee = " ";
    }
    
    public IndoorPatient(String name,String cnic,String address,String phoneno,String gender,String age,String wardno,String roomno,String bedno,String fee)
    {
    	super(name, cnic, address, phoneno, gender, age);
    	this.wardno=wardno;
    	this.roomno=roomno;
    	this.bedno=bedno;
    	this.fee=fee;
     }
     public int getwardno()
    {
    	String wardno=JOptionPane.showInputDialog("Enter wardno of patient");
  	   int wardno1=Integer.parseInt(wardno);
 	   return wardno1;
    }
    public void setwardno(String wno)
    {
 	   this.wardno=wno;
    }
    public int getroomno()
    {
    	 String roomno=JOptionPane.showInputDialog("Enter roomno of patient");
   	   int roomno1=Integer.parseInt(roomno);
 	   return roomno1;
    }
    public void setroomno(String rno)
    {
 	   this.roomno=rno;
    }
    public int getbedno()
    {
    	String bedno=JOptionPane.showInputDialog("Enter bedno of patient");
  	   int bedno1=Integer.parseInt(bedno);
 	   return bedno1;
    }
    public void setbedno(String bno)
    {
 	   this.bedno=bno;
    }
    public int getfee()
    {
        String fee=JOptionPane.showInputDialog("Enter fee of indoorpatient");
   	    int fee1=Integer.parseInt(fee);
   	     return fee1;
    }
    public void setfee(String fe)
    {
  	  this.fee=fe;
    }
    public void getdoctorName()
    {
 	   d.getName();
 	}
    public void getdate()
    {
 	   da.getday();
 	   da.getmonth();
 	   da.getyear();
 	}
    public void addIDPatient()
    {
    	addPatient();
    	getwardno();
    	getroomno();
    	getbedno();
    	 getfee();
   }
	public String toString() {  
		return  super.toString() +" wardno" + wardno + " roomno"+ roomno +" bedno"+ bedno + " fee"+ fee ;
	}
 }