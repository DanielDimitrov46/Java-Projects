import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class zad2 {
    @Test
    void testAuthenticate_Success() {
        User user = new User("testUser", "password");
        assertTrue(user.authenticate("password"));
    }

    @Test
    void testAuthenticate_Failure() {
        User user = new User("testUser", "password");
        user.lock_user(); // Simulating a locked user
        assertFalse(user.authenticate("password"));
    }

    @Test
    void testLockUser() {
        User user = new User("testUser", "password");
        user.lock_user();
        assertTrue(user.is_locked());
    }

    @Test
    void testUnlockUser() {
        User user = new User("testUser", "password");
        user.lock_user();
        user.unlock_user();
        assertFalse(user.is_locked());
    }

    @Test
    void testResetPasswordAndUnlock() {
        User user = new User("testUser", "password");
        user.lock_user(); // Lock the user
        user.reset_password("newPassword");
        assertFalse(user.is_locked()); // Should be unlocked after password reset
    }
}