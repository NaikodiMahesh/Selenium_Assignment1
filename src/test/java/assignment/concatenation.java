package assignment;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class concatenation {

	
	@Parameters({"fname","lname"})
	@Test
	public void fullname(String fname,String lname) {
		
		String fullName="Hello "+fname+lname;
		Assert.assertEquals(fullName, ("Hello "+fname+lname));
		
	}
}
