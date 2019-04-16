package rocks.zipcode.io.objectorientation;

public class Television {
    private Integer channelNumber = 0;
    private TVChannel tvChannel;

    public void turnOn() {
        if(channelNumber < 0) {
            throw new  IllegalStateException();
        }
    }

    public void setChannel(Integer channel) {
        this.channelNumber = channel;
    }

    public TVChannel getChannel() {
        return tvChannel;
    }
}
