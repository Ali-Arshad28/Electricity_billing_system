import controller.*;
import java.util.*;
import java.io.*;

public class Main {

	

public static void main(String[] args) throws Exception
{
Connection connect = new Connection();
Customer customer = new Customer();
Meter meter = new Meter();
Units units = new Units();
Bills bills = new Bills();

connect.meter_list();
connect.bill_list();
connect.unit_list();
int n;
 Scanner s = new Scanner(System.in);
 System.out.println(" Enter 1 if you are from management ");
 System.out.println(" Enter 2 if you are a customer/visitor ");
  n = s.nextInt();
 
 if(n==1){
 System.out.println(" Enter 5 if you want to add a new customer ");
 int a;
 a= s.nextInt();
 if(a==5){
customer.add_customer();	 
 
 }}
 

 if(n==2){

System.out.println(" Enter 1 to view a bill of any customer ");	 
System.out.println(" Enter 2 to make a new connection ");
System.out.println(" Enter 3 to view the applicants list  ");
System.out.println(" Enter 4 to calculate the bill ");
 int n2 = s.nextInt();

 if(n2==1){
	 
System.out.println(" There  are currently six customers in the list  ");
System.out.println(" Their sr# are from 0-5, sr# will increase in the same order as the new customers added  ");
System.out.println(" If you want to view any customer's bill ");
System.out.println(" Enter the sr# of a customer ");
int n3 = s.nextInt();
bills.display_bill(n3);
 }
 if (n2==2){
customer.add_customer_request(); 
 }

 if (n2==3){
customer.customer_requests();
 }
 if(n2==4){
int unit;
System.out.println(" Enter the units consumed "); 
unit = s.nextInt();
System.out.println(" Your Bill is :-  Rs."+bills.calculate_bill(unit));
 }	 
 }

}
}

 

