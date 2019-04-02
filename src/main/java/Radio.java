public class Radio extends Component {
    private String station;

    public Radio(String make, String model, int volume, boolean playStatus, String station) {
        super(make, model, volume, playStatus);
        this.station = station;
    }

    public String getStation() {
        return this.station;
    }

    public String tune(String newStation) {
        return this.station = newStation;
    }
}
