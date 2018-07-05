package bean;

public class Calculator {
	private double num1;
	private double num2;
	private double result;
	
	
	public Calculator() {
		super();
	}


	
	
	public double getNum1() {
		return num1;
	}




	public void setNum1(double num1) {
		this.num1 = num1;
	}




	public double getNum2() {
		return num2;
	}




	public void setNum2(double num2) {
		this.num2 = num2;
	}




	public double getResult() {
		return result;
	}




	public void setResult(double result) {
		this.result = result;
	}







	public String sum() {
		setResult(num1 + num2);
		
		
		return null;
	}
	
	public String sub() {
		setResult(num1 - num2);
		
		return null;
	}
	
	public String multi() {
		setResult(num1 * num2);
		
		
		return null;
	}
	
	public String divi() {
		setResult(num1 / num2);
		
		
		return null;
	}
	
	public String remaider() {
		setResult(num1 % num2);
		
		
		return null;
	}
	
	public String pow() {
		setResult(Math.pow(num1, num2));
		
		
		return null;
	}
	
	
	
	
	
	
	
	
}
