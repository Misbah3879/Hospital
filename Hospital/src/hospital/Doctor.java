package hospital;

import javax.swing.JOptionPane;


public class Doctor {
          private  String name, cnic, phoneno, gender, department, specialization;
          Doctor()
          {
        	  name=" ";
        	  cnic=" ";
        	  phoneno=" ";
        	  gender=" ";
        	  department=" ";
        	  specialization=" ";
          }
          Doctor(String name,String cnic, String phoneno, String gender, String department,String  specialization)
          {
        	  this.name=name;
        	  this.cnic=cnic;
        	  this.phoneno=phoneno;
        	  this.gender=gender;
        	  this.department=department;
        	  this.specialization=specialization;
          }
       public String getName() 
          {
        	  String Name=JOptionPane.showInputDialog("Enter name:");
        	  return Name;
          }
   public void setName(String n)
      	{
      		name=n;
      	}
      public int getCnic()
          {
        	  String cnic=JOptionPane.showInputDialog("Enter cnic: ");
    		  int cnic1=Integer.parseInt(cnic);
    		  return cnic1;
          }
      public void setCnic(String c)
      	{
      		cnic=c;
      	}
     public int getphoneno()
          {
        	  String phoneno=JOptionPane.showInputDialog("Enter phone Number:");
    		  int phoneno1=Integer.parseInt(phoneno);
    		  return phoneno1;
          }
     public void setphone(String p)
      	{
      		phoneno=p;
      	}
      public String getGender() 
          {
        	  String Gender=JOptionPane.showInputDialog("Enter Gender:");
        	  return Gender;
          }
      public void setgender(String g)
      	{
      		gender=g;
      	}
       public String getDepartment()
          {
        	  String Department=JOptionPane.showInputDialog("Enter Department name:");
        	  return Department;
          }
        public void setDepartment(String d)
      	{
      		department=d;
      	}
       public String getSpecialization()
          {
        	  String Specialization=JOptionPane.showInputDialog("Enter Specialization:");
        	  return Specialization;
          }
       public void setSpecialization(String s)
      	{
      		specialization=s;
      	}
  public  Doctor getDoctorInfo(Doctor doc)
   	{
   		this.name=doc.name;
   		this.cnic=doc.cnic;
   		this.phoneno=doc.phoneno;
   		this.gender=doc.gender;
   		this.department=doc.department;
   		this.specialization=doc.specialization;
   		return doc;
   	}
   	public  void addDoctor()
   	{
   		getName();
   		getCnic();
   		getphoneno();
   		getGender() ;
   		getDepartment();
   		getSpecialization();
   	}
       public String toString()
   	{
   		return "Doctor's Name: "+getName()+" Departmant: " +getDepartment()+" Specialization "+getSpecialization()+" cnic: "+getCnic()+" phoneno "+getphoneno()+ " gender: "+getGender();
   	}
          
}
