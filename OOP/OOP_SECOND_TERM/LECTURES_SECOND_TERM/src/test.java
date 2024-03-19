import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

// User class representing the user entity
class User {
    private String username;
    private String password;
    private boolean locked;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
        this.locked = false;
    }

    public boolean authenticate(String password) {
        return this.password.equals(password) && !this.locked;
    }

    public boolean is_locked() {
        return this.locked;
    }

    public void reset_password(String new_password) {
        this.password = new_password;
        unlock_user();
    }

    public void lock_user() {
        this.locked = true;
    }

    public void unlock_user() {
        this.locked = false;
    }
}

// Unit tests for User class


// Mock object for successful authent

// Mock object for unsuccessful authentication


