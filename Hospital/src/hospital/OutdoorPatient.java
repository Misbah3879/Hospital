package hospital;

import PakgOne.Date;
import PakgOne.Time;

import javax.swing.JOptionPane;

public class OutdoorPatient extends Patient 
{
	private Date dat;
	private Time ti;
	private Doctor doc;
	private String fee;
	public OutdoorPatient()
    {
    	super();
    	fee = " ";
    }
	public OutdoorPatient(String name,String cnic,String address,String phoneno,String gender,String age,String fee)
	{
		super(name, cnic, address, phoneno, gender, age);
        this.fee=fee;
	}
	 public void getdoctorName()
	    {
	 	   doc.getName();
	 	}
	 public void getdate()
	    {
	 	   dat.getday();
	 	   dat.getmonth();
	 	   dat.getyear();
	 	}
	public void getTime()
	{
		ti.getHour();
	 	   ti.getMint();
	 	   ti.getTime();
	}
	public int getfee()
	{
		String fee=JOptionPane.showInputDialog("Enter fee of outdoorpatient");
   	    int fee1=Integer.parseInt(fee);
		return fee1;
	}
	public void setfee(String fe)
	{
		this.fee=fe;
	}
	public void addODPatient()
	{
		addPatient();
		getfee();
	}
	public String toString() {
		return super.toString() + "fee" + fee ;
	}
}

