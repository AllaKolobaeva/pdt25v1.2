package com.example.tests;

import org.testng.annotations.Test;

public class ContactCreationTests extends TestBase {

	@Test
	public void testValidGroupCanBeCreated() throws Exception {
		ContactObject validContact = new ContactObject("a", "b", "", "c", "d", "e","f", "g", "1", "January", "1990", "group 1", "i", "g");
		createContact(validContact);
		
	}

	@Test
	public void testContactWithEmptyDataCanBeCreated() throws Exception {
		ContactObject emptyContact = new ContactObject("", "", "", "", "", "", "", "", "-", "-", "", "", "", "");
		createContact(emptyContact);
	}
}
