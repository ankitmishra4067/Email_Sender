package Com.Email;

import org.testng.TestNG;


public class TestRunner {
	static TestNG testNg;
	public static void main(String[] args) {
		//Extentreport ext = new Extentreport();
		testNg = new TestNG();
		testNg.setTestClasses(new Class[] {Send_Email_Service.class});
		//testNg.addListener(ext);
		testNg.run();
		

	}

}
