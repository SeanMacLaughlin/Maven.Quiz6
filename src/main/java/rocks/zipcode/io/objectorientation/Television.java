package rocks.zipcode.io.objectorientation;

public class Television {
    private Integer channel;
    private TVChannel tvChannel;

    public void turnOn() {
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public TVChannel getChannel() {
        return tvChannel;
    }
}
