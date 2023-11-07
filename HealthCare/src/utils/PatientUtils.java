package utils;


import java.util.ArrayList;
import java.util.List;

import exception.CustomException;
import patient.Patient;

import static exception.Validations.*;

public class PatientUtils {

	public static List<Patient> populatePatient() throws CustomException
	{
		List<Patient> list= new ArrayList<>();
		
		list.add(validateall(1,"krishna",99,"male","nashik","9604461233","loveria","2023-11-07",7000,90000,"ICU"));
		list.add(validateall(2,"soham",21,"male","mumbai","9602221233","fever","2023-11-07",2000,2000000,"GENERAL"));
		list.add(validateall(3,"kaivalya",21,"male","kolhapur","9656461233","dengue","2023-11-07",5000,3000000,"SPECIAL"));
		list.add(validateall(4,"darshika",25,"female","kolhapur","9604465633","cough","2023-11-07",3000,500000,"SEMI_SPECIAL"));
		list.add(validateall(5,"deep",83,"male","punjab","9844461233","cold","2023-11-07",7000,24000,"ICU"));
		list.add(validateall(6,"suyash",23,"male","pune","9673261233","stress","2023-11-07",3000,1100000,"SEMI_SPECIAL"));
		list.add(validateall(7,"samyaka",22,"female","panvel","9601211233","diabetes","2023-11-07",2000,28000,"GENERAL"));
		list.add(validateall(8,"siddharth",76,"male","nagothane","9605678233","loveria","2023-11-07",2000,85000,"GENERAL"));
		list.add(validateall(9,"arjun",27,"male","indraprastha","9608310233","diabetes","2023-11-07",2000,50000,"GENERAL"));
		return list;
	}
}
