package com.customer;

public class Customer {
		private int id;
		private String nameString;
		private String emailString;
		private String phoneString;
		private String userNameString;
		private String passwordString;
		
		

		public Customer(int id, String nameString, String emailString, String phoneString, String userNameString,
				String passwordString) {
			
			this.id = id;
			this.nameString = nameString;
			this.emailString = emailString;
			this.phoneString = phoneString;
			this.userNameString = userNameString;
			this.passwordString = passwordString;
		}
		
		
		public int getId() {
			return id;
		}


		public String getNameString() {
			return nameString;
		}


		public String getEmailString() {
			return emailString;
		}


		public String getPhoneString() {
			return phoneString;
		}


		public String getUserNameString() {
			return userNameString;
		}


		public String getPasswordString() {
			return passwordString;
		}


}
