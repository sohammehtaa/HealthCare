package utils;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

import patient.Patient;

public class IoUtils {

	public static void storeDetails(String fileName) throws IOException
	{
		try(ObjectOutputStream out= new ObjectOutputStream(new FileOutputStream(fileName)))
		{
			out.writeObject(fileName);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static List<Patient> reStoreDetails(String fileName) throws IOException, ClassNotFoundException
	{
		try(ObjectInputStream in=new ObjectInputStream(new FileInputStream(fileName)))
		{
			return (List<Patient>)in.readObject();
		}
	}
}
