import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    @DisplayName("Ensure correct name is displayed")
    @Tag("properties")
    void testName() {
        Person person = new Person("Carlos", 23, 13730, 0, 500);
        assertEquals("Carlos", person.getName());
    }

    @Test
    @DisplayName("Ensure correct money owed is displayed")
    @Tag("properties")
    void testMoneyOwned() {
        Person person = new Person("Carlos", 23, 13730, 0, 500);
        assertEquals(23, person.getAge());
    }

    @Test
    @DisplayName("Ensure correct age is displayed")
    @Tag("properties")
    void testAge() {
        Person person = new Person("Carlos", 23, 13730, 0, 500);
        assertEquals(23, person.getAge());
    }

    @Test
    @DisplayName("Ensure correct balance is displayed")
    @Tag("properties")
    void testBalance() {
        Person person = new Person("Carlos", 23, 13730, 0, 500);
        assertEquals(13730, person.getBalance());
    }

    @Test
    @DisplayName("Ensure correct number of kids is displayed")
    @Tag("properties")
    void testKids() {
        Person person = new Person("Carlos", 23, 13730, 0, 500);
        assertEquals(0, person.getKids());
    }

    @ParameterizedTest
    @ValueSource (ints = { 10, 20, 25, 30 })
    @DisplayName("Ensure a deposit increases the balance")
    @Tag("operations")
    void testDeposit(int n) {
        Person person = new Person("Carlos", 23, 13730, 0, 500);
        try {
            double previousBalance = person.getBalance();
        person.deposit(n);
        assertEquals(person.getBalance(), previousBalance + n);}
        catch (Exception e) {
            assertEquals(e.getMessage(), "Insufficient balance");
        }
    }

    @RepeatedTest(value = 4, name = "{displayName} - repetition {currentRepetition}/{totalRepetitions}")
    @DisplayName("Ensure a withdraw decreases the balance")
    @Tag("operations")
    void testWithdraw(RepetitionInfo repetitionInfo) {
        Person person = new Person("Carlos", 23, 13730, 0, 500);
        try {
            double previousBalance = person.getBalance();
            person.withdraw(10);
            assertEquals(person.getBalance(), previousBalance - 10);
        } catch (InsufficientBalanceException e) {
            assertEquals(e.getMessage(), "Insufficient balance");
        } catch (IllegalArgumentException e) {
            assertEquals(e.getMessage(), "Withdraw quantity must be a positive quantity");
        }
    }
    
    @Test
    @DisplayName("Ensure person can get credit")
    void testCanGetCreditAt100Sureness() {
        Person person = new Person("Carlos", 23, 13730, 0, 0);
        assertTrue(person.canGetCredit());
    }

    @Test
    @DisplayName("Ensure person can get credit")
    void testCanGetCreditAt60Sureness() {
        Person person = new Person("Carlos", 23, 13730, 3, 0);
        assertTrue(person.canGetCredit());
    }

    @Test
    @DisplayName("Ensure person cannot get credit")
    void testCannotGetCreditAt25Sureness() {
        Person person = new Person("Carlos", 23, 13730, 3, 50);
        assertFalse(person.canGetCredit());
    }

    @Test
    @DisplayName("Ensure person cannot get credit")
    void testCannotGetCreditAt30Sureness() {
        Person person = new Person("Carlos", 17, 13730, 0, 50);
        assertFalse(person.canGetCredit());
    }

    @Test
    @DisplayName("Ensure person cannot get credit")
    void testCannotGetCreditAt0Sureness() {
        Person person = new Person("Carlos", 17, 13730, 3, 50);
        assertFalse(person.canGetCredit());
    }
}
