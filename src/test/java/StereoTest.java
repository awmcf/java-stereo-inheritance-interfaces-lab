import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Radio radio;
    Mp3Player mp3Player;
    RecordDeck recordDeck;

    @Before
    public void before() {
        mp3Player = new Mp3Player("Apple", "iPhone", 11, true, 98);
        radio = new Radio("Pioneer", "RA202", 7, true, "Radio 1");
        recordDeck = new RecordDeck("Sony", "RD101", 5, true, 33 );
        stereo = new Stereo(mp3Player, radio, recordDeck, "Panasonic Ultimate System", false);
    }

    @Test
    public void canGetStereoName() {
        assertEquals("Panasonic Ultimate System", stereo.getName());
    }

    @Test
    public void canGetRadioStation() {
        assertEquals("Radio 1", stereo.radio.getStation());
    }

    @Test
    public void canGetRecordDeckSpeed() {
        assertEquals(33, stereo.recordDeck.getSpeed());
    }

    @Test
    public void canRaiseRadioVolume() {
        stereo.radio.raiseVolume(2);
        assertEquals(9, stereo.radio.getVolume());
    }

    @Test
    public void canLowerRecordDeckVolume() {
        stereo.recordDeck.lowerVolume(3);
        assertEquals(2, stereo.recordDeck.getVolume());
    }

    @Test
    public void canConnectMp3Player() {
        stereo.connect(stereo);
        assertEquals(true, stereo.connectedMp3Status);
    }
}
