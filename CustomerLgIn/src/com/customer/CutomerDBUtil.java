package com.customer;

import java.sql.Connection;
import java.sql.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;



public class CutomerDBUtil{
 		public static List<Customer> validate(String userName, String Password){
 			
			ArrayList<Customer> cus= new ArrayList<>();
			
			//create database connection
			String url = "jdbc:mysql://localhost:3306/hotel";
			String user = "root";
			String password = "sanju";
			
			
			//validate
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection conn = DriverManager.getConnection(url,user,password);
				Statement stmt = conn.createStatement();
				String sql = "select * from customer where UserName='"+userName+"' and Password='"+Password+"'  ";
				ResultSet rs = stmt.executeQuery(sql);
				
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
}
