package com.sab.login;

public class LoginService {
	public Boolean userValid(String name, String Password) {
		if(name.equals("sab")&& Password.equals("sab"))
			return true;
		return false;
		
	}

}
