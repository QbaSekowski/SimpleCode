package mate.academy;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class KeepHydratedTest {

    @Test @DisplayName("liters(2)")
    public void basicTest1() {
        assertEquals(1, KeepHydrated.liters(2));
    }

    @Test @DisplayName("liters(0.82)")
    public void basicTest2()  {
        assertEquals(0, KeepHydrated.liters(0.82));
    }

    @Test @DisplayName("liters(12.83)")
    public void basicTest3()  {
        assertEquals(6, KeepHydrated.liters(12.83));
    }

    @Test  @DisplayName("liters(1802.44)")
    public void basicTest4()  {
        assertEquals(901, KeepHydrated.liters(1802.44));
    }

    @Test @DisplayName("liters(60)")
    public void basicTest5()  {
        assertEquals(30, KeepHydrated.liters(60));
    }
}