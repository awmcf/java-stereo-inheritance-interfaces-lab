public class RecordDeck extends Component {
    private int speed;

    public RecordDeck(String make, String model, int volume, boolean play, int speed) {
        super(make, model, volume, play);
        this.speed = speed;
    }

    public int getSpeed() {
        return this.speed;
    }
}
