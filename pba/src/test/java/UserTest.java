import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.justinbambrick.pba.User.User;

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
}
