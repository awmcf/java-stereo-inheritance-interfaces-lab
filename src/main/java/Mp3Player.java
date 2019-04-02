public class Mp3Player extends Component{
    private int batteryLevel;

    public Mp3Player (String make, String model, int volume, boolean playStatus, int batteryLevel) {
        super(make, model, volume, playStatus);
        this.batteryLevel = batteryLevel;
    }

    public int getBatteryLevel() {
        return this.batteryLevel;
    }
}
