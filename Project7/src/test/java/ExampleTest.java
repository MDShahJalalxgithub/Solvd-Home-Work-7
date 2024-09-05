import org.example.Computer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ExampleTest {

    @Test
    void testComputerFunctionality() {
        Computer computer = new Computer() {
            @Override
            public void displayInfo() {

            }
        };
        // Example assertion
        assertNotNull(computer);
        // Add more assertions based on your Computer class methods
    }
}