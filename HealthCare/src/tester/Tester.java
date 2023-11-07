package tester;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

import patient.Patient;
import patient.roomType;

import static utils.PatientUtils.populatePatient;
import static exception.Validations.*;

public class Tester {

	public static void main(String[] args)
	{
		try(Scanner sc = new Scanner(System.in))
		{
			System.out.println("------->>>>>> Welcome to Iacsd HealthCare <<<<<<-------");
			System.out.println("\n1.Add Patient \n2.Display Patients \n3.Patients elegible for RGY \n4.Display Patients by Room Type \n5.Delete Desease \n6. Change Room \n7.Display Old Patients \n8.Sort by Gender");
			
			try 
			{
				List<Patient> list = populatePatient();
				boolean exit=false;
				
				
				while(!exit) 
				{
				System.out.println("Enter Choice : ");
				switch(sc.nextInt())
				{
					case 1:
						System.out.println("Add Patient");
						System.out.println("serialNo, patientName, age, gender, address, phoneNumber, disease, admitDate, bill, annualIncome, roomType");
						list.add(validateall(sc.nextInt(),sc.next(),sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next(),sc.next(),sc.nextDouble(),sc.nextDouble(),sc.next()));
						System.out.println("Patient Added....!");
						break;
					
					case 2:
						System.out.println("Displaying All Patients");
						list.stream().forEach(System.out::println);
						break;
						
					case 3:
						System.out.println("Display Patients applicable for Rajeev Gandhi Yojana");
						list.stream().filter(p->p.getAnnualIncome()<30000).forEach(System.out::println);
						break;
						
					case 4:
						System.out.println("Display Patient Details of specific room");
						System.out.println("Enter the Room Type: ");
						String type=sc.next();
						for(Patient p:list)
						{
							if(p.getRoom().equals(roomType.valueOf(type.toUpperCase())))
								System.out.println(p);
						}
						
						break;
						
					case 5:
						System.out.println("remove Diabetes");
						list.removeIf(p->p.getDisease().equalsIgnoreCase("diabetes"));
						list.forEach(System.out::println);
						break;
					
					case 6:
						System.out.println("Change ICU to Special room");
						for(Patient p:list)
						{
							if(p.getRoom()==roomType.ICU)
							{
								p.getRoom().setCharges(5000);
								System.out.println(p);
							}
						}
						break;
						
					case 7:
						System.out.println("patients whose age is greater then 75");
						list.stream().filter(p->p.getAge()>75)
						.forEach(p->System.out.println(p));
						break;
						
					case 8:
						System.out.println("Patients sorted by gender");
						list.stream()
						.sorted((p1,p2)->(p1.getGender().compareTo(p2.getGender()))).forEach(p->System.out.println(p));;
						break;
						
					default:
						exit=true;
						break;
						 
				}
				}
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
}
