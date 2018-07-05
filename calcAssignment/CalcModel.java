package calcAssignment;

public class CalcModel {
	
	private double num1;
	private double num2;
	private double result;
	
	
	public CalcModel() {
		super();
	}


	public CalcModel(double num1, double num2) {
		super();
		this.setNum1(num1);
		this.setNum2(num2);
		
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


	
	 public double sum() {
		 
		 result = num1 + num2;
		return result;
	}
	 
	 public double sub() {
		 result = num1 - num2;
		 return result;
	 }
	 
	public double multi() {
		 result = num1 * num2;
		 return result;
	}
	
	public double divide() {
		 result = num1 / num2;
		 return result;
	}
	
	public double remainder() {
		 result = num1 % num2;
		 return result;
	}
	
	public double power() {
		 result = Math.pow(num1, num2);
		 return result;
	}

}
