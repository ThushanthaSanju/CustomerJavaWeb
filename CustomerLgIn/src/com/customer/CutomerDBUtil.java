package com.customer;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class CutomerDBUtil{
  
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;

	public static List<Customer> validate(String userName, String Password){

		ArrayList<Customer> cus= new ArrayList<>();


		try {

			con= DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where UserName='"+userName+"' and Password='"+Password+"'  ";
			rs = stmt.executeQuery(sql);

			if(rs.next()) {
				int id = rs.getInt(1);
				String nameString = rs.getString(2);
				String email = rs.getString(3);
				String phone = rs.getString(4);
				String userr = rs.getString(5);
				String passU = rs.getString(6);

				Customer customer = new Customer(id, nameString, email, phone, userr, passU);

				cus.add(customer);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}


		return cus;
	}

	public static boolean insertcustomer(String name,String email,String phone,String userr,String passU) {

		boolean isSuccess=false;



		try {

			con= DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "insert into customer values(0,'"+name+"','"+email+"','"+phone+"','"+userr+"','"+passU+"')";
			int rs = stmt.executeUpdate(sql);

			if(rs>0) {
				isSuccess=true;
			}else {
				isSuccess=false;
			}

		} catch (Exception e) {
			e.printStackTrace();	
		}


		return isSuccess;
	}
		
	public static boolean upadatecustomer(String id,String name,String email,String phone,String userr,String passU) {
		
		try {
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "update customer set Name='"+name+"',Email='"+email+"',phone='"+phone+"',UserName='"+userr+"',Password='"+passU+"'"
					+"where CustomerID='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if (rs>0) {
				isSuccess = true;
			}else {
				isSuccess = false;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Customer> getCustomerDetails(String id){
		ArrayList<Customer> cus =new ArrayList<Customer>();
		
		try {
			
			int convertedId =Integer.parseInt(id);
			
			con = DBConnect.getConnection();
			stmt = con.createStatement();
			String sql = "select * from customer where CustomerID='"+convertedId+"'";
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				int Id = rs.getInt(1);
				String Name = rs.getString(2);
				String Email = rs.getString(3);
				String Phone = rs.getString(4);
				String UserName = rs.getString(5);
				String Password = rs.getString(6);
				
				Customer c = new Customer(Id, Name, Email, Phone, UserName, Password);
				cus.add(c);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return cus;
	}

}











