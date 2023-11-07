package patient;

public enum roomType {
	GENERAL(2000),SPECIAL(5000),SEMI_SPECIAL(3000),ICU(7000);
	private double charges;
	
	roomType(double charges)
	{
		this.charges=charges;
	}

	public double getCharges() {
		return charges;
	}

	public void setCharges(double charges) {
		this.charges = charges;
	}
}
