import org.apache.log4j.Logger;
import org.testng.annotations.Test;

import com.newfw.helper.assertion.AssertionHelper;
import com.newfw.helper.browserconfiguration.config.ObjectReader;
import com.newfw.helper.logger.LoggerHelper;
import com.newfw.pages.LoginPage;
import com.newfw.testbase.TestBase;

public class TestScript1 extends TestBase{
	private final Logger logger = LoggerHelper.getLogger(TestScript1.class);

	@Test
	public void testLogin(){
getApplicationUrl(ObjectReader.reader.getUrl());
		
		LoginPage loginPage = new LoginPage(driver);
		loginPage.checkPageTitle();
	}
}
