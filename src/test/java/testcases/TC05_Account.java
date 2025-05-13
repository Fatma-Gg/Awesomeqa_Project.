package testcases;

import Pages.P05_AccountPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static util.Utilities.getRandomSearchValue;

public class TC05_Account extends TestBase{
    public static String RandomSearchData = getRandomSearchValue();
    P05_AccountPage AccountObject;

    @Test
    public void VerifySearchForProducts() throws InterruptedException {
        AccountObject = new P05_AccountPage(driver);
        AccountObject.UserSearch(RandomSearchData);
        Assert.assertTrue(AccountObject.GetSearchText());
    }
}
