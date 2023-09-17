import model.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;
import runner.BaseTest;

public class MenWareTest extends BaseTest {
    @Test
    public void testOpenMenWarePage() {
        String pageHeader = new HomePage(getDriver())
                .getMenWarePage()
                .getHeader();
        Assert.assertEquals(pageHeader, "Men");
    }
}
