import static org.junit.Assert.assertTrue;

import java.util.Currency;
import java.util.Date;

import org.junit.Test;

import com.justinbambrick.pba.Bills.Bill;
import com.justinbambrick.pba.User.User;
import com.justinbambrick.pba.sources.Frequency;

public class UserTest {
    @Test
    public void shouldSetUserName() {
        // Arrange
        String firstName = "Blake";

        String lastName = "Sellars";

        String expectedFullName = "Blake Sellars";

        User dummyUser = new User(firstName, lastName);

        // act
        String result = dummyUser.getName();

        // assert

        assertTrue(result.equals(expectedFullName));
    }

    @Test
    public void shouldAddABill() {
        // arrange
        String id;

        String name;

        Frequency frequency;

        Currency currency;

        Date date;

        double amount = 98.22;

        double expectedAmount = 98.22;

        Bill dummyBill = new Bill(null, null, expectedAmount, null, null);
        // act

        // assert
    }
}
