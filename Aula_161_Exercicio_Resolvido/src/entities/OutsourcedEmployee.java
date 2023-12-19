package entities;

public class OutsourcedEmployee extends Employee {
	
	public double additionalCharge;

	public OutsourcedEmployee() {
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	
	
	public double getAdditionalCharge() {
		return additionalCharge;
	}

	public void setAdditionalCharge(double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}

	@Override
	public double payment() {
		return hours * valuePerHour + additionalCharge * 1.1;
		// Resolução do professor
		// return super.payment() + additionalCharge * 1.1;
	}
	
	
	
	
	
	
	
	
	

}
