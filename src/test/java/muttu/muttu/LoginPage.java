package muttu.muttu;

import org.apache.log4j.Logger;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class LoginPage {

	Logger logger = Logger.getLogger(LoginPage.class);

	@Test
	@Parameters({ "data", "mine" })
	public void login(@Optional("default") String data, @Optional("Default2") String mine) {

		System.out.println("****************************");
		System.out.println(data + "  " + mine);

		logger.info("Loged in");

		System.out.println("Logged In");

		logger.error("Error");
	}

}
