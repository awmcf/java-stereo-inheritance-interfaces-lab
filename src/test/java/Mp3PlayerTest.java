import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Mp3PlayerTest {

    Mp3Player mp3Player;

    @Before
    public void before() {
        mp3Player = new Mp3Player("Apple", "iPhone", 11, true, 98);
    }

    @Test
    public void canGetMake() {
        assertEquals("Apple", mp3Player.getMake());
    }

    @Test
    public void canGetModel() {
        assertEquals("iPhone", mp3Player.getModel());
    }

    @Test
    public void canGetVolume() {
        assertEquals(11, mp3Player.getVolume());
    }

    @Test
    public void canGetPlayStatus() {
        assertEquals(true, mp3Player.getPlayStatus());
    }


    @Test
    public void canGetBatteryLevel() {
        assertEquals(98, mp3Player.getBatteryLevel());
    }

}
