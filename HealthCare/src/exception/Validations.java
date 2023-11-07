package exception;

import java.time.LocalDate;

import patient.Patient;
import patient.roomType;

public class Validations {

	public static LocalDate validateAdmitDate(String admitDate) throws CustomException
	{
		LocalDate xAdmitDate=LocalDate.parse(admitDate);
		
		if(!xAdmitDate.equals(LocalDate.now()))
			throw new CustomException("Invalid Admit Date!");
		return xAdmitDate;
	}
	
	public static roomType validateRoom(String room) throws CustomException 
	{
		return roomType.valueOf(room.toUpperCase());
	}
	
	public static void validateAmount(roomType r, double bill) throws CustomException
	{
			if(r.getCharges()!=bill)
				throw new CustomException("Invalid Bill!");
	}
	
	public static Patient validateall(int serialNo, String patientName, int age, String gender, String address, String phoneNumber,
			String disease, String admitDate, double bill, double annualIncome, String room) throws CustomException
	{
		roomType xroom=validateRoom(room);
		LocalDate xAdmitDate= validateAdmitDate( admitDate);
		validateAmount(xroom,bill);
		
		return new Patient( serialNo,  patientName,  age,  gender,  address,  phoneNumber,
				 disease,  xAdmitDate,  bill,  annualIncome,  xroom);
	}
}
