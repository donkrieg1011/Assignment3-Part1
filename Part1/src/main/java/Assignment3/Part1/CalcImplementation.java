package Assignment3.Part1;

public class CalcImplementation {
	public CalcInterface intObj;
	
	public int add(int a, int b) {
		return intObj.add(a, b);
	}
	
	public int subtract(int a, int b) {
		return intObj.subtract(a, b);
	}
	
	public int multiply(int a, int b) {
		return intObj.multiply(a, b);
	}
	
	public double divide(int a, int b) {
		return intObj.divide(a, b);
	}
	
	public void setIntObj(CalcInterface intObj) {
		this.intObj= intObj;
	}
}
