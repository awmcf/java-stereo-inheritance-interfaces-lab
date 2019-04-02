public class Stereo implements IConnect {

    private String name;
    protected boolean connectedMp3Status;
    Mp3Player mp3Player;
    Radio radio;
    RecordDeck recordDeck;

    public Stereo(Mp3Player mp3Player, Radio radio, RecordDeck recordDeck, String name, boolean connectedMp3Status) {
        this.mp3Player = mp3Player;
        this.radio = radio;
        this.recordDeck = recordDeck;
        this.name = name;
        this.connectedMp3Status = connectedMp3Status;
    }

    public String getName() {
        return this.name;
    }

    public void connect(Stereo stereo) {
        this.connectedMp3Status = true;
    }
}
