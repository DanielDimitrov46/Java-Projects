import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class AuthenticationTest {
    @Test
    void testSuccessfulAuthentication() {
        SuccessfulAuthMock mock = new SuccessfulAuthMock();
        assertTrue(mock.authenticate(""));
    }

    @Test
    void testUnsuccessfulAuthentication() {
        UnsuccessfulAuthMock mock = new UnsuccessfulAuthMock();
        assertFalse(mock.authenticate(""));
    }
}