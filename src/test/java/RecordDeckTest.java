import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RecordDeckTest {

    RecordDeck recordDeck;

    @Before
    public void before() {
        recordDeck = new RecordDeck("Sony", "RD101", 5, true, 33 );
    }

    @Test
    public void canGetMake() {
        assertEquals("Sony", recordDeck.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("RD101", recordDeck.getModel());
    }

    @Test
    public void canGetVolume() {
        assertEquals(5, recordDeck.getVolume());
    }

    @Test
    public void canGetPlayStatus() {
        assertEquals(true, recordDeck.getPlayStatus());
    }


    @Test
    public void canGetSpeed() {
        assertEquals(33, recordDeck.getSpeed());
    }

}
