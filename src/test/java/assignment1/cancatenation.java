package assignment1;

import java.util.Scanner;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class cancatenation {
	
	@Parameters({"fname","lname"})
	@Test
	
	public void fullnanme(String fname,String lname) {
		String fullname="Hello "+fname+" "+lname;
		Assert.assertEquals(fullname, ("Hello "+fname+" "+lname));
	}
}
