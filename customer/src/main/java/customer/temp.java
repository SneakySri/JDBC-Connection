package customer;
import java.sql.SQLException;
import java.util.Scanner;
public class temp{
	
	int amt,inst,n,emi;
	
	void loancalc(int interest,int pri) {
		
		Scanner sc=new Scanner(System.in);
		// simple interest=pnr/100
		
		int ch=0;
		
		
//		n=years
		System.out.println("no. year  interest     amount   emi/mon");
		n=12/12;
		inst=(int) (pri*n*interest)/100;
		amt=pri+inst;
		emi=amt/12;
		System.out.println("1.   "+n+"      "+inst+"         "+amt+"     "+emi);
		
		n=24/12;
		inst=(int) (pri*n*interest)/100;
		amt=inst+pri;
		emi=amt/24;
		System.out.println("2.   "+n+"      "+inst+"        "+amt+"     "+emi);
		 
		n=36/12;
		inst=(int) (pri*n*interest)/100;
		amt=inst+pri;
		emi=amt/36;
		System.out.println("3.   "+n+"      "+inst+"        "+amt+"     "+emi);
		System.out.println("4.Exit");
		
		do {
		
		 System.out.println("enter your choice : ");
		 ch=sc.nextInt();
		
		 switch(ch) {
			
			case 1:{
				n=12/12;
				inst=(int) (pri*n*interest)/100;
				amt=pri+inst;
				emi=amt/12;
				System.out.println("\nLoan is Credited\nof Rupees "+(amt-emi));
					
			}return;
			case 2:{
				n=24/12;
				inst=(int) (pri*n*interest)/100;
				amt=inst+pri;
				emi=amt/24;
				System.out.println("\nLoan is Credited\nof Rupees "+(amt-emi));
					
			}return;
		
			case 3:{
				n=36/12;
				inst=(int) (pri*n*interest)/100;
				amt=inst+pri;
				emi=amt/36;
				System.out.println("\nLoan is Credited\nof Rupees "+(amt-emi));
					
			}return;
		
			case 4:{
				return;
			
			}
			default:System.out.println("invalid");break;
			}
		  if(ch==4) {
			 break;
		 }
		}while(ch!=4);
		
		
	}

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		temp a= new temp();
//		a.loancalc(50, 1000);
//		
////		int amt,inst,n,emi;
//		System.out.println(a.n+" "+a.amt+" "+a.inst+" "+a.emi);
//		
//
//	}

}
