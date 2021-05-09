package com.customer;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class CutomerDBUtil{
  
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


}
