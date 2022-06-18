package bus_Reservation;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Bus
{
	public void passenger_details() {
		try{ Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happyquest","root","Deepika@5799"); 
		Statement st=con.createStatement(); 
		ResultSet rs=st.executeQuery("select * from busreservation");
		while(rs.next())
		{
		   System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6)+"\t"+rs.getString(7)+"\t"+rs.getString(8)); 
		} 
		} 
		catch(Exception e)
		{ 
			System.out.println(e.toString());
		}
	    }
	
	 public void cancelticket() {
		    try{ Class.forName("com.mysql.cj.jdbc.Driver");
		    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happyquest","root","Deepika@5799"); 
		    Statement st=con.createStatement(); 
			st.executeUpdate("delete from busreservation where seatno = 1"); 	
			System.out.println("Ticket Cancelled Successfully........!!");
			con.close(); 
			} 
			catch(Exception e)
			{ 
			   System.out.println(e.toString());
			}
			}
	
	 public void bookticket() {
			try{ Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/happyquest","root","Deepika@5799"); 
			Statement st=con.createStatement(); 
			st.executeUpdate(("insert into busreservation values(1,'Deepika','Female',23,'Tirunelveli','Chennai','2022-10-15',890)"));
			System.out.println("Booked Successfuly...........!!");
			con.close();
			} 
			catch(Exception e)
			{ 
				System.out.println(e.toString());
			}
			}   
	@SuppressWarnings("static-access")
	public static void main(String args[])
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Press");
		System.out.println("1. Book Ticket");
		System.out.println("2. Cancel Ticket");
	    System.out.println("3. All Passenger Details");
		int i = sc.nextInt();
		Bus b = new Bus();
		
		switch(i)
		{
		
		case 1:
			b.bookticket();
			break;
			
		case 2:
			b.cancelticket();
			break;
			
		case 3:
			b.passenger_details();
			break;
		
		
	}
	
	}}
