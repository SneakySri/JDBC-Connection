package customer;

import java.sql.*;
import java.util.*;



public class banking extends temp{
	Scanner sc=new Scanner(System.in);
	
	int income, bo,cibil,wp;
	
	static void validate(int income,int bo,int cibil, int workperiod) throws ineligibleloanException{
		
		if (income<10000) {
			
			throw new ineligibleloanException("not eligible for loan due to low income");

		}
		else if(cibil<500) {
			
			throw new ineligibleloanException("not eligible for loan due to low cibil score");
			
		}
		
		else if(workperiod<6) {
			
			throw new ineligibleloanException("not eligible for loan due to low workperiod");
			
		}
		else if(bo<6) {
			
			throw new ineligibleloanException("not eligible for loan due to bankaccount created less than 6months");
		}
				
	}
	
	
	
	void display(Statement st,String name) {
		
		try {
			
			System.out.println("\n\t\tWELCOME "+name.toUpperCase());
			
			ResultSet r= st.executeQuery("select * from customers where fname='"+name+"'");
            
            System.out.println("=======================================================");
			
			while(r.next()) {
				System.out.println("NAME: "+r.getString(1)+"\t  mon ac opened : "+r.getString(2)+"\tphone no: "+r.getString(3)+"\npan: "+r.getInt(4)+"\t  addhar "+r.getInt(5)+"\t\tcity: "+r.getString(6)+"\npincode : "+r.getString(7)+"  Designation: "+r.getString(8)+" ac no :"+r.getInt(11)+"\nbal :"+r.getInt(12) );
			}
			
			System.out.println("=======================================================");
			
			System.out.println("Want any loan:\n1.yes\n2.no ");
		
			int ch=sc.nextInt();
			if(ch==1) {
				//	income, bo,cibil,wp;
			System.out.println("enter your income: ");
			income=sc.nextInt();
			
			System.out.println("enter your bankaccount open month: ");
			bo=sc.nextInt();
			
			System.out.println("enter your cibilScore: ");
			cibil=sc.nextInt();
			
			System.out.println("enter your workingexperience: ");
			wp=sc.nextInt();
			
			validate(income,bo,cibil,wp);
			System.out.println("\n1.personal loan\n2.studentloan\n3.homeloan\n select one :");
			int c =sc.nextInt();
			int pri=0;
			int inst=0;
			
			switch(c) {
			case 1:{
				System.out.println("Available loans are \n 1."+income*5+"\t15%\n2."+income*10+"\t15%");
				int h=sc.nextInt();
				inst=15;
				switch(h) {
				case 1:{
					pri=income*5;
				}
				case 2:{
					pri=income*10;
				}
				default:System.out.println("Invalid choice");
				}
				
			}break;
			
			case 2:{
				System.out.println("Available loans are \n 1."+income*3+"\t8%\n2."+income*5+"\t8%");
				int h=sc.nextInt();
				inst=8;
				switch(h) {
				case 1:{
					pri=income*3;
				}break;
				case 2:{
					pri=income*5;
				}break;
				default:System.out.println("Invalid choice");
				}
			}
			case 3:{
				System.out.println("Approach our staffs with you docments they will valuate your property");
			}
			default:System.out.println("Invalid choice");
			}
			
			System.out.println("principle :"+pri+"\n interst : "+inst );
			
			loancalc(inst,pri);
			
			
		}
		else { 
			return;
		}
			
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
	}
	


	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int a=0;
		int id=0;
		String fname="";
		String lname="";
		int mobile=0;
		String pan="";
		 int  adhar=0;
		String city="";
		int pincode=0;
		String profession="";
		String email="";
		String password="";
		int account=0;
		int balance=454874;
		
		banking b=new banking();
		
		Scanner sc=new Scanner(System.in);
		  String url="jdbc:mysql://localhost:3307/banking";
		  String username ="root";
		  String pass = "root16";
		  

		  try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  Connection con =  DriverManager.getConnection(url,username,pass);
			try {
				con = DriverManager.getConnection(url,username,pass);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			  Statement st=con.createStatement();
			  
			  
		//	  b.display(st,"sri");
			  
		 
	   do {
		  System.out.println("                                                        WELCOME TO WELL INTERNATIONAL BANK");
		  System.out.println("=======================================================================================================================================================");
	      System.out.println("                                                        HERE ARE THE SERVICES YOU GET");	
	      System.out.println("\t[CLICK 1 FOR SIGNUP][2 FOR LOGIN][3FOR EXIT]");	
	      a=sc.nextInt();
	    	  
	      switch(a) {
	      case 1:{
	    	    System.out.print("PLEASE ENTER YOUR ID : ");
				 id=sc.nextInt();
	    	  
	    		System.out.print("\nPLEASE ENTER YOUR FIRST NAME : ");
				 fname=sc.next();
				
				System.out.print("\nPLEASE ENTER THE AC CREATED DATE : ");
				 lname=sc.next();
				
				System.out.print("\nPLEASE ENTER YOUR MOBILE NUMBER : ");
				 mobile=sc.nextInt();
				
				System.out.print("\nPLEASE ENTER YOUR PAN CARD NUMBER : ");
				 pan=sc.next();
				
				System.out.print("\nPLEASE ENTER THE ADHAR NUMBER : ");
				 adhar=sc.nextInt();
				
				System.out.print("\nPLEASE ENTER YOUR CITY : ");
				 city=sc.next();
			
				System.out.print("\nPLEASE ENTER YOUR PINCODE : ");
					 pincode=sc.nextInt();
					 
				System.out.print ("\nPLEASE ENTER YOUR PROFESSION :");
				 profession=sc.next();
				
				System.out.print("\nPLEASE ENTER YOUR EMAIL : ");
				 email=sc.next();
				 
				System.out.print("\nPLEASE ENTER YOUR PASSWORD :");
					 password=sc.next();
					
				System.out.print("\nPLEASE ENTER YOUR ACCOUNT NUMBER :");
					 account=sc.nextInt();
					 
			    System.out.print("\nPLEASE ENTER YOUR BALANCE :");
				int bal=sc.nextInt();	 
					 
					
					 int n=0;
					 int x=st.executeUpdate("insert into customers values('"+fname+"','"+lname+"','"+mobile+"','"+pan+"','"+adhar+"','"+city+"','"+pincode+"','"+profession+"','"+email+"','"+password+"','"+account+"','"+bal+"','"+id+"')");
						if(x>0) {
							System.out.println("\nSIGNUP SUCCESS NOW YOU CAN LOGIN TO THE APPLICATION");
							System.out.println("======================================================================================================");
						}
	      }break;
	      case 2:{
	    	  System.out.println("LOGIN PAGE");
	    	  
	    	  int flag=0;
	    	  
	    	  do {
	    	  System.out.println("Enter the user name: ");
	    	  String name=sc.next();
	    	  ResultSet rs=st.executeQuery("select * from customers");
	    	  while (rs.next()) {
	    		  
	    		  if(rs.getString(1).equals(name)){
	    			  System.out.println("Enter the pass: ");
	    	    	  String pas=sc.next();
	    	    	  
	    	    	  if(rs.getString(10).equals(pas)){
	    	    		  System.out.println("login success");
	    	    		  b.display(st,name);
	    	    		  flag=1;
	    	    		  break;
	    	    	   
	    	    	  }
	    			  
	    		  }
	    		
	    		}
	    	  
	    	    if (flag==1) {
	    			 break;
	    	     }
	           System.out.println("Username not found ...");
	    	   
	    	  }while(true);
	       }break;
	       
	      case 3:{
	    	  
	    	  break;
	        }
	      
	      }
	      }while(a!=3);
	}
}