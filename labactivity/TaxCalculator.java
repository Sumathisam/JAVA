public class TaxCalculator {
	String empName;
	boolean isIndian;
	double empSal;
	double taxAmount;
	public TaxCalculator(String empName, boolean isIndian, double empSal) {
	this.empName = empName;
	this.isIndian = isIndian;
	this.empSal = empSal;
	}
	public double calculateTax() throws Exception {
	if (isIndian==false) {
	throw new CountryNotValidException(isIndian);
	}
	if (empName==null) {
	throw new EmployeeNameInvalidException(empName);
	}
	if (empSal>100000) {
	taxAmount = empSal*8/100;
	}
	if (empSal>50000&&empSal<100000&&isIndian==true) {
	taxAmount = empSal*6/100;	
	}
	if (empSal>30000&&empSal<50000&&isIndian==true) {
	taxAmount = empSal*5/100;	
	}
	if (empSal>30000&&empSal<50000&&isIndian==true) {
	taxAmount = empSal*4/100;
	}
	else {
	class TaxNotEligibleException extends Exception {
	public TaxNotEligibleException(){
	super();
	}
	}
	}
	return taxAmount;
	}
	}
public class CountryNotValidException extends Exception {
public CountryNotValidException(boolean isIndian) {
super();	
}
}


public class EmployeeNameInvalidException extends Exception {
public EmployeeNameInvalidException(String empName) {
super();
}
}
public class CalculatorSimulator {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
			TaxCalculator Tc1 = new TaxCalculator("Ron",false,34000);
			Tc1.calculateTax();
			} catch (CountryNotValidException e) {
			System.out.println(e);
			}
			finally{
			System.out.println("The employee should be an indian for calculating tax");
			}
			TaxCalculator Tc2 = new TaxCalculator("Tim",true,1000);
			Tc2.calculateTax();
			TaxCalculator Tc3 = new TaxCalculator("Jack",true,55000);
			Tc3.calculateTax();
			TaxCalculator Tc4 = new TaxCalculator("",true,30000);
			Tc4.calculateTax();
			}
			}