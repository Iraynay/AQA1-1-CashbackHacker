import ru.netology.CashbackHackService;
import org.testng.annotations.Test;
import org.testng.Assert;


public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test

    public  void serviceTestLessThousand () {

        int actual = service.remain(100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
    @Test

    public  void serviceTestOverThousand () {

        int actual = service.remain(1500);
        int expected = 500;

        Assert.assertEquals(actual, expected);
    }
    @Test

    public  void serviceTestOverThousandBorder () {

        int actual = service.remain(1100);
        int expected = 900;

        Assert.assertEquals(actual, expected);
    }
    @Test

    public  void serviceTestLessThousandBorder () {

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(actual, expected);
    }
    @Test

    public  void serviceTestExactlyThousand () {

        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(actual, expected);
    }
}
