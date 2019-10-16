package csc4710_Espere_part1;

public class users {

	protected int userID;
	protected String pass;
	protected String firstName;
	protected String lastName;
	protected String email;
	protected String gender;
	protected int age;
	
	public users() {
		
	}
	
	public users(int userID) {
		this.userID = userID;
	}
	
	public users(int userID, String pass, String firstName, String lastName, String email, String gender, int age) {
		this(pass, firstName, lastName, email, gender, age);
		this.userID = userID;
	}
	
	public users(String pass, String firstName, String lastName, String email, String gender, int age) {
		this.pass = pass;
		this.firstName = firstName;
		this.lastName =lastName;
		this.email = email;
		this.gender = gender;
		this.age = age;
}
	public int getuserID() {
		return userID;
	}
	
	public void setuserID(int userID) {
		this.userID = userID;
	}
	
	public String getpass() {
		return pass;
	}
	
	public void setpass(String pass) {
		this.pass = pass;
	}
	
	public String getfirstName() {
		return firstName;
	}
	
	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getlastName() {
		return lastName;
	}
	
	public void setlastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getEmail() {
		return email;
	}

	public void setemail(String email) {
		this.email = email;
	}
	
	public String getgender() {
		return gender;
	}
	
	public void setgender(String gender) {
		this.gender = gender;
	}
	
	public int getage() {
		return age;
	}
	
	public void setage(int age) {
		this.age = age;
	}
}
