package patient;

import java.time.LocalDate;

public class Patient {

	public roomType getRoom() {
		return room;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public String getDisease() {
		return disease;
	}

	private int serialNo;
	private String patientName;
	private int age;
	private String gender;
	private String address;
	private String phoneNumber;
	private String disease;
	private LocalDate admitDate;
	private double bill;
	private double annualIncome;
	private roomType room;
	
	public Patient(int serialNo, String patientName, int age, String gender, String address, String phoneNumber,
			String disease, LocalDate admitDate, double bill, double annualIncome, roomType room) {
		super();
		this.serialNo = serialNo;
		this.patientName = patientName;
		this.age = age;
		this.gender = gender;
		this.address = address;
		this.phoneNumber = phoneNumber;
		this.disease = disease;
		this.admitDate = admitDate;
		this.bill = bill;
		this.annualIncome = annualIncome;
		this.room = room;
	}

	public double getAnnualIncome() {
		return annualIncome;
	}

	@Override
	public String toString() {
		return "Patient [serialNo=" + serialNo + ", patientName=" + patientName + ", age=" + age + ", gender=" + gender
				+ ", address=" + address + ", phoneNumber=" + phoneNumber + ", disease=" + disease + ", admitDate="
				+ admitDate + ", bill=" + bill + ", annualIncome=" + annualIncome + ", room=" + room + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Patient)
			{
			Patient other = (Patient) obj;
			return this.serialNo==other.serialNo;
			}
			
		return false;
	}
	
	
	
}
