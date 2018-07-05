package bean;



public class Login {
	
	private String userName;
	private int password;
	
	
	public Login() {
		super();
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public int getPassword() {
		return password;
	}


	public void setPassword(int password) {
		this.password = password;
	}
	
	public String checkUser() {
		if(userName.equals("ahmed") && password == 1234) {
			return "Success";
		}else
			return "Fail";
		
	}
	
	

}
