package hospital;

import javax.swing.JOptionPane;

public class Patient {
	private String name ,cnic,address,phoneno,gender,age;
	public
	Patient()
	{
		name="misbah ";
		cnic="3710530677406";
		address= "Rwp"; 
		phoneno= "03015259915";
		gender="f ";
		age="18 ";
	}
	Patient(String n,String c,String a,String p,String g,String ag)
	{
		name=n;
		cnic=c;
		address= a; 
		phoneno= p;
		gender=g;
		age=ag;
	}
	  public String getName() 
      {
    	  String Name=JOptionPane.showInputDialog("Enter name:");
    	  return Name;
      }
	public void setname(String n)
	{
		name=n;
	}
	public int getCnic()
    {
  	  String cnic=JOptionPane.showInputDialog("Enter cnic: ");
		  int cnic1=Integer.parseInt(cnic);
		  return cnic1;
    }
	public void setcnic(String c)
	{
		cnic=c;
	}
	 public String getAddress() 
     {
   	  String Address=JOptionPane.showInputDialog("Enter address:");
   	  return Address;
     }
	public void setaddress(String a)
	{
		address=a;
	}
	 public int getphoneno()
     {
   	  String phoneno=JOptionPane.showInputDialog("Enter phoneNumber:");
		  int phoneno1=Integer.parseInt(phoneno);
		  return phoneno1;
     }
	public void setphone_no(String r)
	{
		phoneno=r;
	}
	public String getGender() 
    {
  	  String Gender=JOptionPane.showInputDialog("Enter Gender:");
  	  return Gender;
    }
	public void setgender(String r)
	{
		gender=r;
	}
	 public int getAge()
     {
   	  String age=JOptionPane.showInputDialog("Enter age:");
		  int age1=Integer.parseInt(age);
		  return age1;
     }
	public void setage(String ag)
	{
		age=ag;
	}
	public  void addPatient()
   	{
		getName();
		getCnic();
		getAddress();
		getphoneno();
		getGender();
		getAge();
   	}
	public  Patient getPatientInfo(Patient p)
   	{
   		this.name=p.name;
   		this.cnic=p.cnic;
   		this.address=p.address;
   		this.phoneno=p.phoneno;
   		this.gender=p.gender;
   		this.age =p.age;
   		return p;
   	}
	public String toString()
	{
		return "Patient's Name: "+getName() +" cnic: "+getCnic()+"  phoneno "+getphoneno()+ " address: "+getAddress()+" gender: "+getGender() +" age "+getAge();
	}
}

