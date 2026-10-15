package org.emp;

public class Employee {
		
		public static void main(String args[]) {
			
		Employee details = new Employee();
		details.empId();
		details.empName();
		details.empDob();
		details.empEmail();
		details.empAddress();
		
	}
		 private void empId() {
				System.out.println("emp id :1234");
			}
			private void empName() {
				System.out.println("emp name:karthi");
			}	
			private void empDob() {
				System.out.println("emp dob:12/07/2007");
			}
			private void empEmail() {
				System.out.println("emp email:karthi12@gmail.com");
			}
			private void empAddress() {
				System.out.println("emp Address:chennai");
			}

}
