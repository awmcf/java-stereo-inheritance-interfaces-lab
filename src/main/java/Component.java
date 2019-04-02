public abstract class Component {
    protected String make;
    protected String model;
    protected int volume;
    protected boolean playStatus;

    public Component(String make, String model, int volume, boolean playStatus) {
        this.make = make;
        this.model = model;
        this.volume = volume;
        this.playStatus = playStatus;
    }

    public String getMake() {
        return this.make;
    }

    public String getModel() {
        return this.model;
    }

    public int getVolume() {
        return this.volume;
    }

    public boolean getPlayStatus() {
        return this.playStatus;
    }

    public void raiseVolume(int volumeIncrease) {
        this.volume += volumeIncrease;
    }

    public void lowerVolume(int volumeDecrease) {
        this.volume -= volumeDecrease;
    }
}
