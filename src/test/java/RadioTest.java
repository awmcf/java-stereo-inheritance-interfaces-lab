import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Pioneer", "RA202", 7, true, "Radio 1");
    }

    @Test
    public void canGetMake() {
        assertEquals("Pioneer", radio.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("RA202", radio.getModel());
    }

    @Test
    public void canGetVolume() {
        assertEquals(7, radio.getVolume());
    }

    @Test
    public void canGetPlayStatus() {
        assertEquals(true, radio.getPlayStatus());
    }


    @Test
    public void canGetStation() {
        assertEquals("Radio 1", radio.getStation());
    }

    @Test
    public void canTune() {
        radio.tune("Radio 2");
        assertEquals("Radio 2", radio.getStation());
    }

}
