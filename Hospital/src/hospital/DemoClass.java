package hospital;

import javax.swing.JOptionPane;
import PakgOne.Date;
import PakgOne.Time;
public class DemoClass
{ 
 public static void main (String [] args)
 {
	 String choice;
	 String n;
	 n=JOptionPane.showInputDialog("how many doctors you want to enter?");
	 int numOD = Integer.parseInt(n);
	 Doctor [] dobj = new Doctor [numOD];
	 for (int i=0 ; i <numOD ;i++)
	 {
		 dobj[i].addDoctor();
		 String m;
		 m=JOptionPane.showInputDialog("how many patients of this doctor ?");
		 int numOP = Integer.parseInt(m);
		 Patient [] pobj =  new Patient [numOP];
		 for (int j=0 ; j <numOP ;j++)
		 {
			 pobj[i].addPatient();
		 }
	 }
	 String o;
	 o=JOptionPane.showInputDialog(" num of indoor Patients ?");
	 int numIDP = Integer.parseInt(o);
	 IndoorPatient [] ipobj = new IndoorPatient [numIDP];
	 String p;
	 p=JOptionPane.showInputDialog(" num of outdoor Patients ?");
	 int numODP = Integer.parseInt(p);
	 OutdoorPatient [] opobj = new OutdoorPatient [numODP];
	 OutdoorPatient oobj = new OutdoorPatient();
	 IndoorPatient iobj = new IndoorPatient();
	 String a;
	 a=JOptionPane.showInputDialog(" dates");
	 int numD = Integer.parseInt(a);
	 Date [] daobj = new Date[numD];
	 Time  tobj = new Time();
	 int flag=0;
			 do
 		{
			System.out.println("1: Add an indoor patient: ");
			System.out.println("2: Add an outdoor patient: ");
 			System.out.println("3: see the list of all docters: ");
 			System.out.println("4: search the doctor by name or department: ");
 			System.out.println("5: see the list of all indoor patients: ");
 			System.out.println("6: see the list of all appointments on certain day: ");
 			System.out.println("7: see the list of appointment of certain doctor: ");
 			System.out.println("8: change the date or time of appointment of certain patient: ");
 			System.out.println("9: exit: ");
 			String num = JOptionPane.showInputDialog( " Enter option ");
 			int number=Integer.parseInt(num);
 			if(number==1)
 			{
 				iobj.addIDPatient();
  			}
 			else if(number==2)
 			{
 				oobj.addODPatient();
 			}
 			else if(number==3)
 			{
 				for(int i=0;i<numOD;i++)
 				{
 					dobj[i].toString();
  				}
 			}
 			else if(number==4)
 			{
 				System.out.println("1:search by docter name: ");
 				System.out.println("2: search by docter department: ");
 				System.out.println("3: entre ur choice: ");
 				String option = JOptionPane.showInputDialog( " Enter number ");
 	 			int opt=Integer.parseInt(option);
 				if(opt==1)
 				{
 					String docname=JOptionPane.showInputDialog("entre doctor name for this patient");
 				for(int i=0;i<numOD;i++) {
 					if(docname.equalsIgnoreCase(dobj[i].getName()))
 					{
 						dobj[i].toString();
 	 					flag=1;
 					}
 				}
 				if(flag==0)
 				{
 					System.out.println("docter name not fount");
 				}
 				}
 				else if(opt==2)
 				{
 					String ddepart=JOptionPane.showInputDialog("enter name of department for the doctor to search");
 					for(int w=0;w<numOD;w++)
 					{
 						if(ddepart.equalsIgnoreCase(dobj[w].getDepartment()))
 						{
 							dobj[w].toString();
  							flag=1;
 						}
 							
 					}
 					if(flag==0)
 					{
 						System.out.println("Name of department not found");
 					}
 		        }
 			    else
 			    {
 					System.out.println("enter valid choice");
 			    }
 		      }
 			  else if (number==5)	
 			  {
 				
 				
 				for(int i=0; i<numIDP ;i++)
 				{
 					ipobj[i].toString();
 					flag =1;
  				}
 				if(flag==0)
 				{
 					System.out.println("no indoor patient in hospital");
 				}
 		     }
 			
 			 else if (number==6)	
 			 {
 			    String apday=JOptionPane.showInputDialog("enter day to list appointment");
 			    int apd=Integer.parseInt(apday);
 				for(int i =0; i<numD; i++)
 				{
 			       if(apd == daobj[i].getday())
 						{
 			    	 ipobj[i].toString();
 			    	 opobj[i].toString();
 			    	 flag=1;
 					    }
 		         }
 				if(flag==0)
 				   {
 					System.out.println("no appointment on this day");
 				   }
 			}
 			 
 				else if (number==7)	
 				{
 					
 				String dn=JOptionPane.showInputDialog("enter doctor name to list all appointments");
 				
 					for(int i=0;i<numOD;i++)
 					{
 						
 							if(dn.equalsIgnoreCase(dobj[i].getName()))
 							{
 						ipobj[i].toString();
 							flag=1;
 							}
 					}
 					if(flag==0)
 					{
 						System.out.println("no  doctor appointment on this day");
 					}
 				}
 				else if(number==8)
 				{
 					System.out.println("1: to search appointment by date");
 					System.out.println("2: to search appointment by time");
 					System.out.println("enter choice");
 					String option = JOptionPane.showInputDialog( " Enter number ");
 	 	 			int opt=Integer.parseInt(option);
 	 				if(opt==1)
 					{
 				        flag=0;
 					String patn=JOptionPane.showInputDialog("enter patient name to change date of  appointment");
 						for(int i=0;i<numD;i++)
 						{
 							if(patn.equalsIgnoreCase(ipobj[i].getName()))
 								{
 								  ipobj[i].getdate();
 								  flag=1;
 								  daobj.toString();
 								}
 							if(patn.equalsIgnoreCase(opobj[i].getName()))
								{
								  opobj[i].getdate();
								  flag=1;
								  daobj.toString();
								}
 						}
 						if(flag==0)
 								{
 									System.out.println("no outdoor or indoor patient with this name");
 								}
 								
 							}
 					if(opt==2)
 						
 					{
 			            flag=0;
 						String patn=JOptionPane.showInputDialog("enter patient name to change time of  appointment");
 						for(int i=0;i<numODP;i++)
 							{
 							 if(patn.equalsIgnoreCase(opobj[i].getName()))
 								{
 							      opobj[i].getTime();
 								  flag=1;
 							      tobj.toString();
 								}
 							}
 							if(flag==0)
 							{
 								System.out.println("no outdoor patient with this name");
 							}
 					}
 					else
 					{
 						System.out.println("enter valid choice");
 					}
 				}
 				else
 				{
 					System.out.println("enter valid choic OR exit");	
 				}
 			choice = JOptionPane.showInputDialog( " Do you want to continue,,, Enter Y or N ");
 	}while(choice=="y");
 } 
}

