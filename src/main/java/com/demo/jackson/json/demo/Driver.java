package com.demo.jackson.json.demo;

import java.io.File;

import com.fasterxml.jackson.databind.ObjectMapper;

public class Driver {

	public static void main(String[] args) {

		try {
			ObjectMapper mapper = new ObjectMapper();
			
			Student theStudent = mapper.readValue(new File("data/sample-full.json"), Student.class);
			
			System.out.println("FirstName: " + theStudent.getFirstName());
			System.out.println("LastName: " + theStudent.getLastName());

			Address tempAddress = theStudent.getAddress();
			System.out.println("Street: " + tempAddress.getStreet());
			System.out.println("City: " + tempAddress.getCity());
			
			System.out.println("Languages: ");
			for (String tempLang : theStudent.getLanguages()) {
				System.out.print(tempLang + " ");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
