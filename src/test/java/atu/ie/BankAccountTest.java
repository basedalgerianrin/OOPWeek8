package atu.ie;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BankAccountTest {

    @Test
    void constructorInitialisation() {
        BankAccount account = new BankAccount("KFMP4", "PAul", 100);
        assertEquals("KFMP4", account.getAccNo());
        assertEquals("PAul", account.getName());
        assertEquals(100, account.getBalance());
    }

    @Test
    void constructorNegativeInitialisation() {
        Exception ex = assertThrows(IllegalArgumentException.class,
                () -> new BankAccount("KFMP4", "PAul", 0));
        assertEquals("Balance must be greater than 0.", ex.getMessage());
    }
}